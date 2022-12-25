package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * app支付接口2.0
 *
 * @author auto create
 * @since 1.0, 2019-07-19 11:59:12
 */
public class AlipayTradeAppPayModel extends AlipayObject {

    private static final long serialVersionUID = 6864142225874893983L;

    /**
     * 签约参数。如果希望在sdk中支付并签约，需要在这里传入签约信息。
     */
    @ApiField("agreement_sign_params")
    private SignParams agreementSignParams;

    /**
     * 对一笔交易的具体描述信息。如果是多种商品，请将商品描述字符串累加传给body。
     */
    @ApiField("body")
    private String body;

    /**
     * 商户传入业务信息，具体值要和支付宝约定，应用于安全，营销等参数直传场景，格式为json格式
     */
    @ApiField("business_params")
    private String businessParams;

    /**
     * 禁用渠道，用户不可用指定渠道支付 当有多个渠道时用“,”分隔 注，与enable_pay_channels互斥
     */
    @ApiField("disable_pay_channels")
    private String disablePayChannels;

    /**
     * 可用渠道，用户只能在指定渠道范围内支付 当有多个渠道时用“,”分隔 注，与disable_pay_channels互斥
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
     * 商品主类型 :0-虚拟类商品,1-实物类商品
     */
    @ApiField("goods_type")
    private String goodsType;

    /**
     * 开票信息
     */
    @ApiField("invoice_info")
    private InvoiceInfo invoiceInfo;

    /**
     * 商户原始订单号，最大长度限制32位
     */
    @ApiField("merchant_order_no")
    private String merchantOrderNo;

    /**
     * 商户网站唯一订单号
     */
    @ApiField("out_trade_no")
    private String outTradeNo;

    /**
     * 公用回传参数，如果请求时传递了该参数，则返回给商户时会回传该参数。支付宝只会在同步返回（包括跳转回商户网站）和异步通知时将该参数原样返回。本参数必须进行UrlEncode之后才可以发送给支付宝。
     */
    @ApiField("passback_params")
    private String passbackParams;

    /**
     * 销售产品码，商家和支付宝签约的产品码
     */
    @ApiField("product_code")
    private String productCode;

    /**
     * 优惠参数 注：仅与支付宝协商后可用
     */
    @ApiField("promo_params")
    private String promoParams;

    /**
     * 描述分账信息，json格式，详见分账参数说明
     */
    @ApiField("royalty_info")
    private RoyaltyInfo royaltyInfo;

    /**
     * 收款支付宝用户ID。 如果该值为空，则默认为商户签约账号对应的支付宝用户ID
     */
    @ApiField("seller_id")
    private String sellerId;

    /**
     * 描述结算信息，json格式，详见结算参数说明
     */
    @ApiField("settle_info")
    private SettleInfo settleInfo;

    /**
     * 指定渠道，目前仅支持传入pcredit 若由于用户原因渠道不可用，用户可选择是否用其他渠道支付。 注：该参数不可与花呗分期参数同时传入
     */
    @ApiField("specified_channel")
    private String specifiedChannel;

    /**
     * 商户门店编号
     */
    @ApiField("store_id")
    private String storeId;

    /**
     * 间连受理商户信息体，当前只对特殊银行机构特定场景下使用此字段
     */
    @ApiField("sub_merchant")
    private SubMerchant subMerchant;

    /**
     * 商品的标题/交易标题/订单标题/订单关键字等。
     */
    @ApiField("subject")
    private String subject;

    /**
     * 绝对超时时间，格式为yyyy-MM-dd HH:mm。
     */
    @ApiField("time_expire")
    private String timeExpire;

    /**
     * 该笔订单允许的最晚付款时间，逾期将关闭交易。取值范围：1m～15d。m-分钟，h-小时，d-天，1c-当天（1c-当天的情况下，无论交易何时创建，都在0点关闭）。 该参数数值不接受小数点， 如 1.5h，可转换为 90m。
     */
    @ApiField("timeout_express")
    private String timeoutExpress;

    /**
     * 订单总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
     */
    @ApiField("total_amount")
    private String totalAmount;

    public SignParams getAgreementSignParams() {
        return this.agreementSignParams;
    }

    public void setAgreementSignParams(SignParams agreementSignParams) {
        this.agreementSignParams = agreementSignParams;
    }

    public String getBody() {
        return this.body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getBusinessParams() {
        return this.businessParams;
    }

    public void setBusinessParams(String businessParams) {
        this.businessParams = businessParams;
    }

    public String getDisablePayChannels() {
        return this.disablePayChannels;
    }

    public void setDisablePayChannels(String disablePayChannels) {
        this.disablePayChannels = disablePayChannels;
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

    public String getGoodsType() {
        return this.goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    public InvoiceInfo getInvoiceInfo() {
        return this.invoiceInfo;
    }

    public void setInvoiceInfo(InvoiceInfo invoiceInfo) {
        this.invoiceInfo = invoiceInfo;
    }

    public String getMerchantOrderNo() {
        return this.merchantOrderNo;
    }

    public void setMerchantOrderNo(String merchantOrderNo) {
        this.merchantOrderNo = merchantOrderNo;
    }

    public String getOutTradeNo() {
        return this.outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public String getPassbackParams() {
        return this.passbackParams;
    }

    public void setPassbackParams(String passbackParams) {
        this.passbackParams = passbackParams;
    }

    public String getProductCode() {
        return this.productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getPromoParams() {
        return this.promoParams;
    }

    public void setPromoParams(String promoParams) {
        this.promoParams = promoParams;
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

    public String getSpecifiedChannel() {
        return this.specifiedChannel;
    }

    public void setSpecifiedChannel(String specifiedChannel) {
        this.specifiedChannel = specifiedChannel;
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

    public String getTimeExpire() {
        return this.timeExpire;
    }

    public void setTimeExpire(String timeExpire) {
        this.timeExpire = timeExpire;
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
}
