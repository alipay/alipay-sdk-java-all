package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.advertiser.ad.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-13 17:13:18
 */
public class AlipayCommerceIotAdvertiserAdQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1836981174282889277L;

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
	 * 扩展信息
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
	private String id;

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
	 * 计划状态(异常、生效、待生效、结束、审核中、已取消、投放错误、审核不通过)
	 */
	@ApiField("status")
	private String status;

	public void setDeviceSnList(List<String> deviceSnList) {
		this.deviceSnList = deviceSnList;
	}
	public List<String> getDeviceSnList( ) {
		return this.deviceSnList;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getEndTime( ) {
		return this.endTime;
	}

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}
	public String getExtInfo( ) {
		return this.extInfo;
	}

	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	public String getGmtCreate( ) {
		return this.gmtCreate;
	}

	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}
	public String getGmtModified( ) {
		return this.gmtModified;
	}

	public void setId(String id) {
		this.id = id;
	}
	public String getId( ) {
		return this.id;
	}

	public void setMaterialUrl(String materialUrl) {
		this.materialUrl = materialUrl;
	}
	public String getMaterialUrl( ) {
		return this.materialUrl;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public String getPlanName( ) {
		return this.planName;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getStartTime( ) {
		return this.startTime;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
