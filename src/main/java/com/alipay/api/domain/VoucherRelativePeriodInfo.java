package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券相对核销时间
 *
 * @author auto create
 * @since 1.0, 2022-09-20 11:28:07
 */
public class VoucherRelativePeriodInfo extends AlipayObject {

	private static final long serialVersionUID = 2264246371367574513L;

	/**
	 * 券生效后 N 天内可以使用。 可以配合wait_days_after_receive 字段使用。
	 */
	@ApiField("valid_days_after_receive")
	private Long validDaysAfterReceive;

	/**
	 * 用户领券后需要等待 N 天，券才可以生效。 
字段值为 0 表示用户领券后立刻生效。
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
