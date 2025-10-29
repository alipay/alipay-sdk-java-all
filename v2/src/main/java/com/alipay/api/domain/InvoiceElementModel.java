package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 发票要素模型
 *
 * @author auto create
 * @since 1.0, 2024-11-11 15:31:05
 */
public class InvoiceElementModel extends AlipayObject {

	private static final long serialVersionUID = 8754683815554941246L;

	/**
	 * 发票报销状态
	 */
	@ApiField("expense_status")
	private String expenseStatus;

	/**
	 * 扩展字段
	 */
	@ApiField("extend_fields")
	private String extendFields;

	/**
	 * 防伪校验码
	 */
	@ApiField("fake_code")
	private String fakeCode;

	/**
	 * 发票原始文件文件类型
	 */
	@ApiField("file_type")
	private String fileType;

	/**
	 * 发票是否有pdf文件
	 */
	@ApiField("has_pdf_file")
	private Boolean hasPdfFile;

	/**
	 * 该发票可能存在异常，请核实后使用
true:无异常
false:存在异常
	 */
	@ApiField("has_risk")
	private Boolean hasRisk;

	/**
	 * 发票金额，含税，单位元
	 */
	@ApiField("invoice_amount")
	private String invoiceAmount;

	/**
	 * 发票代码
	 */
	@ApiField("invoice_code")
	private String invoiceCode;

	/**
	 * 开票日期
	 */
	@ApiField("invoice_date")
	private String invoiceDate;

	/**
	 * 发票pdf文件转换后jpg预览地址
	 */
	@ApiField("invoice_img_url")
	private String invoiceImgUrl;

	/**
	 * 发票类型
	 */
	@ApiField("invoice_kind")
	private String invoiceKind;

	/**
	 * 发票号码
	 */
	@ApiField("invoice_no")
	private String invoiceNo;

	/**
	 * 发票状态　
	 */
	@ApiField("invoice_status")
	private String invoiceStatus;

	/**
	 * 服务商联系方式
	 */
	@ApiField("isv_contact")
	private String isvContact;

	/**
	 * 服务商名称
	 */
	@ApiField("isv_name")
	private String isvName;

	/**
	 * logo地址
	 */
	@ApiField("logo_url")
	private String logoUrl;

	/**
	 * 商户全称
	 */
	@ApiField("m_name")
	private String mName;

	/**
	 * 发票金额，不含税，单位元
	 */
	@ApiField("out_tax_amount")
	private String outTaxAmount;

	/**
	 * 销方名称
	 */
	@ApiField("payee_name")
	private String payeeName;

	/**
	 * 销方税号
	 */
	@ApiField("payee_tax_no")
	private String payeeTaxNo;

	/**
	 * 购方名称
	 */
	@ApiField("payer_name")
	private String payerName;

	/**
	 * 购方税号
	 */
	@ApiField("payer_tax_no")
	private String payerTaxNo;

	/**
	 * PDF的下载链接
	 */
	@ApiField("pdf_url")
	private String pdfUrl;

	/**
	 * 表示发票来源，由发票回传方带入。例如：bz_gd，bz_ele，bz_tmall等
	 */
	@ApiField("source")
	private String source;

	/**
	 * 该发票对应的交易
	 */
	@ApiListField("trade_list")
	@ApiField("einv_trade")
	private List<EinvTrade> tradeList;

	/**
	 * 交易匹配结果
	 */
	@ApiField("trade_match_result")
	private String tradeMatchResult;

	public String getExpenseStatus() {
		return this.expenseStatus;
	}
	public void setExpenseStatus(String expenseStatus) {
		this.expenseStatus = expenseStatus;
	}

	public String getExtendFields() {
		return this.extendFields;
	}
	public void setExtendFields(String extendFields) {
		this.extendFields = extendFields;
	}

	public String getFakeCode() {
		return this.fakeCode;
	}
	public void setFakeCode(String fakeCode) {
		this.fakeCode = fakeCode;
	}

	public String getFileType() {
		return this.fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public Boolean getHasPdfFile() {
		return this.hasPdfFile;
	}
	public void setHasPdfFile(Boolean hasPdfFile) {
		this.hasPdfFile = hasPdfFile;
	}

	public Boolean getHasRisk() {
		return this.hasRisk;
	}
	public void setHasRisk(Boolean hasRisk) {
		this.hasRisk = hasRisk;
	}

	public String getInvoiceAmount() {
		return this.invoiceAmount;
	}
	public void setInvoiceAmount(String invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
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

	public String getInvoiceImgUrl() {
		return this.invoiceImgUrl;
	}
	public void setInvoiceImgUrl(String invoiceImgUrl) {
		this.invoiceImgUrl = invoiceImgUrl;
	}

	public String getInvoiceKind() {
		return this.invoiceKind;
	}
	public void setInvoiceKind(String invoiceKind) {
		this.invoiceKind = invoiceKind;
	}

	public String getInvoiceNo() {
		return this.invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public String getInvoiceStatus() {
		return this.invoiceStatus;
	}
	public void setInvoiceStatus(String invoiceStatus) {
		this.invoiceStatus = invoiceStatus;
	}

	public String getIsvContact() {
		return this.isvContact;
	}
	public void setIsvContact(String isvContact) {
		this.isvContact = isvContact;
	}

	public String getIsvName() {
		return this.isvName;
	}
	public void setIsvName(String isvName) {
		this.isvName = isvName;
	}

	public String getLogoUrl() {
		return this.logoUrl;
	}
	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	public String getmName() {
		return this.mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getOutTaxAmount() {
		return this.outTaxAmount;
	}
	public void setOutTaxAmount(String outTaxAmount) {
		this.outTaxAmount = outTaxAmount;
	}

	public String getPayeeName() {
		return this.payeeName;
	}
	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}

	public String getPayeeTaxNo() {
		return this.payeeTaxNo;
	}
	public void setPayeeTaxNo(String payeeTaxNo) {
		this.payeeTaxNo = payeeTaxNo;
	}

	public String getPayerName() {
		return this.payerName;
	}
	public void setPayerName(String payerName) {
		this.payerName = payerName;
	}

	public String getPayerTaxNo() {
		return this.payerTaxNo;
	}
	public void setPayerTaxNo(String payerTaxNo) {
		this.payerTaxNo = payerTaxNo;
	}

	public String getPdfUrl() {
		return this.pdfUrl;
	}
	public void setPdfUrl(String pdfUrl) {
		this.pdfUrl = pdfUrl;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public List<EinvTrade> getTradeList() {
		return this.tradeList;
	}
	public void setTradeList(List<EinvTrade> tradeList) {
		this.tradeList = tradeList;
	}

	public String getTradeMatchResult() {
		return this.tradeMatchResult;
	}
	public void setTradeMatchResult(String tradeMatchResult) {
		this.tradeMatchResult = tradeMatchResult;
	}

}
