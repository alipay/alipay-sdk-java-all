package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企业开庭公告明细
 *
 * @author auto create
 * @since 1.0, 2024-12-19 14:25:27
 */
public class EpCourtNoticeInfo extends AlipayObject {

	private static final long serialVersionUID = 1232592687618319875L;

	/**
	 * 所属地区
	 */
	@ApiField("affiliating_area")
	private EpSubordinateRegionalInfo affiliatingArea;

	/**
	 * 正文
	 */
	@ApiField("body")
	private String body;

	/**
	 * 案由
	 */
	@ApiField("case_cause")
	private String caseCause;

	/**
	 * 案号
	 */
	@ApiField("case_no")
	private String caseNo;

	/**
	 * 法院
	 */
	@ApiField("court")
	private String court;

	/**
	 * 开庭时间
	 */
	@ApiField("court_date")
	private String courtDate;

	/**
	 * 发布时间
	 */
	@ApiField("issue_date")
	private String issueDate;

	/**
	 * 其他角色
	 */
	@ApiListField("other_roles")
	@ApiField("string")
	private List<String> otherRoles;

	/**
	 * 当事人详情
	 */
	@ApiListField("parties_details")
	@ApiField("ep_parties_details_info")
	private List<EpPartiesDetailsInfo> partiesDetails;

	/**
	 * 标题
	 */
	@ApiField("titles")
	private String titles;

	public EpSubordinateRegionalInfo getAffiliatingArea() {
		return this.affiliatingArea;
	}
	public void setAffiliatingArea(EpSubordinateRegionalInfo affiliatingArea) {
		this.affiliatingArea = affiliatingArea;
	}

	public String getBody() {
		return this.body;
	}
	public void setBody(String body) {
		this.body = body;
	}

	public String getCaseCause() {
		return this.caseCause;
	}
	public void setCaseCause(String caseCause) {
		this.caseCause = caseCause;
	}

	public String getCaseNo() {
		return this.caseNo;
	}
	public void setCaseNo(String caseNo) {
		this.caseNo = caseNo;
	}

	public String getCourt() {
		return this.court;
	}
	public void setCourt(String court) {
		this.court = court;
	}

	public String getCourtDate() {
		return this.courtDate;
	}
	public void setCourtDate(String courtDate) {
		this.courtDate = courtDate;
	}

	public String getIssueDate() {
		return this.issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	public List<String> getOtherRoles() {
		return this.otherRoles;
	}
	public void setOtherRoles(List<String> otherRoles) {
		this.otherRoles = otherRoles;
	}

	public List<EpPartiesDetailsInfo> getPartiesDetails() {
		return this.partiesDetails;
	}
	public void setPartiesDetails(List<EpPartiesDetailsInfo> partiesDetails) {
		this.partiesDetails = partiesDetails;
	}

	public String getTitles() {
		return this.titles;
	}
	public void setTitles(String titles) {
		this.titles = titles;
	}

}
