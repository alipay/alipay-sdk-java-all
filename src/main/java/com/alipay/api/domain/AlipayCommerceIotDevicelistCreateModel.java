package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建设备记录接口
 *
 * @author auto create
 * @since 1.0, 2017-09-14 22:22:29
 */
public class AlipayCommerceIotDevicelistCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4642243797845761989L;

	/**
	 * 设备对象列表+不唯一+用于批量创建设备记录+协议服务商指定+0个或多个设备对象列表，单次调用传入设备对象个数不能超过200
	 */
	@ApiListField("device_list")
	@ApiField("iot_device")
	private List<IotDevice> deviceList;

	/**
	 * 设备个性化信息列表+不唯一+用于设置设备的用户定制化信息+协议服务商指定
	 */
	@ApiListField("device_personal_info_list")
	@ApiField("iot_device_personal_info")
	private List<IotDevicePersonalInfo> devicePersonalInfoList;

	/**
	 * 协议服务商id+唯一+指定操作数据归属于哪个协议服务商+协议服务商接入时由支付宝统一分配
	 */
	@ApiField("protocol_supplier_id")
	private String protocolSupplierId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public List<IotDevice> getDeviceList() {
		return this.deviceList;
	}
	public void setDeviceList(List<IotDevice> deviceList) {
		this.deviceList = deviceList;
	}

	public List<IotDevicePersonalInfo> getDevicePersonalInfoList() {
		return this.devicePersonalInfoList;
	}
	public void setDevicePersonalInfoList(List<IotDevicePersonalInfo> devicePersonalInfoList) {
		this.devicePersonalInfoList = devicePersonalInfoList;
	}

	public String getProtocolSupplierId() {
		return this.protocolSupplierId;
	}
	public void setProtocolSupplierId(String protocolSupplierId) {
		this.protocolSupplierId = protocolSupplierId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
