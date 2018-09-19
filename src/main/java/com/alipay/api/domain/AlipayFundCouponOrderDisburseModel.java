package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 受托打款接口
 *
 * @author auto create
 * @since 1.0, 2018-08-13 12:40:32
 */
public class AlipayFundCouponOrderDisburseModel extends AlipayObject {

	private static final long serialVersionUID = 4519759554932472749L;

	/**
	 * 需要支付的金额，单位为：元（人民币），精确到小数点后两位
取值范围：[0.01,100000000.00]
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 发放红包时产生的支付宝资金订单号。deduct_auth_no与下面的deduct_out_order_no不能同时为空，二者都存在时，以deduct_auth_no为准。为了保证支付的高效，建议商户传入deduct_auth_no。
	 */
	@ApiField("deduct_auth_no")
	private String deductAuthNo;

	/**
	 * 发放红包时的商户授权资金订单号。deduct_out_order_no与上面的deduct_auth_no不能同时为空，二者都存在时，以deduct_auth_no为准。为了保证支付的高效，建议商户传入deduct_auth_no。
	 */
	@ApiField("deduct_out_order_no")
	private String deductOutOrderNo;

	/**
	 * 业务扩展参数，用于商户的特定业务信息的传递，json格式
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
	 * 商户的授权资金订单号
同一商户不同的订单，商户授权资金订单号不能重复
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 商户本次资金操作的请求流水号
同一商户每次不同的资金操作请求，商户请求流水号不要重复
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 该笔订单允许的最晚付款时间，逾期将关闭该笔订单
取值范围：1m～7d。m-分钟，h-小时，d-天。 该参数数值不接受小数点， 如 1.5h，可转换为90m，如果为空，默认1h
	 */
	@ApiField("pay_timeout")
	private String payTimeout;

	/**
	 * 收款方的支付宝登录号，形式为手机号或邮箱等
	 */
	@ApiField("payee_logon_id")
	private String payeeLogonId;

	/**
	 * 收款方的支付宝唯一用户号,以2088开头的16位纯数字组成
	 */
	@ApiField("payee_user_id")
	private String payeeUserId;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getDeductAuthNo() {
		return this.deductAuthNo;
	}
	public void setDeductAuthNo(String deductAuthNo) {
		this.deductAuthNo = deductAuthNo;
	}

	public String getDeductOutOrderNo() {
		return this.deductOutOrderNo;
	}
	public void setDeductOutOrderNo(String deductOutOrderNo) {
		this.deductOutOrderNo = deductOutOrderNo;
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

}
