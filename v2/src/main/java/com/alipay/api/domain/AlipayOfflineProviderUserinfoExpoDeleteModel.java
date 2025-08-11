package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 展会核验用户出库
 *
 * @author auto create
 * @since 1.0, 2025-06-10 19:06:36
 */
public class AlipayOfflineProviderUserinfoExpoDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 1383612614791365592L;

	/**
	 * 手机号
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 活动最小单元ID
	 */
	@ApiField("time_uuid")
	private String timeUuid;

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getTimeUuid() {
		return this.timeUuid;
	}
	public void setTimeUuid(String timeUuid) {
		this.timeUuid = timeUuid;
	}

}
