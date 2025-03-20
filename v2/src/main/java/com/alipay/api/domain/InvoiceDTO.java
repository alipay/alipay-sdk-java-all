package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票DTO
 *
 * @author auto create
 * @since 1.0, 2023-08-25 16:42:01
 */
public class InvoiceDTO extends AlipayObject {

	private static final long serialVersionUID = 6175551242188649699L;

	/**
	 * 票面金额（单位：各币种的“元”单位，精确到小数点后2位）
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 审批时间
	 */
	@ApiField("approve_date")
	private Date approveDate;

	/**
	 * 审批人
	 */
	@ApiField("approved_by")
	private String approvedBy;

	/**
	 * 归档号
	 */
	@ApiField("archive_no")
	private String archiveNo;

	/**
	 * 发票归档状态
	 */
	@ApiField("archive_status")
	private String archiveStatus;

	/**
	 * 业务身份
	 */
	@ApiField("biz_id")
	private Long bizId;

	/**
	 * 确认时间
	 */
	@ApiField("confirm_date")
	private Date confirmDate;

	/**
	 * 确认方式
	 */
	@ApiField("confirm_way")
	private String confirmWay;

	/**
	 * 创建时间
	 */
	@ApiField("create_date")
	private Date createDate;

	/**
	 * 发票币种
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 发票描述状态
	 */
	@ApiField("desc_status")
	private String descStatus;

	/**
	 * 废弃金额（单位：各币种的“元”单位，精确到小数点后2位）
	 */
	@ApiField("discard_amount")
	private String discardAmount;

	/**
	 * 分发发票ID
	 */
	@ApiField("distribute_invoice_id")
	private String distributeInvoiceId;

	/**
	 * 生效状态
	 */
	@ApiField("effect_status")
	private String effectStatus;

	/**
	 * 录入时间
	 */
	@ApiField("entry_date")
	private Date entryDate;

	/**
	 * 发票录入人
	 */
	@ApiField("entry_user")
	private String entryUser;

	/**
	 * 不含税金额（单位：各币种的“元”单位，精确到小数点后2位）
	 */
	@ApiField("excluding_tax_amount")
	private String excludingTaxAmount;

	/**
	 * ext信息
	 */
	@ApiField("ext_json")
	private String extJson;

	/**
	 * 开票日期
	 */
	@ApiField("invoice_date")
	private Date invoiceDate;

	/**
	 * 发票主键ID
	 */
	@ApiField("invoice_id")
	private Long invoiceId;

	/**
	 * 发票编号
	 */
	@ApiField("invoice_no")
	private String invoiceNo;

	/**
	 * 发票状态：UN_CONFIRM（未确认）,CONFIRMED（已确认）,RETURNED(退票）
	 */
	@ApiField("invoice_status")
	private String invoiceStatus;

	/**
	 * 发票类型(VAT，COMMON)
	 */
	@ApiField("invoice_type")
	private String invoiceType;

	/**
	 * 组织ID
	 */
	@ApiField("org_id")
	private Long orgId;

	/**
	 * 发票抬头
	 */
	@ApiField("ou_code")
	private String ouCode;

	/**
	 * 是否红票
	 */
	@ApiField("red")
	private Boolean red;

	/**
	 * 登记日期
	 */
	@ApiField("reg_date")
	private Date regDate;

	/**
	 * 退票人
	 */
	@ApiField("return_by")
	private String returnBy;

	/**
	 * 退票时间
	 */
	@ApiField("return_date")
	private Date returnDate;

	/**
	 * 退票原因
	 */
	@ApiField("return_reason")
	private String returnReason;

	/**
	 * 来源系统
	 */
	@ApiField("source_system")
	private String sourceSystem;

	/**
	 * 来源ID
	 */
	@ApiField("source_unique_no")
	private String sourceUniqueNo;

	/**
	 * 税额（单位：各币种的“元”单位，精确到小数点后2位）
	 */
	@ApiField("tax_amount")
	private String taxAmount;

	/**
	 * 实物发票ID
	 */
	@ApiField("tax_invoice_id")
	private String taxInvoiceId;

	/**
	 * 税率
	 */
	@ApiField("tax_rate")
	private String taxRate;

	/**
	 * 快递单号
	 */
	@ApiField("tracking_no")
	private String trackingNo;

	/**
	 * 使用金额（单位：各币种的“元”单位，精确到小数点后2位）
	 */
	@ApiField("use_amount")
	private String useAmount;

	/**
	 * 销方
	 */
	@ApiField("vendor_id")
	private Long vendorId;

	/**
	 * 认证时间
	 */
	@ApiField("verify_date")
	private Date verifyDate;

	/**
	 * 认证周期，YYYYMM格式
	 */
	@ApiField("verify_period")
	private String verifyPeriod;

	/**
	 * 认证状态
	 */
	@ApiField("verify_status")
	private String verifyStatus;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public Date getApproveDate() {
		return this.approveDate;
	}
	public void setApproveDate(Date approveDate) {
		this.approveDate = approveDate;
	}

