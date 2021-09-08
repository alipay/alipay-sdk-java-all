package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账单关联的发票
 *
 * @author auto create
 * @since 1.0, 2021-08-02 17:39:21
 */
public class BillInvoiceResponseDTO extends AlipayObject {

	private static final long serialVersionUID = 2698715316395579536L;

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
