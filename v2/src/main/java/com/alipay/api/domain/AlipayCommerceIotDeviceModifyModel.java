package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改某个设备型号数据
 *
 * @author auto create
 * @since 1.0, 2017-09-14 22:22:47
 */
public class AlipayCommerceIotDeviceModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5513635534368872981L;

	/**
	 * 更新后的设备对象+不唯一+用于更新支付宝智能设备中心中的设备信息+协议服务商指定+设备对象整体都需传入，而不能仅传入部分发生变更的属性
	 */
	@ApiField("device")
	private IotDevice device;

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

	public IotDevice getDevice() {
		return this.device;
	}
	public void setDevice(IotDevice device) {
		this.device = device;
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
