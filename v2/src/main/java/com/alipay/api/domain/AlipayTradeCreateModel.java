package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商户通过该接口进行交易的创建下单
 *
 * @author auto create
 * @since 1.0, 2025-06-16 16:34:28
 */
public class AlipayTradeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8319695282347771796L;

	/**
	 * 签约参数。如果希望使用支付并签约，需要在这里传入签约信息。
	 */
	@ApiField("agreement_sign_params")
	private SignParams agreementSignParams;

	/**
	 * 支付宝店铺编号。
指商户创建门店后支付宝生成的门店ID。
	 */
	@ApiField("alipay_store_id")
	private String alipayStoreId;

	/**
	 * 间联交易下，由收单机构上送的信息
	 */
	@ApiField("bkagent_req_info")
	private BkAgentReqInfo bkagentReqInfo;

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
	private BusinessParams businessParams;

	/**
	 * 买家支付宝用户ID。
2088开头的16位纯数字，小程序场景下获取用户ID请参考：<a target="_blank" href="https://opendocs.alipay.com/mini/introduce/authcode" >用户授权</a>;
其它场景下获取用户ID请参考：<a target="_blank" href="https://opendocs.alipay.com/open/284/106001/#s4" >网页授权获取用户信息</a>;
注：交易的买家与卖家不能相同。
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 买家支付宝登录账号。 建议通过open_id来传递买家信息。
	 */
	@ApiField("buyer_logon_id")
	private String buyerLogonId;

	/**
	 * 买家支付宝用户唯一标识
	 */
	@ApiField("buyer_open_id")
	private String buyerOpenId;

	/**
	 * 禁用渠道,用户不可用指定渠道支付，多个渠道以逗号分割
注，与enable_pay_channels互斥
<a href="https://docs.open.alipay.com/common/wifww7">渠道列表</a>
	 */
	@ApiField("disable_pay_channels")
	private String disablePayChannels;

	/**
	 * 可打折金额。
参与优惠计算的金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]。 
如果同时传入了【可打折金额】、【不可打折金额】和【订单总金额】，则必须满足如下条件：【订单总金额】=【可打折金额】+【不可打折金额】。
如果订单金额全部参与优惠计算，则【可打折金额】和【不可打折金额】都无需传入。
	 */
	@ApiField("discountable_amount")
	private String discountableAmount;

	/**
	 * 指定支付渠道。
用户只能使用指定的渠道进行支付，多个渠道以逗号分割。
与disable_pay_channels互斥，支持传入的值：<a target="_blank" href="https://docs.open.alipay.com/common/wifww7">渠道列表</a>。
注：如果传入了指定支付渠道，则用户只能用指定内的渠道支付，包括营销渠道也要指定才能使用。该参数可能导致用户支付受限，慎用。
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
	 * 物流信息
	 */
	@ApiField("logistics_detail")
	private LogisticsDetail logisticsDetail;

	/**
	 * 商户的原始订单号
	 */
	@ApiField("merchant_order_no")
	private String merchantOrderNo;

	/**
	 * 小程序支付中，商户实际经营主体的小程序应用的appid
	 */
	@ApiField("op_app_id")
	private String opAppId;

	/**
	 * 买家支付宝用户唯一标识（商户实际经营主体的小程序应用关联的买家open_id）
	 */
	@ApiField("op_buyer_open_id")
	private String opBuyerOpenId;

	/**
	 * 商户操作员编号。
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 商户订单号。
由商家自定义，64个字符以内，仅支持字母、数字、下划线且需保证在商户端不重复。
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 公用回传参数。
如果请求时传递了该参数，支付宝会在异步通知时将该参数原样返回。
	 */
	@ApiField("passback_params")
	private String passbackParams;

	/**
	 * 产品码。
商家和支付宝签约的产品码。 枚举值（点击查看签约情况）：
<a target="_blank" href="https://opensupport.alipay.com/support/codelab/detail/486/487">FACE_TO_FACE_PAYMENT</a>：当面付产品；
默认值为FACE_TO_FACE_PAYMENT。
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 返回参数选项。 商户通过传递该参数来定制需要额外返回的信息字段，数组格式。包括但不限于：["enterprise_pay_info","hyb_amount"]
	 */
	@ApiListField("query_options")
	@ApiField("string")
	private List<String> queryOptions;

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
	 * 卖家支付宝用户ID。
