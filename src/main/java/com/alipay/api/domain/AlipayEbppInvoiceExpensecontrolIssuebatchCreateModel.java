package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 手动发放额度接口
 *
 * @author auto create
 * @since 1.0, 2022-08-18 15:34:46
 */
public class AlipayEbppInvoiceExpensecontrolIssuebatchCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3496221452699486219L;

	/**
	 * 共同账户id - 适用于在企业码小程序创建的共同账户，和agreement_no搭配使用
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 授权签约协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 发放批次号，用于幂等校验本次发放
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * 额度有效结束时间
	 */
	@ApiField("effective_end_date")
	private Date effectiveEndDate;

	/**
	 * 额度有效起始时间
	 */
	@ApiField("effective_start_date")
	private Date effectiveStartDate;

	/**
	 * 企业ID - 适用于在企业码PC端创建的企业账号
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 制度id
	 */
	@ApiField("institution_id")
	private String institutionId;

	/**
	 * 发放说明
	 */
	@ApiField("issue_desc")
	private String issueDesc;

	/**
	 * 发放名称
	 */
	@ApiField("issue_name")
	private String issueName;

	/**
	 * 员工发放信息列表
	 */
	@ApiListField("issue_target_info_list")
	@ApiField("issue_target_info_content")
	private List<IssueTargetInfoContent> issueTargetInfoList;

	/**
	 * 额度类型
	 */
	@ApiField("quota_type")
	private String quotaType;

	/**
	 * 是否可转赠，枚举：0（不可转赠）、1（可转赠）
	 */
	@ApiField("share_mode")
	private String shareMode;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getBatchNo() {
		return this.batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public Date getEffectiveEndDate() {
		return this.effectiveEndDate;
	}
	public void setEffectiveEndDate(Date effectiveEndDate) {
		this.effectiveEndDate = effectiveEndDate;
	}

	public Date getEffectiveStartDate() {
		return this.effectiveStartDate;
	}
	public void setEffectiveStartDate(Date effectiveStartDate) {
		this.effectiveStartDate = effectiveStartDate;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getInstitutionId() {
		return this.institutionId;
	}
	public void setInstitutionId(String institutionId) {
		this.institutionId = institutionId;
	}

	public String getIssueDesc() {
		return this.issueDesc;
	}
	public void setIssueDesc(String issueDesc) {
		this.issueDesc = issueDesc;
	}

	public String getIssueName() {
		return this.issueName;
	}
	public void setIssueName(String issueName) {
		this.issueName = issueName;
	}

	public List<IssueTargetInfoContent> getIssueTargetInfoList() {
		return this.issueTargetInfoList;
	}
	public void setIssueTargetInfoList(List<IssueTargetInfoContent> issueTargetInfoList) {
		this.issueTargetInfoList = issueTargetInfoList;
	}

	public String getQuotaType() {
		return this.quotaType;
	}
	public void setQuotaType(String quotaType) {
		this.quotaType = quotaType;
	}

	public String getShareMode() {
		return this.shareMode;
	}
	public void setShareMode(String shareMode) {
		this.shareMode = shareMode;
	}

}
