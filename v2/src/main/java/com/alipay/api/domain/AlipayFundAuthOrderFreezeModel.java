package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 资金预授权冻结接口
 *
 * @author auto create
 * @since 1.0, 2024-07-31 10:30:21
 */
public class AlipayFundAuthOrderFreezeModel extends AlipayObject {

	private static final long serialVersionUID = 6657879249839439124L;

	/**
	 * 需要冻结的金额，单位为：元（人民币），精确到小数点后两位。
取值范围：[0.01,100000000.00]
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 用户付款码。
1.条码场景：25~30开头的长度为16~24位的数字，实际字符串长度以开发者获取的付款码长度为准；
2.刷脸场景：
1）fp开头的35位字符串；
2）300-700字符的随机字符串；
注：刷脸场景考虑到未来可能拓展更多格式，建议外围不必做规则拦截，由支付宝统一做有效性校验
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 付款码类型。
1.条码场景：bar_code
2.刷脸场景：security_code
	 */
	@ApiField("auth_code_type")
	private String authCodeType;

	/**
	 * 业务参数，如风控参数outRiskInfo等。
	 */
	@ApiField("business_params")
	private String businessParams;

	/**
	 * 免押受理台模式，使用免押产品必传该字段。根据免押不同业务模式将开通受理台区分三种模式，商家可根据调用预授权冻结接口传入的参数决定该笔免押订单选择哪种受理台模式。不同受理台模式需要传入不同参数，其中：POSTPAY 表示后付金额已知，POSTPAY_UNCERTAIN 表示后付金额未知，DEPOSIT_ONLY 表示纯免押。
具体规则参考文档：<a href="https://opendocs.alipay.com/b/08tf3t?pathHash=d67d7545">https://opendocs.alipay.com/b/08tf3t?pathHash=d67d7545</a>
	 */
	@ApiField("deposit_product_mode")
	private String depositProductMode;

	/**
	 * 无特殊需要请勿传入；商户可用该参数禁用支付渠道。
传入后用户不可使用列表中的渠道进行支付，目前支持两种禁用渠道：信用卡快捷（OPTIMIZED_MOTO）、信用卡卡通（BIGAMOUNT_CREDIT_CARTOON）。与可用支付渠道不能同时传入
	 */
	@ApiField("disable_pay_channels")
	private String disablePayChannels;

	/**
	 * 无特殊需要请勿传入；商户可用该参数指定支付渠道。
传入后用户仅能使用列表中的渠道进行支付，目前支持三种渠道，余额宝（MONEY_FUND）、花呗（PCREDIT_PAY）以及芝麻信用（CREDITZHIMA）。与禁用支付渠道不可同时传入
	 */
	@ApiField("enable_pay_channels")
	private String enablePayChannels;

	/**
	 * 业务扩展参数，用于特定业务信息的传递，json格式。
1、category，信用类目，信用预授权场景必传，具体类目信息见<a href="https://opendocs.alipay.com/open/10719">https://opendocs.alipay.com/open/10719</a>；
2、serviceId，信用服务ID：信用预授权场景必传。需要商家在 <a href="https://b.alipay.com/page/zmgaia/pre-auth/index">开放平台-芝麻免押-信用服务管理</a> 创建信用服务获取，详情可查看 <a href="https://opendocs.alipay.com/open/03w0a7?pathHash=51f6b4f2&ref=api#%E7%94%B3%E8%AF%B7%E4%BF%A1%E7%94%A8%E6%9C%8D%E5%8A%A1">创建信用服务</a>。在创建过程中如果有其它疑问，可以咨询芝麻客服小二（0571-88158055 转 2）；
3、creditExtInfo，信用参数，可选，如有需要请与芝麻约定后传入，信用服务说明见<a href="https://opendocs.alipay.com/open/11157/qlsxya">https://opendocs.alipay.com/open/11157/qlsxya</a>
	 */
	@ApiField("extra_param")
	private String extraParam;

	/**
	 * 用户实名信息参数，包含：姓名+身份证号的hash值、指定用户的uid。商户传入用户实名信息参数，支付宝会对比用户在支付宝端的实名信息。
姓名+身份证号hash值使用SHA256摘要方式与UTF8编码,返回十六进制的字符串。
identity_hash和alipay_user_id都是可选的，如果两个都传，则会先校验identity_hash，然后校验alipay_user_id。其中identity_hash的待加密字样如"张三4566498798498498498498"
	 */
	@ApiField("identity_params")
	private String identityParams;

	/**
	 * 订单标题。
业务订单的简单描述，如商品名称等
	 */
	@ApiField("order_title")
	private String orderTitle;

	/**
	 * 商户授权资金订单号。
商家自定义需保证在商户端不重复。仅支持字母、数字、下划线。
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 商户本次资金操作的请求流水号，用于标示请求流水的唯一性。
可与out_order_no相同，仅支持字母、数字、下划线。
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 预授权订单相对超时时间，从商户请求时间开始计算。
预授权订单允许的最晚授权时间，逾期将关闭该笔订单。取值范围：1m～15d。m-分钟，h-小时，d-天。 该参数数值不接受小数点， 如 1.5h，可转换为90m。
默认为15m。
	 */
	@ApiField("pay_timeout")
	private String payTimeout;

	/**
	 * 收款账户的支付宝登录号（email或手机号）。
如果传入则会校验该登录号对应的账号是否具备当前商户收款权限，如果商户希望用户能够使用花呗，则用户号(payee_user_id)和登录号(payee_logon_id)两者必须传入其一
	 */
	@ApiField("payee_logon_id")
	private String payeeLogonId;

