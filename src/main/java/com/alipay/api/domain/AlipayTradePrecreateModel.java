package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 收银员通过收银台或商户后台调用支付宝接口，生成二维码后，展示给伤脑筋户，由用户扫描二维码完成订单支付。
修改路由策略到R
 *
 * @author auto create
 * @since 1.0, 2021-03-17 16:44:02
 */
public class AlipayTradePrecreateModel extends AlipayObject {

	private static final long serialVersionUID = 8857351716741512918L;

	/**
	 * 支付宝店铺的门店ID
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
	 * 买家支付宝账号
	 */
	@ApiField("buyer_logon_id")
	private String buyerLogonId;

	/**
	 * 禁用渠道，用户不可用指定渠道支付
当有多个渠道时用“,”分隔
注，与enable_pay_channels互斥
渠道列表：https://docs.open.alipay.com/common/wifww7
	 */
	@ApiField("disable_pay_channels")
	private String disablePayChannels;

	/**
	 * 可打折金额. 参与优惠计算的金额，单位为人民币（元），取值范围为 0.01~100000000.00，精确到小数点后两位。
注意：如果该值未传入，但传入了【订单总金额】和【不可打折金额】，则该值默认为【订单总金额】-【不可打折金额】
	 */
	@ApiField("discountable_amount")
	private String discountableAmount;

	/**
	 * 可用渠道，用户只能在指定渠道范围内支付
当有多个渠道时用“,”分隔
注，与disable_pay_channels互斥
<a href="https://docs.open.alipay.com/common/wifww7">渠道列表</a>
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
	 * 订单包含的商品列表信息.json格式. 其它说明详见：“商品明细说明”
	 */
	@ApiListField("goods_detail")
	@ApiField("goods_detail")
	private List<GoodsDetail> goodsDetail;

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
	 * 公用回传参数，如果请求时传递了该参数，则返回给商户时会回传该参数。支付宝只会在同步返回（包括跳转回商户网站）和异步通知时将该参数原样返回。本参数必须进行UrlEncode之后才可以发送给支付宝。
	 */
	@ApiField("passback_params")
	private String passbackParams;

	/**
	 * 销售产品码。
如果签约的是当面付快捷版，则传 OFFLINE_PAYMENT；
其它支付宝当面付产品传 FACE_TO_FACE_PAYMENT；
不传默认使用 FACE_TO_FACE_PAYMENT。
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 该笔订单允许的最晚付款时间，逾期将关闭交易，从生成二维码开始计时，默认有效期2h。
取值范围：1m～15d。m-分钟，h-小时，d-天，1c-当天（1c-当天的情况下，无论交易何时创建，都在0点关闭）。 该参数数值不接受小数点， 如 1.5h，可转换为 90m。
当面付场景最大有效期为2h，该场景下本参数设置超过2h，订单将在2h时关闭。
	 */
	@ApiField("qr_code_timeout_express")
	private String qrCodeTimeoutExpress;

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
	 * 商品的标题/交易标题/订单标题/订单关键字等。
注意：不可使用特殊字符，如 /，=，& 等。
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
	 * 订单总金额，单位为人民币（元），取值范围为 0.01~100000000.00，精确到小数点后两位。
注意：如果同时传入了【打折金额】，【不可打折金额】，【订单总金额】三者，则必须满足如下条件：【订单总金额】=【打折金额】+【不可打折金额】
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 不可打折金额. 不参与优惠计算的金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000] 如果该值未传入，但传入了【订单总金额】和【打折金额】，则该值默认为【订单总金额】-【打折金额】
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

	public String getQrCodeTimeoutExpress() {
		return this.qrCodeTimeoutExpress;
	}
	public void setQrCodeTimeoutExpress(String qrCodeTimeoutExpress) {
		this.qrCodeTimeoutExpress = qrCodeTimeoutExpress;
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
