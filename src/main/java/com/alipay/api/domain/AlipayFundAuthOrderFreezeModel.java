package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资金预授权冻结接口
 *
 * @author auto create
 * @since 1.0, 2019-03-07 20:59:04
 */
public class AlipayFundAuthOrderFreezeModel extends AlipayObject {

	private static final long serialVersionUID = 2448932677492953753L;

	/**
	 * 需要冻结的金额，单位为：元（人民币），精确到小数点后两位
取值范围：[0.01,100000000.00]
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 支付授权码，25~30开头的长度为16~24位的数字，实际字符串长度以开发者获取的付款码长度为准
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 授权码类型
目前仅支持"bar_code"
	 */
	@ApiField("auth_code_type")
	private String authCodeType;

	/**
	 * 商户可用该参数指定用户可使用的支付渠道，本期支持商户可支持三种支付渠道，余额宝（MONEY_FUND）、花呗（PCREDIT_PAY）以及芝麻信用（CREDITZHIMA）。商户可设置一种支付渠道，也可设置多种支付渠道。
	 */
	@ApiField("enable_pay_channels")
	private String enablePayChannels;

	/**
	 * 业务扩展参数，用于商户的特定业务信息的传递，json格式。 
1.间联模式必须传入二级商户ID，key为secondaryMerchantId;
2. 当面资金授权业务对应的类目，key为category，value由支付宝分配，酒店业务传 "HOTEL"；
3. 外部商户的门店编号，key为outStoreCode，可选；
4. 外部商户的门店简称，key为outStoreAlias，可选。
	 */
	@ApiField("extra_param")
	private String extraParam;

	/**
	 * 业务订单的简单描述，如商品名称等
长度不超过100个字母或50个汉字
	 */
	@ApiField("order_title")
	private String orderTitle;

	/**
	 * 商户授权资金订单号 ,不能包含除中文、英文、数字以外的字符，创建后不能修改，需要保证在商户端不重复。
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 商户本次资金操作的请求流水号，用于标示请求流水的唯一性，不能包含除中文、英文、数字以外的字符，需要保证在商户端不重复。
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 该笔订单允许的最晚付款时间，逾期将关闭该笔订单
取值范围：1m～15d。m-分钟，h-小时，d-天。 该参数数值不接受小数点， 如 1.5h，可转换为90m
如果为空，默认15m
	 */
	@ApiField("pay_timeout")
	private String payTimeout;

	/**
	 * 收款方支付宝账号（Email或手机号），如果收款方支付宝登录号(payee_logon_id)和用户号(payee_user_id)同时传递，则以用户号(payee_user_id)为准，如果商户有勾选花呗渠道，收款方支付宝登录号(payee_logon_id)和用户号(payee_user_id)不能同时为空。
	 */
	@ApiField("payee_logon_id")
	private String payeeLogonId;

	/**
	 * 收款方的支付宝唯一用户号,以2088开头的16位纯数字组成，如果非空则会在支付时校验交易的的收款方与此是否一致，如果商户有勾选花呗渠道，收款方支付宝登录号(payee_logon_id)和用户号(payee_user_id)不能同时为空。
	 */
	@ApiField("payee_user_id")
	private String payeeUserId;

	/**
	 * 销售产品码，后续新接入预授权当面付的业务，本字段取值固定为PRE_AUTH。
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 商户指定的结算币种。支持澳元：AUD, 新西兰元：NZD, 台币：TWD, 美元：USD, 欧元：EUR, 英镑：GBP
	 */
	@ApiField("settle_currency")
	private String settleCurrency;

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

	public String getTransCurrency() {
		return this.transCurrency;
	}
	public void setTransCurrency(String transCurrency) {
		this.transCurrency = transCurrency;
	}

}
