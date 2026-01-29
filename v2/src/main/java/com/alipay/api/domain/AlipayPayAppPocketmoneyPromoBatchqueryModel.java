package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 儿童手表厂商营销活动奖品批量查询
 *
 * @author auto create
 * @since 1.0, 2025-04-09 21:33:20
 */
public class AlipayPayAppPocketmoneyPromoBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 7154524815533411266L;

	/**
	 * 为空-批量查询，不为空-根据流水id查询
	 */
	@ApiListField("biz_no_list")
	@ApiField("string")
	private List<String> bizNoList;

	/**
	 * 活动场景数组
	 */
	@ApiListField("biz_scene_list")
	@ApiField("string")
	private List<String> bizSceneList;

	/**
	 * 设备号，openWatchId，rtos设备可不传
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 兼容设备号，openId
	 */
	@ApiField("extra_device_id")
	private String extraDeviceId;

	/**
	 * 操作系统，android，rtos
	 */
	@ApiField("os_type")
	private String osType;

	/**
	 * 厂商名称
	 */
	@ApiField("solution_vendor")
	private String solutionVendor;

	public List<String> getBizNoList() {
		return this.bizNoList;
	}
	public void setBizNoList(List<String> bizNoList) {
		this.bizNoList = bizNoList;
	}

	public List<String> getBizSceneList() {
		return this.bizSceneList;
	}
	public void setBizSceneList(List<String> bizSceneList) {
		this.bizSceneList = bizSceneList;
	}

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getExtraDeviceId() {
		return this.extraDeviceId;
	}
	public void setExtraDeviceId(String extraDeviceId) {
		this.extraDeviceId = extraDeviceId;
	}

	public String getOsType() {
		return this.osType;
	}
	public void setOsType(String osType) {
		this.osType = osType;
	}

	public String getSolutionVendor() {
		return this.solutionVendor;
	}
	public void setSolutionVendor(String solutionVendor) {
		this.solutionVendor = solutionVendor;
	}

}
