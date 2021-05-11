package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 统一收单下单并支付页面接口
 *
 * @author auto create
 * @since 1.0, 2021-03-19 15:26:22
 */
public class AlipayTradePagePayModel extends AlipayObject {

	private static final long serialVersionUID = 1685147363538662749L;

	/**
	 * 签约参数，支付后签约场景使用
	 */
	@ApiField("agreement_sign_params")
	private AgreementSignParams agreementSignParams;

	/**
	 * 订单描述
	 */
	@ApiField("body")
	private String body;

	/**
	 * 商户传入业务信息，具体值要和支付宝约定，应用于安全，营销等参数直传场景，格式为json格式
	 */
	@ApiField("business_params")
	private String businessParams;

	/**
	 * 禁用渠道,用户不可用指定渠道支付，多个渠道以逗号分割
注，与enable_pay_channels互斥
渠道列表：https://docs.open.alipay.com/common/wifww7
	 */
	@ApiField("disable_pay_channels")
	private String disablePayChannels;

	/**
	 * 可用渠道,用户只能在指定渠道范围内支付，多个渠道以逗号分割
注，与disable_pay_channels互斥
渠道列表：https://docs.open.alipay.com/common/wifww7
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
	 * 订单包含的商品列表信息，json格式。
	 */
	@ApiListField("goods_detail")
	@ApiField("goods_detail")
	private List<GoodsDetail> goodsDetail;

	/**
	 * 商品主类型 ，枚举支持：
0：虚拟类商品；
1：实物类商品。
注：虚拟类商品不支持使用花呗渠道
	 */
	@ApiField("goods_type")
	private String goodsType;

	/**
	 * 请求后页面的集成方式。
取值范围：
1. ALIAPP：支付宝钱包内
2. PCWEB：PC端访问
默认值为PCWEB。
	 */
	@ApiField("integration_type")
	private String integrationType;

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
	 * 商户订单号。64 个字符以内的大小，仅支持字母、数字、下划线。需保证该参数在商户端不重复。
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 公用回传参数，如果请求时传递了该参数，则返回给商户时会回传该参数。支付宝会在异步通知时将该参数原样返回。本参数必须进行UrlEncode之后才可以发送给支付宝。
	 */
	@ApiField("passback_params")
	private String passbackParams;

	/**
	 * 销售产品码，与支付宝签约的产品码名称。
注：目前仅支持FAST_INSTANT_TRADE_PAY
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 优惠参数
注：仅与支付宝协商后可用
	 */
	@ApiField("promo_params")
	private String promoParams;

	/**
	 * PC扫码支付的方式，支持前置模式和

跳转模式。
前置模式是将二维码前置到商户
的订单确认页的模式。需要商户在
自己的页面中以 iframe 方式请求
支付宝页面。具体分为以下几种：
0：订单码-简约前置模式，对应 iframe 宽度不能小于600px，高度不能小于300px；
1：订单码-前置模式，对应iframe 宽度不能小于 300px，高度不能小于600px；
3：订单码-迷你前置模式，对应 iframe 宽度不能小于 75px，高度不能小于75px；
4：订单码-可定义宽度的嵌入式二维码，商户可根据需要设定二维码的大小。

跳转模式下，用户的扫码界面是由支付宝生成的，不在商户的域名下。
2：订单码-跳转模式
	 */
	@ApiField("qr_pay_mode")
	private String qrPayMode;

	/**
	 * 商户自定义二维码宽度
注：qr_pay_mode=4时该参数生效
	 */
	@ApiField("qrcode_width")
	private Long qrcodeWidth;

	/**
	 * 请求来源地址。如果使用ALIAPP的集成方式，用户中途取消支付会返回该地址。
	 */
	@ApiField("request_from_url")
	private String requestFromUrl;

	/**
	 * 描述分账信息，json格式。
	 */
	@ApiField("royalty_info")
	private RoyaltyInfo royaltyInfo;

	/**
	 * 描述结算信息，json格式。
	 */
	@ApiField("settle_info")
	private SettleInfo settleInfo;

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
	 * 商品标题/交易标题/订单标题/订单关键字等。 
注意：不可使用特殊字符，如 /，=，& 等。
	 */
	@ApiField("subject")
	private String subject;

	/**
	 * 绝对超时时间，格式为yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("time_expire")
	private String timeExpire;

	/**
	 * 该笔订单允许的最晚付款时间，逾期将关闭交易。取值范围：1m～15d。m-分钟，h-小时，d-天，1c-当天（1c-当天的情况下，无论交易何时创建，都在0点关闭）。 该参数数值不接受小数点， 如 1.5h，可转换为 90m
	 */
	@ApiField("timeout_express")
	private String timeoutExpress;

	/**
	 * 订单总金额，单位为人民币（元），取值范围为 0.01~100000000.00，精确到小数点后两位。
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public AgreementSignParams getAgreementSignParams() {
		return this.agreementSignParams;
	}
	public void setAgreementSignParams(AgreementSignParams agreementSignParams) {
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

	public List<GoodsDetail> getGoodsDetail() {
		return this.goodsDetail;
	}
	public void setGoodsDetail(List<GoodsDetail> goodsDetail) {
		this.goodsDetail = goodsDetail;
	}

	public String getGoodsType() {
		return this.goodsType;
	}
	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}

	public String getIntegrationType() {
		return this.integrationType;
	}
	public void setIntegrationType(String integrationType) {
		this.integrationType = integrationType;
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

	public String getQrPayMode() {
		return this.qrPayMode;
	}
	public void setQrPayMode(String qrPayMode) {
		this.qrPayMode = qrPayMode;
	}

	public Long getQrcodeWidth() {
		return this.qrcodeWidth;
	}
	public void setQrcodeWidth(Long qrcodeWidth) {
		this.qrcodeWidth = qrcodeWidth;
	}

	public String getRequestFromUrl() {
		return this.requestFromUrl;
	}
	public void setRequestFromUrl(String requestFromUrl) {
		this.requestFromUrl = requestFromUrl;
	}

	public RoyaltyInfo getRoyaltyInfo() {
		return this.royaltyInfo;
	}
	public void setRoyaltyInfo(RoyaltyInfo royaltyInfo) {
		this.royaltyInfo = royaltyInfo;
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
