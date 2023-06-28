package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券核销明细信息
 *
 * @author auto create
 * @since 1.0, 2020-07-28 20:55:52
 */
public class KbTicketUseDetail extends AlipayObject {

	private static final long serialVersionUID = 8376482146278546266L;

	/**
	 * 用户购买券的时候实际支付的金额，单位为元，精确到小数点后两位
	 */
	@ApiField("buyer_pay_amount")
	private String buyerPayAmount;

	/**
	 * 商家优惠金额，单位为元，精确到小数点后两位
	 */
	@ApiField("discount_amount")
	private String discountAmount;

	/**
	 * 交易中可给用户开具发票的金额，单位为元，精确到小数点后两位
	 */
	@ApiField("invoice_amount")
	private String invoiceAmount;

	/**
	 * 口碑补贴金额，单位为元，精确到小数点后两位
	 */
	@ApiField("koubei_subsidy_amount")
	private String koubeiSubsidyAmount;

	/**
	 * 商家实收金额，单位为元，精确到小数点后两位
	 */
	@ApiField("receipt_amount")
	private String receiptAmount;

	/**
	 * 核销的券码
	 */
	@ApiField("ticket_code")
	private String ticketCode;

	/**
	 * 券核销流水号
	 */
	@ApiField("ticket_trans_id")
	private String ticketTransId;

	public String getBuyerPayAmount() {
		return this.buyerPayAmount;
	}
	public void setBuyerPayAmount(String buyerPayAmount) {
		this.buyerPayAmount = buyerPayAmount;
	}

	public String getDiscountAmount() {
		return this.discountAmount;
	}
	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}

	public String getInvoiceAmount() {
		return this.invoiceAmount;
	}
	public void setInvoiceAmount(String invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}

	public String getKoubeiSubsidyAmount() {
		return this.koubeiSubsidyAmount;
	}
	public void setKoubeiSubsidyAmount(String koubeiSubsidyAmount) {
		this.koubeiSubsidyAmount = koubeiSubsidyAmount;
	}

	public String getReceiptAmount() {
		return this.receiptAmount;
	}
	public void setReceiptAmount(String receiptAmount) {
		this.receiptAmount = receiptAmount;
	}

	public String getTicketCode() {
		return this.ticketCode;
	}
	public void setTicketCode(String ticketCode) {
		this.ticketCode = ticketCode;
	}

	public String getTicketTransId() {
		return this.ticketTransId;
	}
	public void setTicketTransId(String ticketTransId) {
		this.ticketTransId = ticketTransId;
	}

}
