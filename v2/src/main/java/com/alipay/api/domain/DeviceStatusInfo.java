package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-01-05 17:47:43
 */
public class DeviceStatusInfo extends AlipayObject {

	private static final long serialVersionUID = 6479129639766169634L;

	/**
	 * 机器人编号
	 */
	@ApiField("sn")
	private String sn;

	/**
	 * 机器人状态，参考枚举值
	 */
	@ApiField("status")
	private String status;

	public String getSn() {
		return this.sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
