package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企业行政处罚明细
 *
 * @author auto create
 * @since 1.0, 2024-12-19 14:16:44
 */
public class EpAdminPenaltyInfo extends AlipayObject {

	private static final long serialVersionUID = 3425884562789714756L;

	/**
	 * 案件名称
	 */
	@ApiField("case_name")
	private String caseName;

	/**
	 * 事件时间
	 */
	@ApiField("incident_date")
	private String incidentDate;

	/**
	 * 发布时间
	 */
	@ApiField("issue_date")
	private String issueDate;

	/**
	 * 企业行政处罚当事人信息列表
	 */
	@ApiListField("parties")
	@ApiField("ep_admin_penalty_parties_info")
	private List<EpAdminPenaltyPartiesInfo> parties;

	/**
	 * 处罚事由
	 */
	@ApiListField("punish_cause")
	@ApiField("string")
	private List<String> punishCause;

	/**
	 * 处罚决定日期
	 */
	@ApiField("punish_date")
	private String punishDate;

	/**
	 * 处罚决定
	 */
	@ApiListField("punish_decision")
	@ApiField("string")
	private List<String> punishDecision;

	/**
	 * 处罚决定文书号
	 */
	@ApiField("punish_decision_no")
	private String punishDecisionNo;

	/**
	 * 处罚详情
	 */
	@ApiField("punish_details")
	private String punishDetails;

	/**
	 * 处罚依据
	 */
	@ApiListField("punish_gist")
	@ApiField("string")
	private List<String> punishGist;

	/**
	 * 处罚决定机关
	 */
	@ApiListField("punish_organ")
	@ApiField("string")
	private List<String> punishOrgan;

	/**
	 * 来源
	 */
	@ApiField("source")
	private String source;

	/**
	 * 标题
	 */
	@ApiField("title")
	private String title;

	public String getCaseName() {
		return this.caseName;
	}
	public void setCaseName(String caseName) {
		this.caseName = caseName;
	}

	public String getIncidentDate() {
		return this.incidentDate;
	}
	public void setIncidentDate(String incidentDate) {
		this.incidentDate = incidentDate;
	}

	public String getIssueDate() {
		return this.issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	public List<EpAdminPenaltyPartiesInfo> getParties() {
		return this.parties;
	}
	public void setParties(List<EpAdminPenaltyPartiesInfo> parties) {
		this.parties = parties;
	}

	public List<String> getPunishCause() {
		return this.punishCause;
	}
	public void setPunishCause(List<String> punishCause) {
		this.punishCause = punishCause;
	}

	public String getPunishDate() {
		return this.punishDate;
	}
	public void setPunishDate(String punishDate) {
		this.punishDate = punishDate;
	}

	public List<String> getPunishDecision() {
		return this.punishDecision;
	}
	public void setPunishDecision(List<String> punishDecision) {
		this.punishDecision = punishDecision;
	}

	public String getPunishDecisionNo() {
		return this.punishDecisionNo;
	}
	public void setPunishDecisionNo(String punishDecisionNo) {
		this.punishDecisionNo = punishDecisionNo;
	}

	public String getPunishDetails() {
		return this.punishDetails;
	}
	public void setPunishDetails(String punishDetails) {
		this.punishDetails = punishDetails;
	}

	public List<String> getPunishGist() {
		return this.punishGist;
	}
	public void setPunishGist(List<String> punishGist) {
		this.punishGist = punishGist;
	}

	public List<String> getPunishOrgan() {
		return this.punishOrgan;
	}
	public void setPunishOrgan(List<String> punishOrgan) {
		this.punishOrgan = punishOrgan;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
