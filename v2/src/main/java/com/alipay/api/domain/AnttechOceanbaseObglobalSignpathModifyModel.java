package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商机同步签约路径开放接口
 *
 * @author auto create
 * @since 1.0, 2025-04-18 11:27:25
 */
public class AnttechOceanbaseObglobalSignpathModifyModel extends AlipayObject {

	private static final long serialVersionUID = 6558847323673528816L;

	/**
	 * 阿里云结算模式
	 */
	@ApiField("alicloud_settlement_mode")
	private String alicloudSettlementMode;

	/**
	 * 0=审批中，1=审批驳回，2=审批通过，6=撤销审批
	 */
	@ApiField("approval_status")
	private Long approvalStatus;

	/**
	 * 最终客户签约对方主体ID，客户则为BID，伙伴则为PID
	 */
	@ApiField("final_customer_sign_other_party_subject_id")
	private String finalCustomerSignOtherPartySubjectId;

	/**
	 * 最终客户签约对方主体名称
	 */
	@ApiField("final_customer_sign_other_party_subject_name")
	private String finalCustomerSignOtherPartySubjectName;

	/**
	 * 总代合作类型枚举
	 */
	@ApiField("general_agent_cooperation_type")
	private String generalAgentCooperationType;

	/**
	 * 商机编码
	 */
	@ApiField("leads_code")
	private String leadsCode;

	/**
	 * 伙伴ID，多个逗号隔开
	 */
	@ApiField("leads_other_partners")
	private String leadsOtherPartners;

	/**
	 * 其他伙伴名字,多个逗号隔开
	 */
	@ApiField("leads_other_partners_name")
	private String leadsOtherPartnersName;

	/**
	 * 操作人工号
	 */
	@ApiField("modifier")
	private String modifier;

	/**
	 * OB签约对方主体ID，客户则为BID，伙伴则为PID
	 */
	@ApiField("ob_sign_other_party_subject_id")
	private String obSignOtherPartySubjectId;

	/**
	 * OB签约对方主体名称
	 */
	@ApiField("ob_sign_other_party_subject_name")
	private String obSignOtherPartySubjectName;

	/**
	 * 签约路径枚举
	 */
	@ApiField("sign_path")
	private String signPath;

	public String getAlicloudSettlementMode() {
		return this.alicloudSettlementMode;
	}
	public void setAlicloudSettlementMode(String alicloudSettlementMode) {
		this.alicloudSettlementMode = alicloudSettlementMode;
	}

	public Long getApprovalStatus() {
		return this.approvalStatus;
	}
	public void setApprovalStatus(Long approvalStatus) {
		this.approvalStatus = approvalStatus;
	}

	public String getFinalCustomerSignOtherPartySubjectId() {
		return this.finalCustomerSignOtherPartySubjectId;
	}
	public void setFinalCustomerSignOtherPartySubjectId(String finalCustomerSignOtherPartySubjectId) {
		this.finalCustomerSignOtherPartySubjectId = finalCustomerSignOtherPartySubjectId;
	}

	public String getFinalCustomerSignOtherPartySubjectName() {
		return this.finalCustomerSignOtherPartySubjectName;
	}
	public void setFinalCustomerSignOtherPartySubjectName(String finalCustomerSignOtherPartySubjectName) {
		this.finalCustomerSignOtherPartySubjectName = finalCustomerSignOtherPartySubjectName;
	}

	public String getGeneralAgentCooperationType() {
		return this.generalAgentCooperationType;
	}
	public void setGeneralAgentCooperationType(String generalAgentCooperationType) {
		this.generalAgentCooperationType = generalAgentCooperationType;
	}

	public String getLeadsCode() {
		return this.leadsCode;
	}
	public void setLeadsCode(String leadsCode) {
		this.leadsCode = leadsCode;
	}

	public String getLeadsOtherPartners() {
		return this.leadsOtherPartners;
	}
	public void setLeadsOtherPartners(String leadsOtherPartners) {
		this.leadsOtherPartners = leadsOtherPartners;
	}

	public String getLeadsOtherPartnersName() {
		return this.leadsOtherPartnersName;
	}
	public void setLeadsOtherPartnersName(String leadsOtherPartnersName) {
		this.leadsOtherPartnersName = leadsOtherPartnersName;
	}

	public String getModifier() {
		return this.modifier;
	}
	public void setModifier(String modifier) {
		this.modifier = modifier;
	}

	public String getObSignOtherPartySubjectId() {
		return this.obSignOtherPartySubjectId;
	}
	public void setObSignOtherPartySubjectId(String obSignOtherPartySubjectId) {
		this.obSignOtherPartySubjectId = obSignOtherPartySubjectId;
	}

	public String getObSignOtherPartySubjectName() {
		return this.obSignOtherPartySubjectName;
	}
	public void setObSignOtherPartySubjectName(String obSignOtherPartySubjectName) {
		this.obSignOtherPartySubjectName = obSignOtherPartySubjectName;
	}

	public String getSignPath() {
		return this.signPath;
	}
	public void setSignPath(String signPath) {
		this.signPath = signPath;
	}

}
