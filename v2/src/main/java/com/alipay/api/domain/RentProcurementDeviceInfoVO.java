package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-05-18 10:15:56
 */
public class RentProcurementDeviceInfoVO extends AlipayObject {

	private static final long serialVersionUID = 4484661334361319878L;

	/**
	 * 设备号
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
