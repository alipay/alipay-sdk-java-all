package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 留学入中交易详情
 *
 * @author auto create
 * @since 1.0, 2021-08-16 15:53:28
 */
public class TuitionInremitOrder extends AlipayObject {

	private static final long serialVersionUID = 4136539589532354639L;

	/**
	 * 支付宝生成的单据号
	 */
	@ApiField("alipay_payment_id")
	private String alipayPaymentId;

	/**
	 * 商户自己的交易单号
	 */
	@ApiField("isv_payment_id")
	private String isvPaymentId;

	/**
	 * 订单创建时间
	 */
	@ApiField("order_created")
	private String orderCreated;

	/**
	 * 订单最新修改时间
	 */
	@ApiField("order_modified")
	private String orderModified;

	/**
	 * TO_PAY
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 订单状态说明
	 */
	@ApiField("order_status_desc")
	private String orderStatusDesc;

	/**
	 * 订单金额和币种
	 */
	@ApiField("payment_amount")
	private Money paymentAmount;

	/**
	 * ISV内部缴费项编号
	 */
	@ApiField("payment_item_code")
	private String paymentItemCode;

	/**
	 * 学校在支付宝的商户ID号
	 */
	@ApiField("school_pid")
	private String schoolPid;

	/**
	 * 学生学号
	 */
	@ApiField("student_id")
	private String studentId;

	public String getAlipayPaymentId() {
		return this.alipayPaymentId;
	}
	public void setAlipayPaymentId(String alipayPaymentId) {
		this.alipayPaymentId = alipayPaymentId;
	}

	public String getIsvPaymentId() {
		return this.isvPaymentId;
	}
	public void setIsvPaymentId(String isvPaymentId) {
		this.isvPaymentId = isvPaymentId;
	}

	public String getOrderCreated() {
		return this.orderCreated;
	}
	public void setOrderCreated(String orderCreated) {
		this.orderCreated = orderCreated;
	}

	public String getOrderModified() {
		return this.orderModified;
	}
	public void setOrderModified(String orderModified) {
		this.orderModified = orderModified;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOrderStatusDesc() {
		return this.orderStatusDesc;
	}
	public void setOrderStatusDesc(String orderStatusDesc) {
		this.orderStatusDesc = orderStatusDesc;
	}

	public Money getPaymentAmount() {
		return this.paymentAmount;
	}
	public void setPaymentAmount(Money paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public String getPaymentItemCode() {
		return this.paymentItemCode;
	}
	public void setPaymentItemCode(String paymentItemCode) {
		this.paymentItemCode = paymentItemCode;
	}

	public String getSchoolPid() {
		return this.schoolPid;
	}
	public void setSchoolPid(String schoolPid) {
		this.schoolPid = schoolPid;
	}

	public String getStudentId() {
		return this.studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

}
