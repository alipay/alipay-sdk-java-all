package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 相对核销时间
 *
 * @author auto create
 * @since 1.0, 2024-08-08 18:12:31
 */
public class AppItemRelativePeriodInfo extends AlipayObject {

	private static final long serialVersionUID = 4644626758646828797L;

	/**
	 * 券生效后N天内可以使用。 可以配合wait_days_after_receive字段使用。 比如：wait_days_after_receive=1，valid_days_after_receive=2，今天时1号0点0分0秒，那么2号0点0分0秒券生效可以开始使用，4号23点59分59秒，有效期到期不可用
单位：天
	 */
	@ApiField("valid_days_after_receive")
	private Long validDaysAfterReceive;

	/**
	 * 用户领券后需要等待N天，券才可以生效。
单位：天
	 */
	@ApiField("wait_days_after_receive")
	private Long waitDaysAfterReceive;

	public Long getValidDaysAfterReceive() {
		return this.validDaysAfterReceive;
	}
	public void setValidDaysAfterReceive(Long validDaysAfterReceive) {
		this.validDaysAfterReceive = validDaysAfterReceive;
	}

	public Long getWaitDaysAfterReceive() {
		return this.waitDaysAfterReceive;
	}
	public void setWaitDaysAfterReceive(Long waitDaysAfterReceive) {
		this.waitDaysAfterReceive = waitDaysAfterReceive;
	}

}
