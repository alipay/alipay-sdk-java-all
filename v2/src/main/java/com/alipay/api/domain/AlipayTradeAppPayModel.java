package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * app支付接口2.0
 *
 * @author auto create
 * @since 1.0, 2024-04-19 10:13:00
 */
public class AlipayTradeAppPayModel extends AlipayObject {

	private static final long serialVersionUID = 8548768935672147777L;

	/**
	 * 签约参数。如果希望在sdk中支付并签约，需要在这里传入签约信息。
周期扣款场景 product_code 为 CYCLE_PAY_AUTH 时必填。
	 */
	@ApiField("agreement_sign_params")
	private SignParams agreementSignParams;

	/**
	 * 订单附加信息。
如果请求时传递了该参数，将在异步通知、对账单中原样返回，同时会在商户和用户的pc账单详情中作为交易描述展示
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
<a href="https://docs.open.alipay.com/common/wifww7">渠道列表</a>
	 */
	@ApiField("disable_pay_channels")
	private String disablePayChannels;

	/**
	 * 指定支付渠道，多个渠道以逗号分割。用户只能使用此处指定渠道进行支付。
与disable_pay_channels互斥，支持传入的值：<a target="_blank" href="https://docs.open.alipay.com/common/wifww7">渠道列表</a>。
注意：如果传入了指定支付渠道，则用户只能用指定内的渠道支付，包括营销渠道也要指定才能使用。若所有指定渠道用户都不可使用，将导致用户无法支付，慎用。
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
	 * 订单包含的商品列表信息，json格式，其它说明详见商品明细说明
	 */
	@ApiListField("goods_detail")
	@ApiField("goods_detail")
	private List<GoodsDetail> goodsDetail;

	/**
	 * 商品主类型
	 */
	@ApiField("goods_type")
	private String goodsType;

	/**
	 * 开票信息
	 */
	@ApiField("invoice_info")
	private InvoiceInfo invoiceInfo;

	/**
	 * 商户的原始订单号
	 */
	@ApiField("merchant_order_no")
	private String merchantOrderNo;

	/**
	 * 商户订单号。
由商家自定义，64个字符以内，仅支持字母、数字、下划线且需保证在商户端不重复。
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 公用回传参数。
如果请求时传递了该参数，支付宝会在异步通知时将该参数原样返回。
本参数必须进行UrlEncode之后才可以发送给支付宝。
	 */
	@ApiField("passback_params")
	private String passbackParams;

	/**
	 * 产品码。
商家和支付宝签约的产品码。 枚举值（点击查看签约情况）：
<a target="_blank" href="https://opensupport.alipay.com/support/codelab/detail/694/695">QUICK_MSECURITY_PAY</a>：无线快捷支付产品；
<a target="_blank" href="https://opensupport.alipay.com/support/codelab/detail/807/1419">CYCLE_PAY_AUTH</a>：周期扣款产品。
默认值为QUICK_MSECURITY_PAY。
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
	 * 通知参数选项。 商户通过传递该参数来定制需要异步通知的额外字段，数组格式。包括但不限于：["hyb_amount","enterprise_pay_info","medical_insurance_info","credit_pay_mode"]
	 */
	@ApiListField("query_options")
	@ApiField("string")
	private List<String> queryOptions;

	/**
	 * 描述分账信息，json格式，详见分账参数说明
	 */
	@ApiField("royalty_info")
	private RoyaltyInfo royaltyInfo;

	/**
	 * 卖家支付宝用户ID。
当需要指定收款账号时，通过该参数传入，如果该值为空，则默认为商户签约账号对应的支付宝用户ID。
注：直付通和机构间联场景下seller_id无需传入或者保持跟pid一致；
如果传入的seller_id与pid不一致，需要联系支付宝小二配置收款关系；
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 结算信息。
json格式，详见结算参数说明。
直付通模式下必传。
	 */
	@ApiField("settle_info")
	private SettleInfo settleInfo;

	/**
	 * 指定单通道，仅支持传入一个渠道。
注意：
目前仅支持传入 pcredit，若由于用户原因指定渠道不可用（不能支付），允许用户选择其他渠道支付。
该参数不可与花呗分期参数同时传入。
	 */
	@ApiField("specified_channel")
	private String specifiedChannel;

	/**
	 * 商户门店编号。
指商户创建门店时输入的门店编号。
	 */
	@ApiField("store_id")
	private String storeId;

	/**
	 * 二级商户信息。
直付通模式和机构间连模式下必传，其它场景下不需要传入。
	 */
	@ApiField("sub_merchant")
	private SubMerchant subMerchant;

	/**
	 * 订单标题。
注意：不可使用特殊字符，如 /，=，& 等。
	 */
	@ApiField("subject")
	private String subject;

	/**
	 * 订单绝对超时时间。
格式为yyyy-MM-dd HH:mm:ss。
注：time_expire和timeout_express两者只需传入一个或者都不传，如果两者都传，优先使用time_expire。
	 */
	@ApiField("time_expire")
	private String timeExpire;

	/**
	 * 建议使用time_expire字段。

订单相对超时时间。从买家确认支付时间开始计算。
该笔订单允许的最晚付款时间，逾期将关闭交易。取值范围：5m～15d。m-分钟，h-小时，d-天，1c-当天（1c-当天的情况下，无论交易何时创建，都在0点关闭）。 该参数数值不接受小数点， 如 1.5h，可转换为 90m。
默认值为15d。

注：
1. 无线支付场景最小值为5m，低于5m支付超时时间按5m计算。
2. time_expire和timeout_express两者只需传入一个或者都不传，如果两者都传，优先使用time_expire。
	 */
	@ApiField("timeout_express")
	private String timeoutExpress;

	/**
	 * 订单总金额。
单位为元，精确到小数点后两位，取值范围：[0.01,100000000] 。
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

	public List<String> getQueryOptions() {
		return this.queryOptions;
	}
	public void setQueryOptions(List<String> queryOptions) {
		this.queryOptions = queryOptions;
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
