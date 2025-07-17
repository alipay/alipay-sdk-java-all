package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 用于在线下场景交易一次创建并支付掉
修改路由策略到R
 *
 * @author auto create
 * @since 1.0, 2025-05-20 20:33:34
 */
public class AlipayTradePayModel extends AlipayObject {

	private static final long serialVersionUID = 6328558942498734384L;

	/**
	 * 支付模式类型,若值为ENJOY_PAY_V2表示当前交易允许走先享后付2.0垫资
	 */
	@ApiField("advance_payment_type")
	private String advancePaymentType;

	/**
	 * 代扣信息。
代扣业务需要传入的协议相关信息，使用本参数传入协议号后scene和auth_code不需要再传值。
	 */
	@ApiField("agreement_params")
	private AgreementParams agreementParams;

	/**
	 * 支付宝店铺编号。
指商户创建门店后支付宝生成的门店ID。
	 */
	@ApiField("alipay_store_id")
	private String alipayStoreId;

	/**
	 * 支付授权码。
当面付场景传买家的付款码（25~30开头的长度为16~24位的数字，实际字符串长度以开发者获取的付款码长度为准）或者刷脸标识串（fp开头的35位字符串）；
周期扣款或代扣场景无需传入，协议号通过agreement_params参数传递； 
支付宝预授权和新当面资金授权场景无需传入，授权订单号通过 auth_no字段传入。
注：交易的买家与卖家不能相同。
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 预授权确认模式。
适用于支付宝预授权和新当面资金授权场景。枚举值：
COMPLETE：转交易完成后解冻剩余冻结金额；
NOT_COMPLETE：转交易完成后不解冻剩余冻结金额；
默认值为NOT_COMPLETE。
	 */
	@ApiField("auth_confirm_mode")
	private String authConfirmMode;

	/**
	 * 资金预授权单号。
支付宝预授权和新当面资金授权场景下必填。
	 */
	@ApiField("auth_no")
	private String authNo;

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
支付宝预授权和新当面资金授权场景下必填，其它场景不需要传入。
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 买家支付宝用户唯一标识
	 */
	@ApiField("buyer_open_id")
	private String buyerOpenId;

	/**
	 * 禁用支付渠道。
多个渠道以逗号分割，如同时禁用信用支付类型和积分，则传入："credit_group,point"。
支持传入的值：<a target="_blank" href="https://docs.open.alipay.com/common/wifww7">渠道列表</a>
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
	 * 外部指定买家
	 */
	@ApiField("ext_user_info")
	private ExtUserInfo extUserInfo;

	/**
	 * 业务扩展参数，二级参数字段会动态新增
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
	 * 是否异步支付，传入true时，表明本次期望走异步支付，会先将支付请求受理下来，再异步推进。商户可以通过交易的异步通知或者轮询交易的状态来确定最终的交易结果。
只在代扣场景下有效，其它场景无需传入。
	 */
	@ApiField("is_async_pay")
	private Boolean isAsyncPay;

	/**
	 * 商户的原始订单号
	 */
	@ApiField("merchant_order_no")
	private String merchantOrderNo;

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
	 * 支付相关参数
	 */
	@ApiField("pay_params")
	private PayParams payParams;

	/**
	 * 产品码。 商家和支付宝签约的产品码。 枚举值（点击查看签约情况）： <a target="_blank" href="https://opensupport.alipay.com/support/codelab/detail/486/487">FACE_TO_FACE_PAYMENT</a>：当面付产品； <a target="_blank" href="https://opensupport.alipay.com/support/codelab/detail/807/1419">CYCLE_PAY_AUTH</a>：周期扣款产品； GENERAL_WITHHOLDING：代扣产品； <a target="_blank" href="https://opensupport.alipay.com/support/codelab/detail/712/1471">PRE_AUTH_ONLINE</a>：支付宝预授权产品； PRE_AUTH：新当面资金授权产品； 默认值为FACE_TO_FACE_PAYMENT。 注意：非当面付产品使用本接口时，本参数必填。请传入对应产品码。
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 优惠明细参数，通过此属性补充营销参数
	 */
	@ApiField("promo_params")
	private PromoParam promoParams;

