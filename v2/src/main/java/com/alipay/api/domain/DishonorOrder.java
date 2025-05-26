package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 退票订单
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class DishonorOrder extends AlipayObject {

	private static final long serialVersionUID = 6129974817499452826L;

	/**
	 * 退票金额：单位：元。
只支持2位小数，小数点前最大支持13位，金额必须大于0。
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 退票时间：格式为yyyy-MM-dd HH:mm:ss。
	 */
	@ApiField("dishonor_date")
	private String dishonorDate;

	/**
	 * 退票原因：银行返回的退票原因。
	 */
	@ApiField("fail_reason")
	private String failReason;

	/**
	 * 支付宝转账单据号。
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 商户转账唯一订单号:发起转账来源方定义的转账单据号。该参数的赋值均以查询结果中的out_biz_no为准。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 支付时间:格式为yyyy-MM-dd HH:mm:ss。转账失败不返回。
	 */
	@ApiField("pay_date")
	private String payDate;

	/**
	 * 付款方账户:付款方支付宝唯一标识（2088开头16位数字字符串）或支付宝会员登录号（邮箱或手机号）
	 */
	@ApiField("payer_account")
	private String payerAccount;

	/**
	 * 提现流水号。
	 */
	@ApiField("payment_no")
	private String paymentNo;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getDishonorDate() {
		return this.dishonorDate;
	}
	public void setDishonorDate(String dishonorDate) {
		this.dishonorDate = dishonorDate;
	}

	public String getFailReason() {
		return this.failReason;
	}
	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPayDate() {
		return this.payDate;
	}
	public void setPayDate(String payDate) {
		this.payDate = payDate;
	}

	public String getPayerAccount() {
		return this.payerAccount;
	}
	public void setPayerAccount(String payerAccount) {
		this.payerAccount = payerAccount;
	}

	public String getPaymentNo() {
		return this.paymentNo;
	}
	public void setPaymentNo(String paymentNo) {
		this.paymentNo = paymentNo;
	}

}
