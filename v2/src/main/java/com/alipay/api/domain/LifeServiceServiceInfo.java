package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-01-28 16:52:42
 */
public class LifeServiceServiceInfo extends AlipayObject {

	private static final long serialVersionUID = 3838983473312466654L;

	/**
	 * 预约时是否需要指定手艺人
	 */
	@ApiField("book_with_technician")
	private String bookWithTechnician;

	/**
	 * 履约类型
	 */
	@ApiField("fulfillment_type")
	private String fulfillmentType;

	/**
	 * 三方服务项目id
	 */
	@ApiField("out_service_id")
	private String outServiceId;

	/**
	 * null
	 */
	@ApiListField("service_attrs")
	@ApiField("life_service_attr")
	private List<LifeServiceAttr> serviceAttrs;

	/**
	 * 服务项目id
	 */
	@ApiField("service_id")
	private String serviceId;

	/**
	 * 服务项目名称
	 */
	@ApiField("service_name")
	private String serviceName;

	/**
	 * 蚂蚁门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 可预约状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * null
	 */
	@ApiListField("week_plans")
	@ApiField("schedule_week_plan_info")
	private List<ScheduleWeekPlanInfo> weekPlans;

	public String getBookWithTechnician() {
		return this.bookWithTechnician;
	}
	public void setBookWithTechnician(String bookWithTechnician) {
		this.bookWithTechnician = bookWithTechnician;
	}

	public String getFulfillmentType() {
		return this.fulfillmentType;
	}
	public void setFulfillmentType(String fulfillmentType) {
		this.fulfillmentType = fulfillmentType;
	}

	public String getOutServiceId() {
		return this.outServiceId;
	}
	public void setOutServiceId(String outServiceId) {
		this.outServiceId = outServiceId;
	}

	public List<LifeServiceAttr> getServiceAttrs() {
		return this.serviceAttrs;
	}
	public void setServiceAttrs(List<LifeServiceAttr> serviceAttrs) {
		this.serviceAttrs = serviceAttrs;
	}

	public String getServiceId() {
		return this.serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getServiceName() {
		return this.serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public List<ScheduleWeekPlanInfo> getWeekPlans() {
		return this.weekPlans;
	}
	public void setWeekPlans(List<ScheduleWeekPlanInfo> weekPlans) {
		this.weekPlans = weekPlans;
	}

}