	/**
	 * 返回参数选项。
商户通过传递该参数来定制同步需要额外返回的信息字段，数组格式。包括但不限于：["fund_bill_list","voucher_detail_list","enterprise_pay_info","discount_goods_detail","discount_amount","mdiscount_amount"]
	 */
	@ApiListField("query_options")
	@ApiField("string")
	private List<String> queryOptions;

	/**
	 * 收单机构(例如银行）的标识，填写该机构在支付宝的pid。只在机构间联场景下传递该值。
	 */
	@ApiField("request_org_pid")
	private String requestOrgPid;

	/**
	 * 分账信息。
json格式，其它说明详见分账说明
	 */
	@ApiField("royalty_info")
	private RoyaltyInfo royaltyInfo;

	/**
	 * 支付场景。枚举值：
bar_code：当面付条码支付场景；
security_code：当面付刷脸支付场景，对应的auth_code为fp开头的刷脸标识串；
周期扣款或代扣场景无需传入，协议号通过agreement_params参数传递； 
支付宝预授权和新当面资金授权场景无需传入，授权订单号通过 auth_no字段传入。
默认值为bar_code。
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 卖家支付宝用户ID。
当需要指定收款账号时，通过该参数传入，如果该值为空，则默认为商户签约账号对应的支付宝用户ID。
收款账号优先级规则：门店绑定的收款账户>请求传入的seller_id>商户签约账号对应的支付宝用户ID；
注：直付通和机构间联场景下seller_id无需传入或者保持跟pid一致；
如果传入的seller_id与pid不一致，需要联系支付宝小二配置收款关系；
支付宝预授权和新当面资金授权场景下必填。
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 商户指定的结算币种，支持英镑：GBP、港币：HKD、美元：USD、新加坡元：SGD、日元：JPY、加拿大元：CAD、澳元：AUD、欧元：EUR、新西兰元：NZD、韩元：KRW、泰铢：THB、瑞士法郎：CHF、瑞典克朗：SEK、丹麦克朗：DKK、挪威克朗：NOK、马来西亚林吉特：MYR、印尼卢比：IDR、菲律宾比索：PHP、毛里求斯卢比：MUR、以色列新谢克尔：ILS、斯里兰卡卢比：LKR、俄罗斯卢布：RUB、阿联酋迪拉姆：AED、捷克克朗：CZK、南非兰特：ZAR、人民币：CNY
	 */
	@ApiField("settle_currency")
	private String settleCurrency;

	/**
	 * 结算信息、
json格式，详见结算参数说明。
直付通模式下必传。
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
	 * IOT设备信息。
通过集成IOTSDK的机具发起的交易时传入，取值为IOTSDK生成的业务签名值。
	 */
	@ApiField("terminal_params")
	private String terminalParams;

	/**
	 * 订单绝对超时时间。
格式为yyyy-MM-dd HH:mm:ss。超时时间范围：1m~15d。
注：time_expire和timeout_express两者只需传入一个或者都不传，如果两者都传，优先使用time_expire。
	 */
	@ApiField("time_expire")
	private String timeExpire;