	/**
	 * 收款账户的支付宝用户号。
以2088开头的16位纯数字，如果传入则会校验该账号是否具备当前商户收款权限，如果商户希望用户能够使用花呗，则用户号(payee_user_id)和登录号(payee_logon_id)两者必须传入其一
	 */
	@ApiField("payee_user_id")
	private String payeeUserId;

	/**
	 * 后付费项目， 有付费项目时需要传入该字段。不同受理台模式需要传入不同参数，后付费项目名称和计费说明需要通过校验规则，同时计费说明将展示在开通受理台上。当受理台模式（deposit_product_mode）传入POSTPAY 时，后付费项目名称（name）、金额（amount）必传，计费说明（description）选传；当传入 POSTPAY_UNCERTAIN 时，后付费项目名称（name）、计费说明（description）必传，金额（amount）不传。
具体规则参考文档：
<a href="https://opendocs.alipay.com/b/08tf3t?pathHash=d67d7545">https://opendocs.alipay.com/b/08tf3t?pathHash=d67d7545</a>
	 */
	@ApiListField("post_payments")
	@ApiField("post_payment")
	private List<PostPayment> postPayments;

	/**
	 * 销售产品码。
当面资金预授权固定为 PRE_AUTH
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 场景码。
刷脸场景下传入HOTEL，其他情况下无需传入
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 商户指定的结算币种。支持澳元：AUD, 新西兰元：NZD, 台币：TWD, 美元：USD, 欧元：EUR, 英镑：GBP
	 */
	@ApiField("settle_currency")
	private String settleCurrency;

	/**
	 * 机具管控sdk加签参数，参数示例 "terminal_params":"{"terminalType":"IOT","signature":"QIIAX8DqbFbNf2oe97FI1RSLAycC/tU4GVjer3bN8K4qLtAB","apdidToken":"xPA3ptuArwYc3F6Va_pjVwv7Qx7Tg5TJdrA_Jb_moYte9AqGZgEAAA==","hardToken":"","time":"1539847253","bizCode":"11000200040004000121","bizTid":"010100F01i1XyacMgpOinHerfdBw1xA9dNDocctlnqhLD8lfODr1A7Q","signedKeys":"authCode,totalAmount,apdidToken,hardToken,time,bizCode,bizTid"}"
	 */
	@ApiField("terminal_params")
	private String terminalParams;

	/**
	 * 预授权订单相对超时时间，从商户请求时间开始计算。
预授权订单允许的最晚授权时间，逾期将关闭该笔订单。取值范围：1m～15d。m-分钟，h-小时，d-天。 该参数数值不接受小数点， 如 1.5h，可转换为90m。
默认为15m。
	 */
	@ApiField("timeout_express")
	private String timeoutExpress;

	/**
	 * 标价币种,  amount 对应的币种单位。支持澳元：AUD, 新西兰元：NZD, 台币：TWD, 美元：USD, 欧元：EUR, 英镑：GBP
	 */
	@ApiField("trans_currency")
	private String transCurrency;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getAuthCode() {
		return this.authCode;
	}
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public String getAuthCodeType() {
		return this.authCodeType;
	}
	public void setAuthCodeType(String authCodeType) {
		this.authCodeType = authCodeType;
	}

	public String getBusinessParams() {
		return this.businessParams;
	}
	public void setBusinessParams(String businessParams) {
		this.businessParams = businessParams;
	}

	public String getDepositProductMode() {
		return this.depositProductMode;
	}
	public void setDepositProductMode(String depositProductMode) {
		this.depositProductMode = depositProductMode;
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

	public String getExtraParam() {
		return this.extraParam;
	}
	public void setExtraParam(String extraParam) {
		this.extraParam = extraParam;
	}

	public String getIdentityParams() {
		return this.identityParams;
	}
	public void setIdentityParams(String identityParams) {
		this.identityParams = identityParams;
	}

	public String getOrderTitle() {
		return this.orderTitle;
	}
	public void setOrderTitle(String orderTitle) {
		this.orderTitle = orderTitle;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getPayTimeout() {
		return this.payTimeout;
	}
	public void setPayTimeout(String payTimeout) {
		this.payTimeout = payTimeout;
	}

	public String getPayeeLogonId() {
		return this.payeeLogonId;
	}
	public void setPayeeLogonId(String payeeLogonId) {
		this.payeeLogonId = payeeLogonId;
	}

	public String getPayeeUserId() {
		return this.payeeUserId;
	}
	public void setPayeeUserId(String payeeUserId) {
		this.payeeUserId = payeeUserId;
	}

	public List<PostPayment> getPostPayments() {
		return this.postPayments;
	}
	public void setPostPayments(List<PostPayment> postPayments) {
		this.postPayments = postPayments;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getSettleCurrency() {
		return this.settleCurrency;
	}
	public void setSettleCurrency(String settleCurrency) {
		this.settleCurrency = settleCurrency;
	}

	public String getTerminalParams() {
		return this.terminalParams;
	}
	public void setTerminalParams(String terminalParams) {
		this.terminalParams = terminalParams;
	}

	public String getTimeoutExpress() {
		return this.timeoutExpress;
	}
	public void setTimeoutExpress(String timeoutExpress) {
		this.timeoutExpress = timeoutExpress;
	}

	public String getTransCurrency() {
		return this.transCurrency;
	}
	public void setTransCurrency(String transCurrency) {
		this.transCurrency = transCurrency;
	}

}
