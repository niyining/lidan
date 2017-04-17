package com.travelzen.framework.thrift.protocol;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TMessage;
import org.apache.thrift.protocol.TMessageType;
import org.apache.thrift.protocol.TProtocol;

/**
 * <code>TMultiplexedProtocol</code> is a protocol-independent concrete decorator
 * that allows a Thrift client to communicate with a multiplexing Thrift server,
 * by prepending the service name to the function name during function calls.
 *
 * <p>NOTE: THIS IS NOT USED BY SERVERS.  On the server, use {@TMultiplexedProcessor TMultiplexedProcessor} to handle requests
 * from a multiplexing client.
 *
 * <p>This example uses a single socket transport to invoke two services:
 *
 * <blockquote><code>
 *     TSocket transport = new TSocket("localhost", 9090);<br/>
 *     transport.open();<br/>
 *<br/>
 *     TBinaryProtocol protocol = new TBinaryProtocol(transport);<br/>
 *<br/>
 *     TMultiplexedProtocol mp = new TMultiplexedProtocol(protocol, "Calculator");<br/>
 *     Calculator.Client service = new Calculator.Client(mp);<br/>
 *<br/>
 *     TMultiplexedProtocol mp2 = new TMultiplexedProtocol(protocol, "WeatherReport");<br/>
 *     WeatherReport.Client service2 = new WeatherReport.Client(mp2);<br/>
 *<br/>
 *     System.out.println(service.add(2,2));<br/>
 *     System.out.println(service2.getTemperature());<br/>
 * </code></blockquote>
 *
 * @see TProtocolDecorator
 */
public class TMultiplexedProtocol extends TProtocolDecorator {

    /** Used to delimit the service name from the function name */
    public static final String SEPARATOR = ":";

    private final String SERVICE_NAME;

    /**
     * Wrap the specified protocol, allowing it to be used to communicate with a
     * multiplexing server.  The <code>serviceName</code> is required as it is
     * prepended to the message header so that the multiplexing server can broker
     * the function call to the proper service.
     *
     * @param protocol Your communication protocol of choice, e.g. <code>TBinaryProtocol</code>.
     * @param serviceName The service name of the service communicating via this protocol.
     */
    public TMultiplexedProtocol(TProtocol protocol, String serviceName) {
        super(protocol);
        SERVICE_NAME = serviceName;
    }

    /**
     * Prepends the service name to the function name, separated by TMultiplexedProtocol.SEPARATOR.
     *
     * @param tMessage The original message.
     * @throws TException Passed through from wrapped <code>TProtocol</code> instance.
     */
    @Override
    public void writeMessageBegin(TMessage tMessage) throws TException {
        if (tMessage.type == TMessageType.CALL || tMessage.type == TMessageType.ONEWAY) {
            super.writeMessageBegin(new TMessage(
                    SERVICE_NAME + SEPARATOR + tMessage.name,
                    tMessage.type,
                    tMessage.seqid
            ));
        } else {
            super.writeMessageBegin(tMessage);
        }
    }
}