	/**
	 * 订单相对超时时间。从交易创建时间开始计算。

该笔订单允许的最晚付款时间，逾期将关闭交易。取值范围：1m～15d。m-分钟，h-小时，d-天，1c-当天（1c-当天的情况下，无论交易何时创建，都在0点关闭）。 该参数数值不接受小数点， 如 1.5h，可转换为 90m。

当面付场景默认值为3h；

其它场景默认值为15d;
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
	 * 标价币种,  total_amount 对应的币种单位。支持英镑：GBP、港币：HKD、美元：USD、新加坡元：SGD、日元：JPY、加拿大元：CAD、澳元：AUD、欧元：EUR、新西兰元：NZD、韩元：KRW、泰铢：THB、瑞士法郎：CHF、瑞典克朗：SEK、丹麦克朗：DKK、挪威克朗：NOK、马来西亚林吉特：MYR、印尼卢比：IDR、菲律宾比索：PHP、毛里求斯卢比：MUR、以色列新谢克尔：ILS、斯里兰卡卢比：LKR、俄罗斯卢布：RUB、阿联酋迪拉姆：AED、捷克克朗：CZK、南非兰特：ZAR、人民币：CNY
	 */
	@ApiField("trans_currency")
	private String transCurrency;

	/**
	 * 不可打折金额。
不参与优惠计算的金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]。 
如果同时传入了【可打折金额】、【不可打折金额】和【订单总金额】，则必须满足如下条件：【订单总金额】=【可打折金额】+【不可打折金额】。
如果订单金额全部参与优惠计算，则【可打折金额】和【不可打折金额】都无需传入。
	 */
	@ApiField("undiscountable_amount")
	private String undiscountableAmount;

	public String getAdvancePaymentType() {
		return this.advancePaymentType;
	}
	public void setAdvancePaymentType(String advancePaymentType) {
		this.advancePaymentType = advancePaymentType;
	}

	public AgreementParams getAgreementParams() {
		return this.agreementParams;
	}
	public void setAgreementParams(AgreementParams agreementParams) {
		this.agreementParams = agreementParams;
	}

	public String getAlipayStoreId() {
		return this.alipayStoreId;
	}
	public void setAlipayStoreId(String alipayStoreId) {
		this.alipayStoreId = alipayStoreId;
	}

	public String getAuthCode() {
		return this.authCode;
	}
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public String getAuthConfirmMode() {
		return this.authConfirmMode;
	}
	public void setAuthConfirmMode(String authConfirmMode) {
		this.authConfirmMode = authConfirmMode;
	}

	public String getAuthNo() {
		return this.authNo;
	}
	public void setAuthNo(String authNo) {
		this.authNo = authNo;
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

	public Boolean getIsAsyncPay() {
		return this.isAsyncPay;
	}
	public void setIsAsyncPay(Boolean isAsyncPay) {
		this.isAsyncPay = isAsyncPay;
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

	public PayParams getPayParams() {
		return this.payParams;
	}
	public void setPayParams(PayParams payParams) {
		this.payParams = payParams;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public PromoParam getPromoParams() {
		return this.promoParams;
	}
	public void setPromoParams(PromoParam promoParams) {
		this.promoParams = promoParams;
	}

	public List<String> getQueryOptions() {
		return this.queryOptions;
	}
	public void setQueryOptions(List<String> queryOptions) {
		this.queryOptions = queryOptions;
	}

	public String getRequestOrgPid() {
		return this.requestOrgPid;
	}
	public void setRequestOrgPid(String requestOrgPid) {
		this.requestOrgPid = requestOrgPid;
	}

	public RoyaltyInfo getRoyaltyInfo() {
		return this.royaltyInfo;
	}
	public void setRoyaltyInfo(RoyaltyInfo royaltyInfo) {
		this.royaltyInfo = royaltyInfo;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getSettleCurrency() {
		return this.settleCurrency;
	}
	public void setSettleCurrency(String settleCurrency) {
		this.settleCurrency = settleCurrency;
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

	public String getTerminalParams() {
		return this.terminalParams;
	}
	public void setTerminalParams(String terminalParams) {
		this.terminalParams = terminalParams;
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

	public String getTransCurrency() {
		return this.transCurrency;
	}
	public void setTransCurrency(String transCurrency) {
		this.transCurrency = transCurrency;
	}

	public String getUndiscountableAmount() {
		return this.undiscountableAmount;
	}
	public void setUndiscountableAmount(String undiscountableAmount) {
		this.undiscountableAmount = undiscountableAmount;
	}

}
