package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 此字段为String类型，内部为Json结构
 *
 * @author auto create
 * @since 1.0, 2022-04-27 16:29:58
 */
public class ChangedContent extends AlipayObject {

	private static final long serialVersionUID = 1647397938328963959L;

	/**
	 * 失效时间延期特权-延期后预计失效时间
	 */
	@ApiField("expire_deferral_after_expire_time")
	private String expireDeferralAfterExpireTime;

	/**
	 * 失效时间延期特权-总延期时间
	 */
	@ApiField("expire_deferral_sum_deferral_time")
	private String expireDeferralSumDeferralTime;

	/**
	 * 失效时间延期特权-总延期时间单位
	 */
	@ApiField("expire_deferral_sum_deferral_time_unit")
	private String expireDeferralSumDeferralTimeUnit;

	/**
	 * 失效时间延期特权-延期使用时间
	 */
	@ApiField("expire_deferral_use_time")
	private String expireDeferralUseTime;

	public String getExpireDeferralAfterExpireTime() {
		return this.expireDeferralAfterExpireTime;
	}
	public void setExpireDeferralAfterExpireTime(String expireDeferralAfterExpireTime) {
		this.expireDeferralAfterExpireTime = expireDeferralAfterExpireTime;
	}

	public String getExpireDeferralSumDeferralTime() {
		return this.expireDeferralSumDeferralTime;
	}
	public void setExpireDeferralSumDeferralTime(String expireDeferralSumDeferralTime) {
		this.expireDeferralSumDeferralTime = expireDeferralSumDeferralTime;
	}

	public String getExpireDeferralSumDeferralTimeUnit() {
		return this.expireDeferralSumDeferralTimeUnit;
	}
	public void setExpireDeferralSumDeferralTimeUnit(String expireDeferralSumDeferralTimeUnit) {
		this.expireDeferralSumDeferralTimeUnit = expireDeferralSumDeferralTimeUnit;
	}

	public String getExpireDeferralUseTime() {
		return this.expireDeferralUseTime;
	}
	public void setExpireDeferralUseTime(String expireDeferralUseTime) {
		this.expireDeferralUseTime = expireDeferralUseTime;
	}

}
