package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 每个设备进件的结果
 *
 * @author auto create
 * @since 1.0, 2025-03-19 16:03:30
 */
public class DeviceSettleApplicantResult extends AlipayObject {

	private static final long serialVersionUID = 3889897863811127425L;

	/**
	 * 是需要设备厂商录入的sn号
	 */
	@ApiField("sn")
	private String sn;

	public String getSn() {
		return this.sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}

}
