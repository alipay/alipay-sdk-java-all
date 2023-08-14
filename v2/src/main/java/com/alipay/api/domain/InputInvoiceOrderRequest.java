package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 统一结算发票
 *
 * @author auto create
 * @since 1.0, 2022-02-23 17:21:36
 */
public class InputInvoiceOrderRequest extends AlipayObject {

	private static final long serialVersionUID = 2674762392546452762L;

	/**
	 * 购方机构OU
	 */
	@ApiField("buyer_inst_id")
	private String buyerInstId;

	/**
	 * 币种
	 */
	@ApiField("currency_code")
	private String currencyCode;

	/**
	 * 不含税金额-元
	 */
	@ApiField("exclude_tax_invoice_amt")
	private String excludeTaxInvoiceAmt;

	/**
	 * 票面金额-元
	 */
	@ApiField("invoice_amt")
	private String invoiceAmt;

	/**
	 * 发票代码
	 */
	@ApiField("invoice_code")
	private String invoiceCode;

	/**
	 * 开票日期 格式(yyyyMMdd)
	 */
	@ApiField("invoice_date")
	private String invoiceDate;

	/**
	 * 发票介质 01-电子 02-纸质
	 */
	@ApiField("invoice_material")
	private String invoiceMaterial;

	/**
	 * 发票号码
	 */
	@ApiField("invoice_no")
	private String invoiceNo;

	/**
	 * 收票日期 格式(yyyyMMdd)
	 */
	@ApiField("invoice_receive_date")
	private String invoiceReceiveDate;

	/**
	 * 发票录入来源

04:集采录入
	 */
	@ApiField("invoice_source")
	private String invoiceSource;

	/**
	 * 发票种类 01增值税专用发票 02增值税普通发票 03国际形式发票
	 */
	@ApiField("invoice_type")
	private String invoiceType;

	/**
	 * 操作人
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 关联的单据号
	 */
	@ApiField("out_bill_no")
	private String outBillNo;

	/**
	 * 业务单号类型
	 */
	@ApiField("out_bill_type")
	private String outBillType;

	/**
	 * 账单关联发票金额-元
	 */
	@ApiField("relate_amount")
	private String relateAmount;

	/**
	 * 关联到账单上的税额-元
	 */
	@ApiField("relate_tax_amt")
	private String relateTaxAmt;

	/**
	 * 销方角色2088账号pid
	 */
	@ApiField("seller_ip_role_id")
	private String sellerIpRoleId;

	/**
	 * 系统来源
	 */
	@ApiField("source")
	private String source;

	/**
	 * 票面税额-元
	 */
	@ApiField("tax_amt")
	private String taxAmt;

	/**
	 * 税率
	 */
	@ApiField("tax_rate")
	private String taxRate;

	public String getBuyerInstId() {
		return this.buyerInstId;
	}
	public void setBuyerInstId(String buyerInstId) {
		this.buyerInstId = buyerInstId;
	}

	public String getCurrencyCode() {
		return this.currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getExcludeTaxInvoiceAmt() {
		return this.excludeTaxInvoiceAmt;
	}
	public void setExcludeTaxInvoiceAmt(String excludeTaxInvoiceAmt) {
		this.excludeTaxInvoiceAmt = excludeTaxInvoiceAmt;
	}

	public String getInvoiceAmt() {
		return this.invoiceAmt;
	}
	public void setInvoiceAmt(String invoiceAmt) {
		this.invoiceAmt = invoiceAmt;
	}

	public String getInvoiceCode() {
		return this.invoiceCode;
	}
	public void setInvoiceCode(String invoiceCode) {
		this.invoiceCode = invoiceCode;
	}

	public String getInvoiceDate() {
		return this.invoiceDate;
	}
	public void setInvoiceDate(String invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public String getInvoiceMaterial() {
		return this.invoiceMaterial;
	}
	public void setInvoiceMaterial(String invoiceMaterial) {
		this.invoiceMaterial = invoiceMaterial;
	}

	public String getInvoiceNo() {
		return this.invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public String getInvoiceReceiveDate() {
		return this.invoiceReceiveDate;
	}
	public void setInvoiceReceiveDate(String invoiceReceiveDate) {
		this.invoiceReceiveDate = invoiceReceiveDate;
	}

	public String getInvoiceSource() {
		return this.invoiceSource;
	}
	public void setInvoiceSource(String invoiceSource) {
		this.invoiceSource = invoiceSource;
	}

	public String getInvoiceType() {
		return this.invoiceType;
	}
	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getOutBillNo() {
		return this.outBillNo;
	}
	public void setOutBillNo(String outBillNo) {
		this.outBillNo = outBillNo;
	}

	public String getOutBillType() {
		return this.outBillType;
	}
	public void setOutBillType(String outBillType) {
		this.outBillType = outBillType;
	}

	public String getRelateAmount() {
		return this.relateAmount;
	}
	public void setRelateAmount(String relateAmount) {
		this.relateAmount = relateAmount;
	}

	public String getRelateTaxAmt() {
		return this.relateTaxAmt;
	}
	public void setRelateTaxAmt(String relateTaxAmt) {
		this.relateTaxAmt = relateTaxAmt;
	}

	public String getSellerIpRoleId() {
		return this.sellerIpRoleId;
	}
	public void setSellerIpRoleId(String sellerIpRoleId) {
		this.sellerIpRoleId = sellerIpRoleId;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getTaxAmt() {
		return this.taxAmt;
	}
	public void setTaxAmt(String taxAmt) {
		this.taxAmt = taxAmt;
	}

	public String getTaxRate() {
		return this.taxRate;
	}
	public void setTaxRate(String taxRate) {
		this.taxRate = taxRate;
	}

}