	public String getApprovedBy() {
		return this.approvedBy;
	}
	public void setApprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
	}

	public String getArchiveNo() {
		return this.archiveNo;
	}
	public void setArchiveNo(String archiveNo) {
		this.archiveNo = archiveNo;
	}

	public String getArchiveStatus() {
		return this.archiveStatus;
	}
	public void setArchiveStatus(String archiveStatus) {
		this.archiveStatus = archiveStatus;
	}

	public Long getBizId() {
		return this.bizId;
	}
	public void setBizId(Long bizId) {
		this.bizId = bizId;
	}

	public Date getConfirmDate() {
		return this.confirmDate;
	}
	public void setConfirmDate(Date confirmDate) {
		this.confirmDate = confirmDate;
	}

	public String getConfirmWay() {
		return this.confirmWay;
	}
	public void setConfirmWay(String confirmWay) {
		this.confirmWay = confirmWay;
	}

	public Date getCreateDate() {
		return this.createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getDescStatus() {
		return this.descStatus;
	}
	public void setDescStatus(String descStatus) {
		this.descStatus = descStatus;
	}

	public String getDiscardAmount() {
		return this.discardAmount;
	}
	public void setDiscardAmount(String discardAmount) {
		this.discardAmount = discardAmount;
	}

	public String getDistributeInvoiceId() {
		return this.distributeInvoiceId;
	}
	public void setDistributeInvoiceId(String distributeInvoiceId) {
		this.distributeInvoiceId = distributeInvoiceId;
	}

	public String getEffectStatus() {
		return this.effectStatus;
	}
	public void setEffectStatus(String effectStatus) {
		this.effectStatus = effectStatus;
	}

	public Date getEntryDate() {
		return this.entryDate;
	}
	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

	public String getEntryUser() {
		return this.entryUser;
	}
	public void setEntryUser(String entryUser) {
		this.entryUser = entryUser;
	}

	public String getExcludingTaxAmount() {
		return this.excludingTaxAmount;
	}
	public void setExcludingTaxAmount(String excludingTaxAmount) {
		this.excludingTaxAmount = excludingTaxAmount;
	}

	public String getExtJson() {
		return this.extJson;
	}
	public void setExtJson(String extJson) {
		this.extJson = extJson;
	}

	public Date getInvoiceDate() {
		return this.invoiceDate;
	}
	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public Long getInvoiceId() {
		return this.invoiceId;
	}
	public void setInvoiceId(Long invoiceId) {
		this.invoiceId = invoiceId;
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

	public String getInvoiceType() {
		return this.invoiceType;
	}
	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}

	public Long getOrgId() {
		return this.orgId;
	}
	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}

	public String getOuCode() {
		return this.ouCode;
	}
	public void setOuCode(String ouCode) {
		this.ouCode = ouCode;
	}

	public Boolean getRed() {
		return this.red;
	}
	public void setRed(Boolean red) {
		this.red = red;
	}

	public Date getRegDate() {
		return this.regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public String getReturnBy() {
		return this.returnBy;
	}
	public void setReturnBy(String returnBy) {
		this.returnBy = returnBy;
	}

	public Date getReturnDate() {
		return this.returnDate;
	}
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public String getReturnReason() {
		return this.returnReason;
	}
	public void setReturnReason(String returnReason) {
		this.returnReason = returnReason;
	}

	public String getSourceSystem() {
		return this.sourceSystem;
	}
	public void setSourceSystem(String sourceSystem) {
		this.sourceSystem = sourceSystem;
	}

	public String getSourceUniqueNo() {
		return this.sourceUniqueNo;
	}
	public void setSourceUniqueNo(String sourceUniqueNo) {
		this.sourceUniqueNo = sourceUniqueNo;
	}

	public String getTaxAmount() {
		return this.taxAmount;
	}
	public void setTaxAmount(String taxAmount) {
		this.taxAmount = taxAmount;
	}

	public String getTaxInvoiceId() {
		return this.taxInvoiceId;
	}
	public void setTaxInvoiceId(String taxInvoiceId) {
		this.taxInvoiceId = taxInvoiceId;
	}

	public String getTaxRate() {
		return this.taxRate;
	}
	public void setTaxRate(String taxRate) {
		this.taxRate = taxRate;
	}

	public String getTrackingNo() {
		return this.trackingNo;
	}
	public void setTrackingNo(String trackingNo) {
		this.trackingNo = trackingNo;
	}

	public String getUseAmount() {
		return this.useAmount;
	}
	public void setUseAmount(String useAmount) {
		this.useAmount = useAmount;
	}

	public Long getVendorId() {
		return this.vendorId;
	}
	public void setVendorId(Long vendorId) {
		this.vendorId = vendorId;
	}

	public Date getVerifyDate() {
		return this.verifyDate;
	}
	public void setVerifyDate(Date verifyDate) {
		this.verifyDate = verifyDate;
	}

	public String getVerifyPeriod() {
		return this.verifyPeriod;
	}
	public void setVerifyPeriod(String verifyPeriod) {
		this.verifyPeriod = verifyPeriod;
	}

	public String getVerifyStatus() {
		return this.verifyStatus;
	}
	public void setVerifyStatus(String verifyStatus) {
		this.verifyStatus = verifyStatus;
	}

}
