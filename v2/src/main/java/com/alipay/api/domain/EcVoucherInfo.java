package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业码凭证详情
 *
 * @author auto create
 * @since 1.0, 2024-11-11 20:47:18
 */
public class EcVoucherInfo extends AlipayObject {

	private static final long serialVersionUID = 2742279586757443452L;

	/**
	 * 共同账户ID
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 员工ID，汇总发票该字段无效
	 */
	@ApiField("employee_id")
	private String employeeId;

	/**
	 * 企业ID
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 发票账单合规匹配结果 当前字段已废弃(请更换“合规信息”凭证，通过voucher_content字段获取发票账单匹配的合规结果)
	 */
	@ApiField("invoice_compliance_check_result")
	@Deprecated
	private InvoiceComplianceCheckResult invoiceComplianceCheckResult;

	/**
	 * 员工支付宝UID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 员工支付宝UID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 凭证内容
	 */
	@ApiField("voucher_content")
	private String voucherContent;

	/**
	 * 凭证创建时间，格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("voucher_date")
	private String voucherDate;

	/**
	 * 凭证ID，幂等用
	 */
	@ApiField("voucher_id")
	private String voucherId;

	/**
	 * 凭证来源
	 */
	@ApiField("voucher_source")
	private String voucherSource;

	/**
	 * 凭证类型
	 */
	@ApiField("voucher_type")
	private String voucherType;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getEmployeeId() {
		return this.employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public InvoiceComplianceCheckResult getInvoiceComplianceCheckResult() {
		return this.invoiceComplianceCheckResult;
	}
	public void setInvoiceComplianceCheckResult(InvoiceComplianceCheckResult invoiceComplianceCheckResult) {
		this.invoiceComplianceCheckResult = invoiceComplianceCheckResult;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getVoucherContent() {
		return this.voucherContent;
	}
	public void setVoucherContent(String voucherContent) {
		this.voucherContent = voucherContent;
	}

	public String getVoucherDate() {
		return this.voucherDate;
	}
	public void setVoucherDate(String voucherDate) {
		this.voucherDate = voucherDate;
	}

	public String getVoucherId() {
		return this.voucherId;
	}
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

	public String getVoucherSource() {
		return this.voucherSource;
	}
	public void setVoucherSource(String voucherSource) {
		this.voucherSource = voucherSource;
	}

	public String getVoucherType() {
		return this.voucherType;
	}
	public void setVoucherType(String voucherType) {
		this.voucherType = voucherType;
	}

}
