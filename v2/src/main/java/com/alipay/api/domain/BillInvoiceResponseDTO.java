package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账单关联的发票
 *
 * @author auto create
 * @since 1.0, 2021-09-28 14:28:42
 */
public class BillInvoiceResponseDTO extends AlipayObject {

	private static final long serialVersionUID = 6337397976943389521L;

	/**
	 * 关联的金额1
	 */
	@ApiField("bill_relate_amount")
	private MultiCurrencyMoneyOpenApi billRelateAmount;

	/**
	 * 发票信息
	 */
	@ApiField("invoice")
	private InvoiceAllResponseDTO invoice;

	public MultiCurrencyMoneyOpenApi getBillRelateAmount() {
		return this.billRelateAmount;
	}
	public void setBillRelateAmount(MultiCurrencyMoneyOpenApi billRelateAmount) {
		this.billRelateAmount = billRelateAmount;
	}

	public InvoiceAllResponseDTO getInvoice() {
		return this.invoice;
	}
	public void setInvoice(InvoiceAllResponseDTO invoice) {
		this.invoice = invoice;
	}

}
