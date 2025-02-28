package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 行程元素
 *
 * @author auto create
 * @since 1.0, 2022-11-17 20:03:46
 */
public class OrderJourneyElement extends AlipayObject {

	private static final long serialVersionUID = 6373358923677115661L;

	/**
	 * 达到地信息
	 */
	@ApiField("arrival")
	private JourneyLocation arrival;

	/**
	 * 出发地信息
	 */
	@ApiField("departure")
	private JourneyLocation departure;

	/**
	 * 行程时长
	 */
	@ApiField("duration")
	private String duration;

	/**
	 * 结束时间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 结束时间描述（非结构化）
	 */
	@ApiField("end_time_desc")
	private String endTimeDesc;

	/**
	 * 扩展信息
	 */
	@ApiListField("ext_info")
	@ApiField("order_ext_info")
	private List<OrderExtInfo> extInfo;

	/**
	 * 功能服务列表
	 */
	@ApiListField("functional_services")
	@ApiField("functional_service")
	private List<FunctionalService> functionalServices;

	/**
	 * 出行人
	 */
	@ApiListField("passagers")
	@ApiField("user_infomation")
	private List<UserInfomation> passagers;

	/**
	 * 服务变更信息
	 */
	@ApiField("service_change_info")
	private JourneyServiceChangeInfo serviceChangeInfo;

	/**
	 * 服务提供方信息
	 */
	@ApiField("service_provider")
	private JourneyMerchantInfo serviceProvider;

	/**
	 * 开始时间
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * 开始时间描述（非结构化）
	 */
	@ApiField("start_time_desc")
	private String startTimeDesc;

	public JourneyLocation getArrival() {
		return this.arrival;
	}
	public void setArrival(JourneyLocation arrival) {
		this.arrival = arrival;
	}

	public JourneyLocation getDeparture() {
		return this.departure;
	}
	public void setDeparture(JourneyLocation departure) {
		this.departure = departure;
	}

	public String getDuration() {
		return this.duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getEndTimeDesc() {
		return this.endTimeDesc;
	}
	public void setEndTimeDesc(String endTimeDesc) {
		this.endTimeDesc = endTimeDesc;
	}

	public List<OrderExtInfo> getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(List<OrderExtInfo> extInfo) {
		this.extInfo = extInfo;
	}

	public List<FunctionalService> getFunctionalServices() {
		return this.functionalServices;
	}
	public void setFunctionalServices(List<FunctionalService> functionalServices) {
		this.functionalServices = functionalServices;
	}

	public List<UserInfomation> getPassagers() {
		return this.passagers;
	}
	public void setPassagers(List<UserInfomation> passagers) {
		this.passagers = passagers;
	}

	public JourneyServiceChangeInfo getServiceChangeInfo() {
		return this.serviceChangeInfo;
	}
	public void setServiceChangeInfo(JourneyServiceChangeInfo serviceChangeInfo) {
		this.serviceChangeInfo = serviceChangeInfo;
	}

	public JourneyMerchantInfo getServiceProvider() {
		return this.serviceProvider;
	}
	public void setServiceProvider(JourneyMerchantInfo serviceProvider) {
		this.serviceProvider = serviceProvider;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getStartTimeDesc() {
		return this.startTimeDesc;
	}
	public void setStartTimeDesc(String startTimeDesc) {
		this.startTimeDesc = startTimeDesc;
	}

}
