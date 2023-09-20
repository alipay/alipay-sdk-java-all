package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 普票、无票、专票可收票单据金额
 *
 * @author auto create
 * @since 1.0, 2021-09-28 14:29:10
 */
public class InvoiceRevAmountDTO extends AlipayObject {

	private static final long serialVersionUID = 6793552864241462118L;

	/**
	 * 账单号
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 无票金额
	 */
	@ApiField("no_vat_receiveable_amount")
	private MultiCurrencyMoneyOpenApi noVatReceiveableAmount;

	/**
	 * 无票税损金额
	 */
	@ApiField("no_vat_tax_loss_amount")
	private MultiCurrencyMoneyOpenApi noVatTaxLossAmount;

	/**
	 * 发票税损比例
	 */
	@ApiField("no_vat_tax_loss_rate")
	private String noVatTaxLossRate;

	/**
	 * 单据号
	 */
	@ApiField("out_bill_no")
	private String outBillNo;

	/**
	 * 可收票金额
	 */
	@ApiField("receiveable_amount")
	private MultiCurrencyMoneyOpenApi receiveableAmount;

	/**
	 * 普票可收款金额
	 */
	@ApiField("vat_nomal_receiveable_amount")
	private MultiCurrencyMoneyOpenApi vatNomalReceiveableAmount;

	/**
	 * 普票税损金额
	 */
	@ApiField("vat_nomal_tax_loss_amount")
	private MultiCurrencyMoneyOpenApi vatNomalTaxLossAmount;

	/**
	 * 普票税损比例
	 */
	@ApiField("vat_nomal_tax_loss_rate")
	private String vatNomalTaxLossRate;

	/**
	 * 专票可收款金额
	 */
	@ApiField("vat_special_receiveable_amount")
	private MultiCurrencyMoneyOpenApi vatSpecialReceiveableAmount;

	public String getBillNo() {
		return this.billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public MultiCurrencyMoneyOpenApi getNoVatReceiveableAmount() {
		return this.noVatReceiveableAmount;
	}
	public void setNoVatReceiveableAmount(MultiCurrencyMoneyOpenApi noVatReceiveableAmount) {
		this.noVatReceiveableAmount = noVatReceiveableAmount;
	}

	public MultiCurrencyMoneyOpenApi getNoVatTaxLossAmount() {
		return this.noVatTaxLossAmount;
	}
	public void setNoVatTaxLossAmount(MultiCurrencyMoneyOpenApi noVatTaxLossAmount) {
		this.noVatTaxLossAmount = noVatTaxLossAmount;
	}

	public String getNoVatTaxLossRate() {
		return this.noVatTaxLossRate;
	}
	public void setNoVatTaxLossRate(String noVatTaxLossRate) {
		this.noVatTaxLossRate = noVatTaxLossRate;
	}

	public String getOutBillNo() {
		return this.outBillNo;
	}
	public void setOutBillNo(String outBillNo) {
		this.outBillNo = outBillNo;
	}

	public MultiCurrencyMoneyOpenApi getReceiveableAmount() {
		return this.receiveableAmount;
	}
	public void setReceiveableAmount(MultiCurrencyMoneyOpenApi receiveableAmount) {
		this.receiveableAmount = receiveableAmount;
	}

	public MultiCurrencyMoneyOpenApi getVatNomalReceiveableAmount() {
		return this.vatNomalReceiveableAmount;
	}
	public void setVatNomalReceiveableAmount(MultiCurrencyMoneyOpenApi vatNomalReceiveableAmount) {
		this.vatNomalReceiveableAmount = vatNomalReceiveableAmount;
	}

	public MultiCurrencyMoneyOpenApi getVatNomalTaxLossAmount() {
		return this.vatNomalTaxLossAmount;
	}
	public void setVatNomalTaxLossAmount(MultiCurrencyMoneyOpenApi vatNomalTaxLossAmount) {
		this.vatNomalTaxLossAmount = vatNomalTaxLossAmount;
	}

	public String getVatNomalTaxLossRate() {
		return this.vatNomalTaxLossRate;
	}
	public void setVatNomalTaxLossRate(String vatNomalTaxLossRate) {
		this.vatNomalTaxLossRate = vatNomalTaxLossRate;
	}

	public MultiCurrencyMoneyOpenApi getVatSpecialReceiveableAmount() {
		return this.vatSpecialReceiveableAmount;
	}
	public void setVatSpecialReceiveableAmount(MultiCurrencyMoneyOpenApi vatSpecialReceiveableAmount) {
		this.vatSpecialReceiveableAmount = vatSpecialReceiveableAmount;
	}

}
