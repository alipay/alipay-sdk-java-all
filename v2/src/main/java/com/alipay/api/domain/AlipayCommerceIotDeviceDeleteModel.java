package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 删除指定设备
 *
 * @author auto create
 * @since 1.0, 2017-09-14 22:22:40
 */
public class AlipayCommerceIotDeviceDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 6149125784898484894L;

	/**
	 * 设备id+唯一+协议服务商用于唯一标识一个设备的设备id+唯一+协议服务商创建设备记录时指定
	 */
	@ApiField("device_id")
	private String deviceId;

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

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
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