当需要指定收款账号时，通过该参数传入，如果该值为空，则默认为商户签约账号对应的支付宝用户ID。
收款账号优先级规则：门店绑定的收款账户>请求传入的seller_id>商户签约账号对应的支付宝用户ID；
注：直付通和机构间联场景下seller_id无需传入或者保持跟pid一致；
如果传入的seller_id与pid不一致，需要联系支付宝小二配置收款关系；
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 描述结算信息，json格式。
	 */
	@ApiField("settle_info")
	private SettleInfo settleInfo;

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
	 * 商户机具终端编号。
	 */
	@ApiField("terminal_id")
	private String terminalId;

	/**
	 * 订单绝对超时时间。
格式为yyyy-MM-dd HH:mm:ss。
注：time_expire和timeout_express两者只需传入一个或者都不传，如果两者都传，优先使用time_expire。
	 */
	@ApiField("time_expire")
	private String timeExpire;

	/**
	 * 订单相对超时时间。从交易创建时间开始计算。
该笔订单允许的最晚付款时间，逾期将关闭交易。取值范围：1m～15d。m-分钟，h-小时，d-天，1c-当天（1c-当天的情况下，无论交易何时创建，都在0点关闭）。 该参数数值不接受小数点， 如 1.5h，可转换为 90m。
当面付场景默认值为3h，如需指定，推荐设置5m及以上。

注：time_expire和timeout_express两者只需传入一个或者都不传，如果两者都传，优先使用time_expire。
	 */
	@ApiField("timeout_express")
	private String timeoutExpress;

	/**
	 * 订单总金额。
单位为元，精确到小数点后两位，取值范围：[0.01,100000000] 。
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 不可打折金额。
不参与优惠计算的金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]。 
如果同时传入了【可打折金额】、【不可打折金额】和【订单总金额】，则必须满足如下条件：【订单总金额】=【可打折金额】+【不可打折金额】。
如果订单金额全部参与优惠计算，则【可打折金额】和【不可打折金额】都无需传入。
	 */
	@ApiField("undiscountable_amount")
	private String undiscountableAmount;

	public SignParams getAgreementSignParams() {
		return this.agreementSignParams;
	}
	public void setAgreementSignParams(SignParams agreementSignParams) {
		this.agreementSignParams = agreementSignParams;
	}

	public String getAlipayStoreId() {
		return this.alipayStoreId;
	}
	public void setAlipayStoreId(String alipayStoreId) {
		this.alipayStoreId = alipayStoreId;
	}

	public BkAgentReqInfo getBkagentReqInfo() {
		return this.bkagentReqInfo;
	}
	public void setBkagentReqInfo(BkAgentReqInfo bkagentReqInfo) {
		this.bkagentReqInfo = bkagentReqInfo;
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

	public String getBuyerOpenId() {
		return this.buyerOpenId;
	}
	public void setBuyerOpenId(String buyerOpenId) {
		this.buyerOpenId = buyerOpenId;
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

	public String getOpAppId() {
		return this.opAppId;
	}
	public void setOpAppId(String opAppId) {
		this.opAppId = opAppId;
	}

	public String getOpBuyerOpenId() {
		return this.opBuyerOpenId;
	}
	public void setOpBuyerOpenId(String opBuyerOpenId) {
		this.opBuyerOpenId = opBuyerOpenId;
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

	public List<String> getQueryOptions() {
		return this.queryOptions;
	}
	public void setQueryOptions(List<String> queryOptions) {
		this.queryOptions = queryOptions;
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

	public String getUndiscountableAmount() {
		return this.undiscountableAmount;
	}
	public void setUndiscountableAmount(String undiscountableAmount) {
		this.undiscountableAmount = undiscountableAmount;
	}

}
