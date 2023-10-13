package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建投放计划
 *
 * @author auto create
 * @since 1.0, 2019-08-13 17:13:20
 */
public class AlipayCommerceIotAdvertiserAdCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6431468644493977836L;

	/**
	 * 定向的设备sn列表
	 */
	@ApiListField("device_sn_list")
	@ApiField("string")
	private List<String> deviceSnList;

	/**
	 * 设备类型，qt:蜻蜓
	 */
	@ApiField("device_type")
	private String deviceType;

	/**
	 * 投放结束时间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 广告位值，静默页：idle
	 */
	@ApiField("event")
	private String event;

	/**
	 * 物料id
	 */
	@ApiField("material_id")
	private Long materialId;

	/**
	 * 投放计划名称
	 */
	@ApiField("plan_name")
	private String planName;

	/**
	 * 投放开始时间
	 */
	@ApiField("start_time")
	private String startTime;

	public List<String> getDeviceSnList() {
		return this.deviceSnList;
	}
	public void setDeviceSnList(List<String> deviceSnList) {
		this.deviceSnList = deviceSnList;
	}

	public String getDeviceType() {
		return this.deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getEvent() {
		return this.event;
	}
	public void setEvent(String event) {
		this.event = event;
	}

	public Long getMaterialId() {
		return this.materialId;
	}
	public void setMaterialId(Long materialId) {
		this.materialId = materialId;
	}

	public String getPlanName() {
		return this.planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

}
