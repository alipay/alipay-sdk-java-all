package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 核销单DTO
 *
 * @author auto create
 * @since 1.0, 2023-08-25 14:55:34
 */
public class BizInvoiceBillInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 3352353672756582685L;

	/**
	 * 金额，单位为各币种的“元”单位，精确到小数点后两位。
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 开票描述
	 */
	@ApiField("bill_desc")
	private String billDesc;

	/**
	 * 业务身份
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 业务单据号列表
	 */
	@ApiListField("biz_document_nos")
	@ApiField("string")
	private List<String> bizDocumentNos;

	/**
	 * 费用归属OU
	 */
	@ApiField("company_info")
	private CompanyInfoRequestDTO companyInfo;

	/**
	 * 创建开票通知到
	 */
	@ApiField("create_invoice_notify")
	private Boolean createInvoiceNotify;

	/**
	 * 币种
	 */
	@ApiField("currency_code")
	private String currencyCode;

	/**
	 * 扣减策略
	 */
	@ApiField("deduct_strategy")
	private String deductStrategy;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private GfsmartpayExtInfo extInfo;

	/**
	 * 幂等Id
	 */
	@ApiField("idempotent_id")
	private String idempotentId;

	/**
	 * 发票列表
	 */
	@ApiListField("invoices")
	@ApiField("biz_invoice_d_t_o")
	private List<BizInvoiceDTO> invoices;

	/**
	 * 是否异步
	 */
	@ApiField("is_async")
	private Boolean isAsync;

	/**
	 * 操作人
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 关联单据号列表
	 */
	@ApiListField("related_document_nos")
	@ApiField("string")
	private List<String> relatedDocumentNos;

	/**
	 * 系统来源
	 */
	@ApiField("source_type")
	private String sourceType;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBillDesc() {
		return this.billDesc;
	}
	public void setBillDesc(String billDesc) {
		this.billDesc = billDesc;
	}

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public List<String> getBizDocumentNos() {
		return this.bizDocumentNos;
	}
	public void setBizDocumentNos(List<String> bizDocumentNos) {
		this.bizDocumentNos = bizDocumentNos;
	}

	public CompanyInfoRequestDTO getCompanyInfo() {
		return this.companyInfo;
	}
	public void setCompanyInfo(CompanyInfoRequestDTO companyInfo) {
		this.companyInfo = companyInfo;
	}

	public Boolean getCreateInvoiceNotify() {
		return this.createInvoiceNotify;
	}
	public void setCreateInvoiceNotify(Boolean createInvoiceNotify) {
		this.createInvoiceNotify = createInvoiceNotify;
	}

	public String getCurrencyCode() {
		return this.currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getDeductStrategy() {
		return this.deductStrategy;
	}
	public void setDeductStrategy(String deductStrategy) {
		this.deductStrategy = deductStrategy;
	}

	public GfsmartpayExtInfo getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(GfsmartpayExtInfo extInfo) {
		this.extInfo = extInfo;
	}

	public String getIdempotentId() {
		return this.idempotentId;
	}
	public void setIdempotentId(String idempotentId) {
		this.idempotentId = idempotentId;
	}

	public List<BizInvoiceDTO> getInvoices() {
		return this.invoices;
	}
	public void setInvoices(List<BizInvoiceDTO> invoices) {
		this.invoices = invoices;
	}

	public Boolean getIsAsync() {
		return this.isAsync;
	}
	public void setIsAsync(Boolean isAsync) {
		this.isAsync = isAsync;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public List<String> getRelatedDocumentNos() {
		return this.relatedDocumentNos;
	}
	public void setRelatedDocumentNos(List<String> relatedDocumentNos) {
		this.relatedDocumentNos = relatedDocumentNos;
	}

	public String getSourceType() {
		return this.sourceType;
	}
	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

}
