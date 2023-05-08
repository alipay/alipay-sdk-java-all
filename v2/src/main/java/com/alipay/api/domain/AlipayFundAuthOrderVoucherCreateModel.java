package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资金授权发码接口
 *
 * @author auto create
 * @since 1.0, 2023-03-14 23:39:51
 */
public class AlipayFundAuthOrderVoucherCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8192114912391737896L;

	/**
	 * 需要冻结的金额，单位为：元（人民币），精确到小数点后两位。
取值范围：[0.01,100000000.00]
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 业务参数，如风控参数outRiskInfo等。
	 */
	@ApiField("business_params")
	private String businessParams;

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
	 * 业务扩展参数，用于特定业务信息的传递，json格式，key值如下：
1、category，信用类目，信用预授权场景必传，具体类目信息见https://opendocs.alipay.com/open/10719
2、serviceId，信用服务id，信用预授权场景必传，需要联系芝麻客服获取，https://cshall.alipay.com/enterprise/index.htm?sourceId=pc_zhima（右上角“有问题点我”进入咨询）
3、creditExtInfo，信用参数，如有需要请与芝麻约定后传入，信用服务说明见https://opendocs.alipay.com/open/11157/qlsxya
	 */
	@ApiField("extra_param")
	private String extraParam;

	/**
	 * 无特殊需要请勿传入；买家实名信息。
传入后支付宝会比对买家在支付宝端的实名信息。包含两个可选key：
1.identity_hash，买家姓名拼接身份证号后，使用SHA256摘要方式与UTF8编码后的hash值，返回的十六进制字符串，例如 “张三4566498798498498498498”对应的identity_hash应为“acc2b92ffc5ed9b472faa19748f10045c30434132784f774b00216a56b8841c6”
2.alipay_open_id，买家支付宝openId
3.alipay_user_id，买家支付宝uid
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
如果传入则会校验该登录号对应的账号是否具备当前商户收款权限，如果商户希望用户能够使用花呗，则用户号(payee_user_id)和登录号(payee_logon_id)两者必须传入其一，二者无需同时传入
	 */
	@ApiField("payee_logon_id")
	private String payeeLogonId;

	/**
	 * 收款账户的支付宝用户号。
以2088开头的16位纯数字，如果传入则会校验该账号是否具备当前商户收款权限，如果商户希望用户能够使用花呗，则用户号(payee_user_id)和登录号(payee_logon_id)两者必须传入其一，二者无需同时传入
	 */
	@ApiField("payee_user_id")
	private String payeeUserId;

	/**
	 * 销售产品码。
当面资金预授权固定为 PRE_AUTH
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 商户指定的结算币种。支持澳元：AUD, 新西兰元：NZD, 台币：TWD, 美元：USD, 欧元：EUR, 英镑：GBP
	 */
	@ApiField("settle_currency")
	private String settleCurrency;

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

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getSettleCurrency() {
		return this.settleCurrency;
	}
	public void setSettleCurrency(String settleCurrency) {
		this.settleCurrency = settleCurrency;
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
