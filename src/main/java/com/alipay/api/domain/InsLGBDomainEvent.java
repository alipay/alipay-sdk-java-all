package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 灵工保领域事件
 *
 * @author auto create
 * @since 1.0, 2022-06-14 14:15:34
 */
public class InsLGBDomainEvent extends AlipayObject {

	private static final long serialVersionUID = 2219823545515563831L;

	/**
	 * 员工信息
	 */
	@ApiField("employee")
	private InsEmployee employee;

	/**
	 * 打卡事件地点
	 */
	@ApiField("event_place")
	private String eventPlace;

	/**
	 * 事件发生时间点
	 */
	@ApiField("event_time")
	private Date eventTime;

	/**
	 * 事件类型
	 */
	@ApiField("event_type")
	private String eventType;

	/**
	 * 商户信息
	 */
	@ApiField("merchant")
	private InsCompany merchant;

	/**
	 * 指定产品方案ID
	 */
	@ApiField("product_plan_id")
	private String productPlanId;

	public InsEmployee getEmployee() {
		return this.employee;
	}
	public void setEmployee(InsEmployee employee) {
		this.employee = employee;
	}

	public String getEventPlace() {
		return this.eventPlace;
	}
	public void setEventPlace(String eventPlace) {
		this.eventPlace = eventPlace;
	}

	public Date getEventTime() {
		return this.eventTime;
	}
	public void setEventTime(Date eventTime) {
		this.eventTime = eventTime;
	}

	public String getEventType() {
		return this.eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public InsCompany getMerchant() {
		return this.merchant;
	}
	public void setMerchant(InsCompany merchant) {
		this.merchant = merchant;
	}

	public String getProductPlanId() {
		return this.productPlanId;
	}
	public void setProductPlanId(String productPlanId) {
		this.productPlanId = productPlanId;
	}

}
