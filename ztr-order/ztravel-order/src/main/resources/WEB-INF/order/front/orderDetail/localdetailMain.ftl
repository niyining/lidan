<#import "/common/front/header/navHeader.ftl" as html/>
<#import "/order/front/orderDetail/localOrderStatusFlow.ftl" as orderStatus/>
<#import "/order/front/orderDetail/productInfo.ftl" as productInfo/>
<#import "/order/front/orderDetail/contactorInfo.ftl" as contactorInfo/>
<#import "/order/front/orderDetail/passengerInfo.ftl" as passengerInfo/>
<#import "/order/front/orderDetail/localAdditionalInfos.ftl" as additionalInfos/>
<#import "/order/front/orderDetail/priceInfo.ftl" as priceInfo/>


<@html.navHeader
title="真旅行-订单详情"
currentMenu="我的订单"
remoteJsFiles=["js/vendor/bootstrap-datepicker.min.js","js/vendor/bootstrap-datepicker.zh-CN.min.js"]
remoteCssFiles=["css/client/orderInfo.css","css/bootstrap-datepicker.min.css"]
localJsFiles=["order/front/orderDetail/localDetail.js","common/typeahead.js","order/front/orderDetail/validation.js"]
localCssFiles=[]>

    <div class="main-wrapper" id="main-wrapper">
    <input type="hidden" name="orderId" value="${(orderDetail.order.orderId)!}">
    <@orderStatus.orderStatus />

        <section class="onLinePayContent">
            <div class="top-border"></div>
            <@productInfo.productInfo />
            <@contactorInfo.contactorInfo />
            <@passengerInfo.passengerInfo />
            <@additionalInfos.additionalInfos />
            <@priceInfo.priceInfo />

        </section>
    </div>

<script type="text/html" id="whiteOrder_template">
    <div class="statusHint">请仔细填写游客信息</div>
</script>
<script type="text/html" id="payOrder_template">
    <div class="statusHint">打开荷包，来一场说走就走的旅行吧</div>
</script>
<script type="text/html" id="paySuccess_template">
    <div class="statusHint">支付成功，真小行马上去给您确认产品</div>
</script>
<script type="text/html" id="confirm_template">
    <div class="statusHint">产品已确认，收拾行囊准备出发吧</div>
</script>


<script>
    $(function(){
        //导航状态浮层
        $(".orderStatus .whiteOrder").attr("title", $("#whiteOrder_template").html());
        $(".orderStatus .payOrder").attr("title", $("#payOrder_template").html());
        $(".orderStatus .paySuccess").attr("title", $("#paySuccess_template").html());
        $(".orderStatus .box").attr("title", $("#confirm_template").html());
        $(".green-border-tooltip").tooltip({
            html: true,
            placement: 'bottom',
            template: '<div class="tooltip green-border-tooltip" role="tooltip"><div class="tooltip-arrow"></div><div class="tooltip-inner"></div></div>'
        });

    });
</script>
</@html.navHeader>