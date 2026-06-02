package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-05-26 11:17:45
 */
public class RentProcurementDeviceInfoVO extends AlipayObject {

	private static final long serialVersionUID = 8665192183725497594L;

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
