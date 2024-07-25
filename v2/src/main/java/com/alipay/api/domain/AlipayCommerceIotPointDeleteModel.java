package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 删除点位
 *
 * @author auto create
 * @since 1.0, 2023-11-17 16:10:00
 */
public class AlipayCommerceIotPointDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 3516619938146681892L;

	/**
	 * 外部点位编号
	 */
	@ApiField("out_device_point_id")
	private String outDevicePointId;

	public String getOutDevicePointId() {
		return this.outDevicePointId;
	}
	public void setOutDevicePointId(String outDevicePointId) {
		this.outDevicePointId = outDevicePointId;
	}

}
