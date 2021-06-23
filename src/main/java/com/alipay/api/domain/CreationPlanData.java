package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 计划详情
 *
 * @author auto create
 * @since 1.0, 2019-08-13 17:13:01
 */
public class CreationPlanData extends AlipayObject {

	private static final long serialVersionUID = 2694462662257929964L;

	/**
	 * 定向的设备sn列表
	 */
	@ApiListField("device_sn_list")
	@ApiField("string")
	private List<String> deviceSnList;

	/**
	 * 投放结束时间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 额外信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/**
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private String gmtModified;

	/**
	 * 投放计划id
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 投放的物料地址
	 */
	@ApiField("material_url")
	private String materialUrl;

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

	/**
	 * 投放计划状态
	 */
	@ApiField("status")
	private String status;

	public List<String> getDeviceSnList() {
		return this.deviceSnList;
	}
	public void setDeviceSnList(List<String> deviceSnList) {
		this.deviceSnList = deviceSnList;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getMaterialUrl() {
		return this.materialUrl;
	}
	public void setMaterialUrl(String materialUrl) {
		this.materialUrl = materialUrl;
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

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
