package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-10-19 19:42:55
 */
public class TransferPaymentItemW extends AlipayObject {

	private static final long serialVersionUID = 7862272822863631183L;

	/**
	 * 缴费接收日期，yyyy-MM-DD
	 */
	@ApiField("channel_accept_time")
	private String channelAcceptTime;

	/**
	 * 汇款到账日期，yyyy-MM-DD
	 */
	@ApiField("channel_remit_time")
	private String channelRemitTime;

	/**
	 * 是否必须缴纳，"Y"必须缴费，"N"可选
	 */
	@ApiField("mandatory_payment")
	private String mandatoryPayment;

	/**
	 * 是否允许部分缴费，“Y”允许，“N”不允许
	 */
	@ApiField("partial_allowed")
	private String partialAllowed;

	/**
	 * 是否完成缴费,"Y"已缴费，"N"还未缴费
	 */
	@ApiField("payment_completed")
	private String paymentCompleted;

	/**
	 * 缴费金额
	 */
	@ApiField("payment_item_amount")
	private TransferAmountPaymentItemW paymentItemAmount;

	/**
	 * 缴费项编号
	 */
	@ApiField("payment_item_id")
	private String paymentItemId;

	/**
	 * 缴费项名称
	 */
	@ApiField("payment_item_name")
	private String paymentItemName;

	/**
	 * 缴费项类型
	 */
	@ApiField("payment_item_type")
	private String paymentItemType;

	/**
	 * 缴费项本地名称
	 */
	@ApiField("payment_local_name")
	private String paymentLocalName;

	public String getChannelAcceptTime() {
		return this.channelAcceptTime;
	}
	public void setChannelAcceptTime(String channelAcceptTime) {
		this.channelAcceptTime = channelAcceptTime;
	}

	public String getChannelRemitTime() {
		return this.channelRemitTime;
	}
	public void setChannelRemitTime(String channelRemitTime) {
		this.channelRemitTime = channelRemitTime;
	}

	public String getMandatoryPayment() {
		return this.mandatoryPayment;
	}
	public void setMandatoryPayment(String mandatoryPayment) {
		this.mandatoryPayment = mandatoryPayment;
	}

	public String getPartialAllowed() {
		return this.partialAllowed;
	}
	public void setPartialAllowed(String partialAllowed) {
		this.partialAllowed = partialAllowed;
	}

	public String getPaymentCompleted() {
		return this.paymentCompleted;
	}
	public void setPaymentCompleted(String paymentCompleted) {
		this.paymentCompleted = paymentCompleted;
	}

	public TransferAmountPaymentItemW getPaymentItemAmount() {
		return this.paymentItemAmount;
	}
	public void setPaymentItemAmount(TransferAmountPaymentItemW paymentItemAmount) {
		this.paymentItemAmount = paymentItemAmount;
	}

	public String getPaymentItemId() {
		return this.paymentItemId;
	}
	public void setPaymentItemId(String paymentItemId) {
		this.paymentItemId = paymentItemId;
	}

	public String getPaymentItemName() {
		return this.paymentItemName;
	}
	public void setPaymentItemName(String paymentItemName) {
		this.paymentItemName = paymentItemName;
	}

	public String getPaymentItemType() {
		return this.paymentItemType;
	}
	public void setPaymentItemType(String paymentItemType) {
		this.paymentItemType = paymentItemType;
	}

	public String getPaymentLocalName() {
		return this.paymentLocalName;
	}
	public void setPaymentLocalName(String paymentLocalName) {
		this.paymentLocalName = paymentLocalName;
	}

}
