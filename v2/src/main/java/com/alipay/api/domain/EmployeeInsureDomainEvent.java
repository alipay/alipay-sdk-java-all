package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 灵工保领域事件
 *
 * @author auto create
 * @since 1.0, 2023-11-17 15:43:45
 */
public class EmployeeInsureDomainEvent extends AlipayObject {

	private static final long serialVersionUID = 3191246211475237378L;

	/**
	 * 投保雇员主体信息
	 */
	@ApiField("employee")
	private InsureEmployee employee;

	/**
	 * 打卡事件地点
	 */
	@ApiField("event_place")
	private String eventPlace;

	/**
	 * 事件发生时间点，在当前时间1小时范围内
	 */
	@ApiField("event_time")
	private String eventTime;

	/**
	 * 事件类型，固定值
	 */
	@ApiField("event_type")
	private String eventType;

	/**
	 * 商户信息
	 */
	@ApiField("merchant")
	private InsureCompany merchant;

	/**
	 * 投保合作商信息，本次场景是和蚂蚁保签约的平台信息，固定值
	 */
	@ApiField("partner_organization")
	private InsurePartnerOrganization partnerOrganization;

	/**
	 * 指定产品方案ID
	 */
	@ApiField("product_plan_id")
	private String productPlanId;

	public InsureEmployee getEmployee() {
		return this.employee;
	}
	public void setEmployee(InsureEmployee employee) {
		this.employee = employee;
	}

	public String getEventPlace() {
		return this.eventPlace;
	}
	public void setEventPlace(String eventPlace) {
		this.eventPlace = eventPlace;
	}

	public String getEventTime() {
		return this.eventTime;
	}
	public void setEventTime(String eventTime) {
		this.eventTime = eventTime;
	}

	public String getEventType() {
		return this.eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public InsureCompany getMerchant() {
		return this.merchant;
	}
	public void setMerchant(InsureCompany merchant) {
		this.merchant = merchant;
	}

	public InsurePartnerOrganization getPartnerOrganization() {
		return this.partnerOrganization;
	}
	public void setPartnerOrganization(InsurePartnerOrganization partnerOrganization) {
		this.partnerOrganization = partnerOrganization;
	}

	public String getProductPlanId() {
		return this.productPlanId;
	}
	public void setProductPlanId(String productPlanId) {
		this.productPlanId = productPlanId;
	}

}
