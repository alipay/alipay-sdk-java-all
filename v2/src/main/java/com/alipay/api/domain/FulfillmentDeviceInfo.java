package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设备信息
 *
 * @author auto create
 * @since 1.0, 2026-03-24 19:19:30
 */
public class FulfillmentDeviceInfo extends AlipayObject {

	private static final long serialVersionUID = 3239947827956425669L;

	/**
	 * 序列号
	 */
	@ApiField("serial_no")
	private String serialNo;

	public String getSerialNo() {
		return this.serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

}
