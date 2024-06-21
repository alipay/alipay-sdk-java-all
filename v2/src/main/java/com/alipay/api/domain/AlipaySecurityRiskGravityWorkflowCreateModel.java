package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 多方安全商业化对外输出合规任务审批流程创建
 *
 * @author auto create
 * @since 1.0, 2023-06-12 12:03:32
 */
public class AlipaySecurityRiskGravityWorkflowCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3856362777272481337L;

	/**
	 * 需要合规审批的举报特征表详细信息
	 */
	@ApiField("auth_feature_tables")
	private String authFeatureTables;

	/**
	 * 待合规审核的样本表及其对应的字段详情信息
	 */
	@ApiField("check_sample_tables")
	private String checkSampleTables;

	/**
	 * 合规任务表的主键id
	 */
	@ApiField("contract_id")
	private String contractId;

	/**
	 * 项目的描述信息
	 */
	@ApiField("description")
	private String description;

	/**
	 * 统一登录的域账户
	 */
	@ApiField("domain_account")
	private String domainAccount;

	/**
	 * 展示合作的机构信息
	 */
	@ApiField("org_info")
	private String orgInfo;

	/**
	 * 项目的主键id
	 */
	@ApiField("project_id")
	private String projectId;

	/**
	 * 项目的名称
	 */
	@ApiField("project_name")
	private String projectName;

	/**
	 * 历史审批数据，供审核人来参考
	 */
	@ApiField("review_history")
	private String reviewHistory;

	public String getAuthFeatureTables() {
		return this.authFeatureTables;
	}
	public void setAuthFeatureTables(String authFeatureTables) {
		this.authFeatureTables = authFeatureTables;
	}

	public String getCheckSampleTables() {
		return this.checkSampleTables;
	}
	public void setCheckSampleTables(String checkSampleTables) {
		this.checkSampleTables = checkSampleTables;
	}

	public String getContractId() {
		return this.contractId;
	}
	public void setContractId(String contractId) {
		this.contractId = contractId;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getDomainAccount() {
		return this.domainAccount;
	}
	public void setDomainAccount(String domainAccount) {
		this.domainAccount = domainAccount;
	}

	public String getOrgInfo() {
		return this.orgInfo;
	}
	public void setOrgInfo(String orgInfo) {
		this.orgInfo = orgInfo;
	}

	public String getProjectId() {
		return this.projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return this.projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getReviewHistory() {
		return this.reviewHistory;
	}
	public void setReviewHistory(String reviewHistory) {
		this.reviewHistory = reviewHistory;
	}

}
