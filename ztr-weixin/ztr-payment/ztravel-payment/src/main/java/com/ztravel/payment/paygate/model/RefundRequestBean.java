package com.ztravel.payment.paygate.model;

/**
 * @author zuoning.shen
 *
 */
public class RefundRequestBean extends RequestBean {
	/** 标识当前退款业务,required */
	private String refundNum;
	/** 退款时间(yyyy-MM-dd HH:mm:ss),required for alipay */
	private String refundTime;
	/** 原订单号,required */
	private String orderNum;
	/** 原交易号,required */
	private String traceNum;
	/** 原支付金额(以分为单位),required */
	private long transAmount;
	/** 本次退款金额,required */
	private long refundAmount;
	/** 退款备注,optional */
	private String comment;
	/** 退分润的信息:格式为：分润方账号|退分润金额|备注,optional(退款同时退分润需要该参数) */
	private String refundProfitDetails;
	
	public String getRefundNum() {
		return refundNum;
	}

	public void setRefundNum(String refundNum) {
		this.refundNum = refundNum;
	}

	public String getRefundTime() {
		return refundTime;
	}

	public void setRefundTime(String refundTime) {
		this.refundTime = refundTime;
	}

	public String getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}

	public String getTraceNum() {
		return traceNum;
	}

	public void setTraceNum(String traceNum) {
		this.traceNum = traceNum;
	}

	public long getTransAmount() {
		return transAmount;
	}

	public void setTransAmount(long transAmount) {
		this.transAmount = transAmount;
	}

	public long getRefundAmount() {
		return refundAmount;
	}

	public void setRefundAmount(long refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getRefundProfitDetails() {
		return refundProfitDetails;
	}

	public void setRefundProfitDetails(String refundProfitDetails) {
		this.refundProfitDetails = refundProfitDetails;
	}

}
