package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 缴费项对象
 *
 * @author auto create
 * @since 1.0, 2020-06-17 18:10:11
 */
public class PaymentItems extends AlipayObject {

	private static final long serialVersionUID = 3781893592394134611L;

	/**
	 * is goods allowed partial payment
	 */
	@ApiField("allowd_partial_payment")
	private String allowdPartialPayment;

	/**
	 * The date and time when payment expires
	 */
	@ApiField("payment_item_end_time")
	private Date paymentItemEndTime;

	/**
	 * unique id of payment item
	 */
	@ApiField("payment_item_id")
	private String paymentItemId;

	/**
	 * payment item local name
	 */
	@ApiField("payment_item_local_name")
	private String paymentItemLocalName;

	/**
	 * payment item name
	 */
	@ApiField("payment_item_name")
	private String paymentItemName;

	/**
	 * The date and time when payment is effective
	 */
	@ApiField("payment_start_time")
	private Date paymentStartTime;

	/**
	 * payment item amount
	 */
	@ApiField("payment_total_amount")
	private TuitionMoneyDTO paymentTotalAmount;

	public String getAllowdPartialPayment() {
		return this.allowdPartialPayment;
	}
	public void setAllowdPartialPayment(String allowdPartialPayment) {
		this.allowdPartialPayment = allowdPartialPayment;
	}

	public Date getPaymentItemEndTime() {
		return this.paymentItemEndTime;
	}
	public void setPaymentItemEndTime(Date paymentItemEndTime) {
		this.paymentItemEndTime = paymentItemEndTime;
	}

	public String getPaymentItemId() {
		return this.paymentItemId;
	}
	public void setPaymentItemId(String paymentItemId) {
		this.paymentItemId = paymentItemId;
	}

	public String getPaymentItemLocalName() {
		return this.paymentItemLocalName;
	}
	public void setPaymentItemLocalName(String paymentItemLocalName) {
		this.paymentItemLocalName = paymentItemLocalName;
	}

	public String getPaymentItemName() {
		return this.paymentItemName;
	}
	public void setPaymentItemName(String paymentItemName) {
		this.paymentItemName = paymentItemName;
	}

	public Date getPaymentStartTime() {
		return this.paymentStartTime;
	}
	public void setPaymentStartTime(Date paymentStartTime) {
		this.paymentStartTime = paymentStartTime;
	}

	public TuitionMoneyDTO getPaymentTotalAmount() {
		return this.paymentTotalAmount;
	}
	public void setPaymentTotalAmount(TuitionMoneyDTO paymentTotalAmount) {
		this.paymentTotalAmount = paymentTotalAmount;
	}

}
