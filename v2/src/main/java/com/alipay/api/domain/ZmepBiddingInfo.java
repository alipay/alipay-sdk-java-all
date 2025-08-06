package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 工商企业招投标信息
 *
 * @author auto create
 * @since 1.0, 2025-01-20 11:20:22
 */
public class ZmepBiddingInfo extends AlipayObject {

	private static final long serialVersionUID = 1851118239766679485L;

	/**
	 * 代理机构
	 */
	@ApiField("agency_organization")
	private String agencyOrganization;

	/**
	 * 中标人
	 */
	@ApiListField("bid_winner")
	@ApiField("zmep_bidding_target_info")
	private List<ZmepBiddingTargetInfo> bidWinner;

	/**
	 * 正文
	 */
	@ApiField("body")
	private String body;

	/**
	 * 候选人
	 */
	@ApiListField("candidate")
	@ApiField("zmep_bidding_target_info")
	private List<ZmepBiddingTargetInfo> candidate;

	/**
	 * 公告类型
	 */
	@ApiField("gglx")
	private String gglx;

	/**
	 * 发布时间
	 */
	@ApiField("publish_time")
	private String publishTime;

	/**
	 * 采购人
	 */
	@ApiListField("purchasing_agent")
	@ApiField("string")
	private List<String> purchasingAgent;

	/**
	 * 地区
	 */
	@ApiField("region")
	private String region;

	/**
	 * 身份
	 */
	@ApiListField("role")
	@ApiField("string")
	private List<String> role;

	/**
	 * 标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 项目编号
	 */
	@ApiField("xmbh")
	private String xmbh;

	public String getAgencyOrganization() {
		return this.agencyOrganization;
	}
	public void setAgencyOrganization(String agencyOrganization) {
		this.agencyOrganization = agencyOrganization;
	}

	public List<ZmepBiddingTargetInfo> getBidWinner() {
		return this.bidWinner;
	}
	public void setBidWinner(List<ZmepBiddingTargetInfo> bidWinner) {
		this.bidWinner = bidWinner;
	}

	public String getBody() {
		return this.body;
	}
	public void setBody(String body) {
		this.body = body;
	}

	public List<ZmepBiddingTargetInfo> getCandidate() {
		return this.candidate;
	}
	public void setCandidate(List<ZmepBiddingTargetInfo> candidate) {
		this.candidate = candidate;
	}

	public String getGglx() {
		return this.gglx;
	}
	public void setGglx(String gglx) {
		this.gglx = gglx;
	}

	public String getPublishTime() {
		return this.publishTime;
	}
	public void setPublishTime(String publishTime) {
		this.publishTime = publishTime;
	}

	public List<String> getPurchasingAgent() {
		return this.purchasingAgent;
	}
	public void setPurchasingAgent(List<String> purchasingAgent) {
		this.purchasingAgent = purchasingAgent;
	}

	public String getRegion() {
		return this.region;
	}
	public void setRegion(String region) {
		this.region = region;
	}

	public List<String> getRole() {
		return this.role;
	}
	public void setRole(List<String> role) {
		this.role = role;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getXmbh() {
		return this.xmbh;
	}
	public void setXmbh(String xmbh) {
		this.xmbh = xmbh;
	}

}
