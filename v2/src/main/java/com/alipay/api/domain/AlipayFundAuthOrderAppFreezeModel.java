package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 线上资金授权冻结接口
 *
 * @author auto create
 * @since 1.0, 2024-01-12 13:46:51
 */
public class AlipayFundAuthOrderAppFreezeModel extends AlipayObject {

	private static final long serialVersionUID = 8431776798373858518L;

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
	 * 无特殊需要请勿传入；买家实名信息。
传入后支付宝会比对买家在支付宝端的实名信息。包含两个可选key：
1.identity_hash，买家姓名拼接身份证号后，使用SHA256摘要方式与UTF8编码后的hash值，返回的十六进制字符串，例如 “张三4566498798498498498498”对应的identity_hash应为“acc2b92ffc5ed9b472faa19748f10045c30434132784f774b00216a56b8841c6”
2.alipay_user_id，买家uid
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
	 * 预授权订单相对超时时间。从商户客户端请求时间开始计算。
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
支付宝预授权产品固定为 PRE_AUTH_ONLINE
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 场景码，用于区分预授权不同业务场景。如：当面预授权通用场景（O2O_AUTH_COMMON_SCENE）、支付宝预授权通用场景（ONLINE_AUTH_COMMON_SCENE）、境外当面预授权通用场景（OVERSEAS_O2O_AUTH_COMMON_SCENE）、境外支付预授权通用场景（OVERSEAS_ONLINE_AUTH_COMMON_SCENE）等
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 商户指定的结算币种。支持澳元：AUD, 新西兰元：NZD, 台币：TWD, 美元：USD, 欧元：EUR, 英镑：GBP
	 */
	@ApiField("settle_currency")
	private String settleCurrency;

	/**
	 * 预授权订单相对超时时间。从商户客户端请求时间开始计算。
预授权订单允许的最晚授权时间，逾期将关闭该笔订单。取值范围：1m～15d。m-分钟，h-小时，d-天。 该参数数值不接受小数点， 如 1.5h，可转换为90m。
默认为15m。
	 */
	@ApiField("timeout_express")
	private String timeoutExpress;

	/**
	 * 标价币种,  amount 对应的币种单位。支持澳元：AUD, 新西兰元：NZD, 台币：TWD, 美元：USD, 欧元：EUR, 英镑：GBP, 人民币：CNY
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
