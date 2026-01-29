package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 预约服务同步
 *
 * @author auto create
 * @since 1.0, 2026-01-12 15:05:26
 */
public class AlipayCommerceMerchantcardBookingserviceSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8161713995259773869L;

	/**
	 * 是否购卡后才能预约【首次同步服务信息时必填】
true     只能购卡后预约
false    不用购卡也能预约
	 */
	@ApiField("book_with_item")
	private Boolean bookWithItem;

	/**
	 * 预约时是否需要指定手艺人【首次同步服务信息时必填】
true     预约时必须指定手艺人
false    预约时不指定手艺人，直接预约服务
	 */
	@ApiField("book_with_technician")
	private Boolean bookWithTechnician;

	/**
	 * null
	 */
	@ApiListField("items")
	@ApiField("string")
	private List<String> items;

	/**
	 * 外部服务id【可选，有就传】
	 */
	@ApiField("out_service_id")
	private String outServiceId;

	/**
	 * 服务id 为空表示新建/有值表示更新
	 */
	@ApiField("service_id")
	private String serviceId;

	/**
	 * 服务名称【首次同步服务信息时必填】
	 */
	@ApiField("service_name")
	private String serviceName;

	/**
	 * 门店id【必填】
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 服务状态（枚举）【首次同步服务信息时必填】
deleted      永久删除，后续不可恢复，不可再被查询到
active       可预约状态
inactive     不可预约，后续可恢复成active
	 */
	@ApiField("status")
	private String status;

	/**
	 * null
	 */
	@ApiListField("week_plans")
	@ApiField("schedule_week_plan_info")
	private List<ScheduleWeekPlanInfo> weekPlans;

	public Boolean getBookWithItem() {
		return this.bookWithItem;
	}
	public void setBookWithItem(Boolean bookWithItem) {
		this.bookWithItem = bookWithItem;
	}

	public Boolean getBookWithTechnician() {
		return this.bookWithTechnician;
	}
	public void setBookWithTechnician(Boolean bookWithTechnician) {
		this.bookWithTechnician = bookWithTechnician;
	}

	public List<String> getItems() {
		return this.items;
	}
	public void setItems(List<String> items) {
		this.items = items;
	}

	public String getOutServiceId() {
		return this.outServiceId;
	}
	public void setOutServiceId(String outServiceId) {
		this.outServiceId = outServiceId;
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
