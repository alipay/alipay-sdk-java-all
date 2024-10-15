package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改某一设备型号数据
 *
 * @author auto create
 * @since 1.0, 2017-09-14 22:22:37
 */
public class AlipayCommerceIotModelModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1265922868772331161L;

	/**
	 * 型号对象+不唯一+用于更新已存在的设备型号记录+由协议服务商指定+设备型号对象整体都需传入，而不能仅传入部分发生变更的属性
	 */
	@ApiField("model")
	private IotDeviceModel model;

	/**
	 * 协议服务商id+唯一+指定操作数据归属于哪个协议服务商+协议服务商接入时由支付宝统一分配
	 */
	@ApiField("protocol_supplier_id")
	private String protocolSupplierId;

	public IotDeviceModel getModel() {
		return this.model;
	}
	public void setModel(IotDeviceModel model) {
		this.model = model;
	}

	public String getProtocolSupplierId() {
		return this.protocolSupplierId;
	}
	public void setProtocolSupplierId(String protocolSupplierId) {
		this.protocolSupplierId = protocolSupplierId;
	}

}
