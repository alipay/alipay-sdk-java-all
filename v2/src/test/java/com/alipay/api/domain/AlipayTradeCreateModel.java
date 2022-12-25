package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import java.util.List;

/**
 * 商户通过该接口进行交易的创建下单
 *
 * @author auto create
 * @since 1.0, 2019-07-15 17:17:13
 */
public class AlipayTradeCreateModel extends AlipayObject {

    private static final long serialVersionUID = 4636145693348273247L;

    /**
     * 支付宝的店铺编号
     */
    @ApiField("alipay_store_id")
    private String alipayStoreId;

    /**
     * 对交易或商品的描述
     */
    @ApiField("body")
    private String body;

    /**
     * 商户传入业务信息，具体值要和支付宝约定，应用于安全，营销等参数直传场景，格式为json格式
     */
    @ApiField("business_params")
    private BusinessParams businessParams;

    /**
     * 买家的支付宝唯一用户号（2088开头的16位纯数字）
     */
    @ApiField("buyer_id")
    private String buyerId;

    /**
     * 买家支付宝账号，和buyer_id不能同时为空
     */
    @ApiField("buyer_logon_id")
    private String buyerLogonId;

    /**
     * 禁用渠道,用户不可用指定渠道支付，多个渠道以逗号分割 注，与enable_pay_channels互斥
     * <a href="https://docs.open.alipay.com/common/wifww7">渠道列表</a>
     */
    @ApiField("disable_pay_channels")
    private String disablePayChannels;

    /**
     * 可打折金额. 参与优惠计算的金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000] 如果该值未传入，但传入了【订单总金额】，【不可打折金额】则该值默认为【订单总金额】-【不可打折金额】
     */
    @ApiField("discountable_amount")
    private String discountableAmount;

    /**
     * 可用渠道,用户只能在指定渠道范围内支付，多个渠道以逗号分割 注，与disable_pay_channels互斥 渠道列表：https://docs.open.alipay.com/common/wifww7
     */
    @ApiField("enable_pay_channels")
    private String enablePayChannels;

    /**
     * 外部指定买家
     */
    @ApiField("ext_user_info")
    private ExtUserInfo extUserInfo;

    /**
     * 业务扩展参数
     */
    @ApiField("extend_params")
    private ExtendParams extendParams;

    /**
     * 订单包含的商品列表信息，json格式，其它说明详见：“商品明细说明”
     */
    @ApiListField("goods_detail")
    @ApiField("goods_detail")
    private List<GoodsDetail> goodsDetail;

    /**
     * 物流信息
     */
    @ApiField("logistics_detail")
    private LogisticsDetail logisticsDetail;

    /**
     * 商户原始订单号，最大长度限制32位
     */
    @ApiField("merchant_order_no")
    private String merchantOrderNo;

    /**
     * 商户操作员编号
     */
    @ApiField("operator_id")
    private String operatorId;

    /**
     * 商户订单号,64个字符以内、只能包含字母、数字、下划线；需保证在商户端不重复
     */
    @ApiField("out_trade_no")
    private String outTradeNo;

    /**
     * 销售产品码。 如果签约的是当面付快捷版，则传OFFLINE_PAYMENT; 其它支付宝当面付产品传FACE_TO_FACE_PAYMENT； 不传默认使用FACE_TO_FACE_PAYMENT；
     */
    @ApiField("product_code")
    private String productCode;

    /**
     * 收货人及地址信息
     */
    @ApiField("receiver_address_info")
    private ReceiverAddressInfo receiverAddressInfo;

    /**
     * 描述分账信息，json格式。
     */
    @ApiField("royalty_info")
    private RoyaltyInfo royaltyInfo;

    /**
     * 卖家支付宝用户ID。 如果该值为空，则默认为商户签约账号对应的支付宝用户ID
     */
    @ApiField("seller_id")
    private String sellerId;

    /**
     * 描述结算信息，json格式，详见结算参数说明
     */
    @ApiField("settle_info")
    private SettleInfo settleInfo;

    /**
     * 商户门店编号
     */
    @ApiField("store_id")
    private String storeId;

    /**
     * 二级商户信息,当前只对特殊银行机构特定场景下使用此字段
     */
    @ApiField("sub_merchant")
    private SubMerchant subMerchant;

    /**
     * 订单标题
     */
    @ApiField("subject")
    private String subject;

    /**
     * 商户机具终端编号
     */
    @ApiField("terminal_id")
    private String terminalId;

