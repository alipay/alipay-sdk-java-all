package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 应付发票关联DTO
 *
 * @author auto create
 * @since 1.0, 2022-03-02 16:23:58
 */
public class InputInvoiceBillLinkOrderDTO extends AlipayObject {

	private static final long serialVersionUID = 1112675935782339839L;

	/**
	 * 账单号
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 外部单业务类型，默认为空 标识billNo为汇总单，否则billNo代表付款申请单ID
	 */
	@ApiField("out_bill_type")
	private String outBillType;

	/**
	 * 关联金额
	 */
	@ApiField("relate_amount")
	private MultiCurrencyMoneyOpenApi relateAmount;

	/**
	 * 关联到账单上的税额
	 */
	@ApiField("tax_amt")
	private MultiCurrencyMoneyOpenApi taxAmt;

	public String getBillNo() {
		return this.billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getOutBillType() {
		return this.outBillType;
	}
	public void setOutBillType(String outBillType) {
		this.outBillType = outBillType;
	}

	public MultiCurrencyMoneyOpenApi getRelateAmount() {
		return this.relateAmount;
	}
	public void setRelateAmount(MultiCurrencyMoneyOpenApi relateAmount) {
		this.relateAmount = relateAmount;
	}

	public MultiCurrencyMoneyOpenApi getTaxAmt() {
		return this.taxAmt;
	}
	public void setTaxAmt(MultiCurrencyMoneyOpenApi taxAmt) {
		this.taxAmt = taxAmt;
	}

}
