package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 询价接口
 *
 * @author auto create
 * @since 1.0, 2018-01-09 11:36:15
 */
public class AlipayInsAutoAutoinsprodEnquriyApplyModel extends AlipayObject {

	private static final long serialVersionUID = 6814624875819569469L;

	/**
	 * 代理人身份信息
	 */
	@ApiField("agent")
	private InsPerson agent;

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

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