    /**
     * 该笔订单允许的最晚付款时间，逾期将关闭交易。取值范围：1m～15d。m-分钟，h-小时，d-天，1c-当天（1c-当天的情况下，无论交易何时创建，都在0点关闭）。 该参数数值不接受小数点， 如 1.5h，可转换为 90m。
     */
    @ApiField("timeout_express")
    private String timeoutExpress;

    /**
     * 订单总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000] 如果同时传入了【打折金额】，【不可打折金额】，【订单总金额】三者，则必须满足如下条件：【订单总金额】=【打折金额】+【不可打折金额】
     */
    @ApiField("total_amount")
    private String totalAmount;

    /**
     * 不可打折金额. 不参与优惠计算的金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000] 如果该值未传入，但传入了【订单总金额】,【打折金额】，则该值默认为【订单总金额】-【打折金额】
     */
    @ApiField("undiscountable_amount")
    private String undiscountableAmount;

    public String getAlipayStoreId() {
        return this.alipayStoreId;
    }

    public void setAlipayStoreId(String alipayStoreId) {
        this.alipayStoreId = alipayStoreId;
    }

    public String getBody() {
        return this.body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public BusinessParams getBusinessParams() {
        return this.businessParams;
    }

    public void setBusinessParams(BusinessParams businessParams) {
        this.businessParams = businessParams;
    }

    public String getBuyerId() {
        return this.buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public String getBuyerLogonId() {
        return this.buyerLogonId;
    }

    public void setBuyerLogonId(String buyerLogonId) {
        this.buyerLogonId = buyerLogonId;
    }

    public String getDisablePayChannels() {
        return this.disablePayChannels;
    }

    public void setDisablePayChannels(String disablePayChannels) {
        this.disablePayChannels = disablePayChannels;
    }

    public String getDiscountableAmount() {
        return this.discountableAmount;
    }

    public void setDiscountableAmount(String discountableAmount) {
        this.discountableAmount = discountableAmount;
    }

    public String getEnablePayChannels() {
        return this.enablePayChannels;
    }

    public void setEnablePayChannels(String enablePayChannels) {
        this.enablePayChannels = enablePayChannels;
    }

    public ExtUserInfo getExtUserInfo() {
        return this.extUserInfo;
    }

    public void setExtUserInfo(ExtUserInfo extUserInfo) {
        this.extUserInfo = extUserInfo;
    }

    public ExtendParams getExtendParams() {
        return this.extendParams;
    }

    public void setExtendParams(ExtendParams extendParams) {
        this.extendParams = extendParams;
    }

    public List<GoodsDetail> getGoodsDetail() {
        return this.goodsDetail;
    }

    public void setGoodsDetail(List<GoodsDetail> goodsDetail) {
        this.goodsDetail = goodsDetail;
    }

    public LogisticsDetail getLogisticsDetail() {
        return this.logisticsDetail;
    }

    public void setLogisticsDetail(LogisticsDetail logisticsDetail) {
        this.logisticsDetail = logisticsDetail;
    }

    public String getMerchantOrderNo() {
        return this.merchantOrderNo;
    }

    public void setMerchantOrderNo(String merchantOrderNo) {
        this.merchantOrderNo = merchantOrderNo;
    }

    public String getOperatorId() {
        return this.operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public String getOutTradeNo() {
        return this.outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public String getProductCode() {
        return this.productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public ReceiverAddressInfo getReceiverAddressInfo() {
        return this.receiverAddressInfo;
    }

    public void setReceiverAddressInfo(ReceiverAddressInfo receiverAddressInfo) {
        this.receiverAddressInfo = receiverAddressInfo;
    }

    public RoyaltyInfo getRoyaltyInfo() {
        return this.royaltyInfo;
    }

    public void setRoyaltyInfo(RoyaltyInfo royaltyInfo) {
        this.royaltyInfo = royaltyInfo;
    }

    public String getSellerId() {
        return this.sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public SettleInfo getSettleInfo() {
        return this.settleInfo;
    }

    public void setSettleInfo(SettleInfo settleInfo) {
        this.settleInfo = settleInfo;
    }

    public String getStoreId() {
        return this.storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public SubMerchant getSubMerchant() {
        return this.subMerchant;
    }

    public void setSubMerchant(SubMerchant subMerchant) {
        this.subMerchant = subMerchant;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTerminalId() {
        return this.terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getTimeoutExpress() {
        return this.timeoutExpress;
    }

    public void setTimeoutExpress(String timeoutExpress) {
        this.timeoutExpress = timeoutExpress;
    }

    public String getTotalAmount() {
        return this.totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getUndiscountableAmount() {
        return this.undiscountableAmount;
    }

    public void setUndiscountableAmount(String undiscountableAmount) {
        this.undiscountableAmount = undiscountableAmount;
    }

}
