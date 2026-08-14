package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.NatrualPersonInvoiceAmountMonthly;
import com.alipay.api.domain.RecyclingScrappedTaxCalcItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.recyclinginvoice.scrappednaturaltax.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-04 10:07:48
 */
public class AlipayCommerceEcRecyclinginvoiceScrappednaturaltaxQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3665142539398185724L;

	/** 
	 * 当前年度乐企个税累计计税金额（元）
	 */
	@ApiField("individual_tax_accumulated_amount_current_year")
	private String individualTaxAccumulatedAmountCurrentYear;

	/** 
	 * 是否阻断反向开票：Y/N
	 */
	@ApiField("interrupt")
	private String interrupt;

	/** 
	 * 自然人开票信息列表，如自然人无开票信息则为空
	 */
	@ApiListField("invoice_amount_list")
	@ApiField("natrual_person_invoice_amount_monthly")
	private List<NatrualPersonInvoiceAmountMonthly> invoiceAmountList;

	/** 
	 * 当年已缴个税累计税额（元）
	 */
	@ApiField("paid_individual_tax_amount_current_year")
	private String paidIndividualTaxAmountCurrentYear;

	/** 
	 * 用于税费计算
	 */
	@ApiListField("scrapped_tax_calc_item_list")
	@ApiField("recycling_scrapped_tax_calc_item")
	private List<RecyclingScrappedTaxCalcItem> scrappedTaxCalcItemList;

	/** 
	 * 普票1%口径待缴累计金额（元）
	 */
	@ApiField("wait_pay_general_invoice_1")
	private String waitPayGeneralInvoice1;

	/** 
	 * 地方教育附加，教育附加待缴累计金额（元）
	 */
	@ApiField("wait_pay_general_invoice_edu_amount")
	private String waitPayGeneralInvoiceEduAmount;

	/** 
	 * 专票待补缴累计金额1%（元）
	 */
	@ApiField("wait_pay_special_invoice_1")
	private String waitPaySpecialInvoice1;

	/** 
	 * 专票3%待补缴累计金额（元）
	 */
	@ApiField("wait_pay_special_invoice_3")
	private String waitPaySpecialInvoice3;

	public void setIndividualTaxAccumulatedAmountCurrentYear(String individualTaxAccumulatedAmountCurrentYear) {
		this.individualTaxAccumulatedAmountCurrentYear = individualTaxAccumulatedAmountCurrentYear;
	}
	public String getIndividualTaxAccumulatedAmountCurrentYear( ) {
		return this.individualTaxAccumulatedAmountCurrentYear;
	}

	public void setInterrupt(String interrupt) {
		this.interrupt = interrupt;
	}
	public String getInterrupt( ) {
		return this.interrupt;
	}

	public void setInvoiceAmountList(List<NatrualPersonInvoiceAmountMonthly> invoiceAmountList) {
		this.invoiceAmountList = invoiceAmountList;
	}
	public List<NatrualPersonInvoiceAmountMonthly> getInvoiceAmountList( ) {
		return this.invoiceAmountList;
	}

	public void setPaidIndividualTaxAmountCurrentYear(String paidIndividualTaxAmountCurrentYear) {
		this.paidIndividualTaxAmountCurrentYear = paidIndividualTaxAmountCurrentYear;
	}
	public String getPaidIndividualTaxAmountCurrentYear( ) {
		return this.paidIndividualTaxAmountCurrentYear;
	}

	public void setScrappedTaxCalcItemList(List<RecyclingScrappedTaxCalcItem> scrappedTaxCalcItemList) {
		this.scrappedTaxCalcItemList = scrappedTaxCalcItemList;
	}
	public List<RecyclingScrappedTaxCalcItem> getScrappedTaxCalcItemList( ) {
		return this.scrappedTaxCalcItemList;
	}

	public void setWaitPayGeneralInvoice1(String waitPayGeneralInvoice1) {
		this.waitPayGeneralInvoice1 = waitPayGeneralInvoice1;
	}
	public String getWaitPayGeneralInvoice1( ) {
		return this.waitPayGeneralInvoice1;
	}

	public void setWaitPayGeneralInvoiceEduAmount(String waitPayGeneralInvoiceEduAmount) {
		this.waitPayGeneralInvoiceEduAmount = waitPayGeneralInvoiceEduAmount;
	}
	public String getWaitPayGeneralInvoiceEduAmount( ) {
		return this.waitPayGeneralInvoiceEduAmount;
	}

	public void setWaitPaySpecialInvoice1(String waitPaySpecialInvoice1) {
		this.waitPaySpecialInvoice1 = waitPaySpecialInvoice1;
	}
	public String getWaitPaySpecialInvoice1( ) {
		return this.waitPaySpecialInvoice1;
	}

	public void setWaitPaySpecialInvoice3(String waitPaySpecialInvoice3) {
		this.waitPaySpecialInvoice3 = waitPaySpecialInvoice3;
	}
	public String getWaitPaySpecialInvoice3( ) {
		return this.waitPaySpecialInvoice3;
	}

}
