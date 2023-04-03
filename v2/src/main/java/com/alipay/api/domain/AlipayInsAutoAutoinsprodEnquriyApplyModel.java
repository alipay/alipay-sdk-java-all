package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 询价接口
 *
 * @author auto create
 * @since 1.0, 2022-12-29 20:04:03
 */
public class AlipayInsAutoAutoinsprodEnquriyApplyModel extends AlipayObject {

	private static final long serialVersionUID = 6544169781459671629L;

	/**
	 * 代理人身份信息
	 */
	@ApiField("agent")
	private InsPerson agent;

	/**
	 * 代理人openId
	 */
	@ApiField("agent_open_id")
	private String agentOpenId;

	/**
	 * 中介(经办)组织信息
	 */
	@ApiField("agent_organization")
	private AgentOrganization agentOrganization;

	/**
	 * 技术对接主体组织信息,技术isv
	 */
	@ApiField("agent_tech_organization")
	private AgentOrganization agentTechOrganization;

	/**
	 * 代理人userId
	 */
	@ApiField("agent_user_id")
	private String agentUserId;

	/**
	 * 投保人身份信息
	 */
	@ApiField("applicant")
	private InsPerson applicant;

	/**
	 * 机构投保业务归属地信息
	 */
	@ApiField("apply_business_city")
	private ApplyBusinessCity applyBusinessCity;

	/**
	 * 车辆信息
	 */
	@ApiField("car")
	private Car car;

	/**
	 * 车主身份信息
	 */
	@ApiField("car_owner")
	private InsPerson carOwner;

	/**
	 * 投保城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 被保人身份信息
	 */
	@ApiField("insured")
	private InsPerson insured;

	/**
	 * 名单id，新电焊模式必传
	 */
	@ApiField("leads_id")
	private String leadsId;

	/**
	 * 外部询价申请业务单号（幂等字段）
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public InsPerson getAgent() {
		return this.agent;
	}
	public void setAgent(InsPerson agent) {
		this.agent = agent;
	}

	public String getAgentOpenId() {
		return this.agentOpenId;
	}
	public void setAgentOpenId(String agentOpenId) {
		this.agentOpenId = agentOpenId;
	}

	public AgentOrganization getAgentOrganization() {
		return this.agentOrganization;
	}
	public void setAgentOrganization(AgentOrganization agentOrganization) {
		this.agentOrganization = agentOrganization;
	}

	public AgentOrganization getAgentTechOrganization() {
		return this.agentTechOrganization;
	}
	public void setAgentTechOrganization(AgentOrganization agentTechOrganization) {
		this.agentTechOrganization = agentTechOrganization;
	}

	public String getAgentUserId() {
		return this.agentUserId;
	}
	public void setAgentUserId(String agentUserId) {
		this.agentUserId = agentUserId;
	}

	public InsPerson getApplicant() {
		return this.applicant;
	}
	public void setApplicant(InsPerson applicant) {
		this.applicant = applicant;
	}

	public ApplyBusinessCity getApplyBusinessCity() {
		return this.applyBusinessCity;
	}
	public void setApplyBusinessCity(ApplyBusinessCity applyBusinessCity) {
		this.applyBusinessCity = applyBusinessCity;
	}

	public Car getCar() {
		return this.car;
	}
	public void setCar(Car car) {
		this.car = car;
	}

	public InsPerson getCarOwner() {
		return this.carOwner;
	}
	public void setCarOwner(InsPerson carOwner) {
		this.carOwner = carOwner;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public InsPerson getInsured() {
		return this.insured;
	}
	public void setInsured(InsPerson insured) {
		this.insured = insured;
	}

	public String getLeadsId() {
		return this.leadsId;
	}
	public void setLeadsId(String leadsId) {
		this.leadsId = leadsId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
