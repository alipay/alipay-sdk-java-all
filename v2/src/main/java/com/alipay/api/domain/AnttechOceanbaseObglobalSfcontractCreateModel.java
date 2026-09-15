package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * salesforce创建合同接口
 *
 * @author auto create
 * @since 1.0, 2026-09-09 14:17:53
 */
public class AnttechOceanbaseObglobalSfcontractCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6898618369911377785L;

	/**
	 * 合同申请人工号
	 */
	@ApiField("applicant_work_no")
	private String applicantWorkNo;

	/**
	 * CSM审批人工号
	 */
	@ApiField("audit_csm_work_no")
	private String auditCsmWorkNo;

	/**
	 * 合同创建系统,OCEAN_BASE/ZHENLING
	 */
	@ApiField("contract_create_system")
	private String contractCreateSystem;

	/**
	 * 合同标题
	 */
	@ApiField("contract_title")
	private String contractTitle;

	/**
	 * 合同类别枚举
	 */
	@ApiField("contract_type")
	private String contractType;

	/**
	 * 外部系统合同id
	 */
	@ApiField("external_contract_id")
	private String externalContractId;

	/**
	 * 最终管理员邮箱，来源为CONTRACT_AUTHORIZED时必填，否则可不传
	 */
	@ApiField("final_admin_email")
	private String finalAdminEmail;

	/**
	 * 最终管理员邮箱来源
	 */
	@ApiField("final_admin_email_source_code")
	private String finalAdminEmailSourceCode;

	/**
	 * 商机编码
	 */
	@ApiField("leads_code")
	private String leadsCode;

	/**
	 * OB签约自身主体名称
	 */
	@ApiField("our_sign_subject")
	private String ourSignSubject;

	/**
	 * 报价审批单号
	 */
	@ApiField("quotation_application_item_no")
	private String quotationApplicationItemNo;

	/**
	 * 幂等请求号；同一次请求重试必须保持一致
	 */
	@ApiField("request_id")
	private String requestId;

	public String getApplicantWorkNo() {
		return this.applicantWorkNo;
	}
	public void setApplicantWorkNo(String applicantWorkNo) {
		this.applicantWorkNo = applicantWorkNo;
	}

	public String getAuditCsmWorkNo() {
		return this.auditCsmWorkNo;
	}
	public void setAuditCsmWorkNo(String auditCsmWorkNo) {
		this.auditCsmWorkNo = auditCsmWorkNo;
	}

	public String getContractCreateSystem() {
		return this.contractCreateSystem;
	}
	public void setContractCreateSystem(String contractCreateSystem) {
		this.contractCreateSystem = contractCreateSystem;
	}

	public String getContractTitle() {
		return this.contractTitle;
	}
	public void setContractTitle(String contractTitle) {
		this.contractTitle = contractTitle;
	}

	public String getContractType() {
		return this.contractType;
	}
	public void setContractType(String contractType) {
		this.contractType = contractType;
	}

	public String getExternalContractId() {
		return this.externalContractId;
	}
	public void setExternalContractId(String externalContractId) {
		this.externalContractId = externalContractId;
	}

	public String getFinalAdminEmail() {
		return this.finalAdminEmail;
	}
	public void setFinalAdminEmail(String finalAdminEmail) {
		this.finalAdminEmail = finalAdminEmail;
	}

	public String getFinalAdminEmailSourceCode() {
		return this.finalAdminEmailSourceCode;
	}
	public void setFinalAdminEmailSourceCode(String finalAdminEmailSourceCode) {
		this.finalAdminEmailSourceCode = finalAdminEmailSourceCode;
	}

	public String getLeadsCode() {
		return this.leadsCode;
	}
	public void setLeadsCode(String leadsCode) {
		this.leadsCode = leadsCode;
	}

	public String getOurSignSubject() {
		return this.ourSignSubject;
	}
	public void setOurSignSubject(String ourSignSubject) {
		this.ourSignSubject = ourSignSubject;
	}

	public String getQuotationApplicationItemNo() {
		return this.quotationApplicationItemNo;
	}
	public void setQuotationApplicationItemNo(String quotationApplicationItemNo) {
		this.quotationApplicationItemNo = quotationApplicationItemNo;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
