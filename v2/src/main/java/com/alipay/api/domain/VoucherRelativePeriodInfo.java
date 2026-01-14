package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券相对核销时间
 *
 * @author auto create
 * @since 1.0, 2026-01-13 16:12:31
 */
public class VoucherRelativePeriodInfo extends AlipayObject {

	private static final long serialVersionUID = 8881343867589179993L;

	/**
	 * 核销时间限制
	 */
	@ApiField("time_restrict_info")
	private TimeRestrictInfo timeRestrictInfo;

	/**
	 * 券生效后 N 天内可以使用。 可以配合wait_days_after_receive 字段使用。
	 */
	@ApiField("valid_days_after_receive")
	private Long validDaysAfterReceive;

	/**
	 * 优惠券有效期取整类型，向前取整则是领券后第N天晚上23点59分59秒时效。配合valid_days_after_receive字段使用，比如：valid_days_relative_type=ROUND_FORWARD，valid_days_after_receive =1，领券时间是1号12点0分0秒，那么1号23点59分59秒优惠券过期不可用；valid_days_relative_type=ROUND_FORWARD，valid_days_after_receive =2，领券时是1号12点0分0秒，那么2号23点59分59秒优惠券过期不可用；
	 */
	@ApiField("valid_days_relative_type")
	private String validDaysRelativeType;

	/**
	 * 用户领券后需要等待 N 天，券才可以生效。 
字段值为 0 表示用户领券后立刻生效。
	 */
	@ApiField("wait_days_after_receive")
	private Long waitDaysAfterReceive;

	public TimeRestrictInfo getTimeRestrictInfo() {
		return this.timeRestrictInfo;
	}
	public void setTimeRestrictInfo(TimeRestrictInfo timeRestrictInfo) {
		this.timeRestrictInfo = timeRestrictInfo;
	}

	public Long getValidDaysAfterReceive() {
		return this.validDaysAfterReceive;
	}
	public void setValidDaysAfterReceive(Long validDaysAfterReceive) {
		this.validDaysAfterReceive = validDaysAfterReceive;
	}

	public String getValidDaysRelativeType() {
		return this.validDaysRelativeType;
	}
	public void setValidDaysRelativeType(String validDaysRelativeType) {
		this.validDaysRelativeType = validDaysRelativeType;
	}

	public Long getWaitDaysAfterReceive() {
		return this.waitDaysAfterReceive;
	}
	public void setWaitDaysAfterReceive(Long waitDaysAfterReceive) {
		this.waitDaysAfterReceive = waitDaysAfterReceive;
	}

}
