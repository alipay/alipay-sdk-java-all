package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 红包生效时间配置
 *
 * @author auto create
 * @since 1.0, 2021-03-25 14:31:37
 */
public class CouponEffectTime extends AlipayObject {

	private static final long serialVersionUID = 3891227912399827666L;

	/**
	 * 说明:当coupon_available_period_type不为空的时候且为ABSOLUTELY时，此处会有值

绝对时间情况下，红包发放开始时间
	 */
	@ApiField("coupon_absolutely_begin_time")
	private Date couponAbsolutelyBeginTime;

	/**
	 * 说明:当coupon_available_period_type不为空的时候且为ABSOLUTELY时，此处会有值

绝对时间下红包发放结束时间
	 */
	@ApiField("coupon_absolutely_end_time")
	private Date couponAbsolutelyEndTime;

	/**
	 * 时间周期类型
ABSOLUTELY:绝对时间
RELATIVE:相对时间
	 */
	@ApiField("coupon_available_period_type")
	private String couponAvailablePeriodType;

	/**
	 * 说明:当coupon_available_period_type不为空的时候且为RELATIVE时，此处会有值

相对时间情况下，红包发放开始时间周期类型
DAYS:天级
MINUTES:分钟级
	 */
	@ApiField("coupon_relative_begin_rounding_type")
	private String couponRelativeBeginRoundingType;

	/**
	 * 说明:当coupon_available_period_type不为空的时候且为RELATIVE时，此处会有值

相对时间情况下，红包开始时间相对值，
比如:
coupon_relative_begin_rounding_type=DAYS
coupon_relative_begin_value=1
代表次日凌晨开始生效

比如:
coupon_relative_begin_rounding_type=MINUTES
coupon_relative_begin_value=100
代表当前时间100分钟后开始生效
	 */
	@ApiField("coupon_relative_begin_value")
	private Long couponRelativeBeginValue;

	/**
	 * 说明:当coupon_available_period_type不为空的时候且为RELATIVE时，此处会有值

相对时间情况下，红包发放结束时间周期类型
DAYS:天级
MINUTES:分钟级
	 */
	@ApiField("coupon_relative_end_rounding_type")
	private String couponRelativeEndRoundingType;

	/**
	 * 说明:当coupon_available_period_type不为空的时候且为RELATIVE时，此处会有值

相对时间情况下，红包开始时间相对值，
比如:
coupon_relative_end_rounding_type=MINUTES
coupon_relative_end_value=100
代表从生效时间开始，有效期持续为100分钟
	 */
	@ApiField("coupon_relative_end_value")
	private Long couponRelativeEndValue;

	public Date getCouponAbsolutelyBeginTime() {
		return this.couponAbsolutelyBeginTime;
	}
	public void setCouponAbsolutelyBeginTime(Date couponAbsolutelyBeginTime) {
		this.couponAbsolutelyBeginTime = couponAbsolutelyBeginTime;
	}

	public Date getCouponAbsolutelyEndTime() {
		return this.couponAbsolutelyEndTime;
	}
	public void setCouponAbsolutelyEndTime(Date couponAbsolutelyEndTime) {
		this.couponAbsolutelyEndTime = couponAbsolutelyEndTime;
	}

	public String getCouponAvailablePeriodType() {
		return this.couponAvailablePeriodType;
	}
	public void setCouponAvailablePeriodType(String couponAvailablePeriodType) {
		this.couponAvailablePeriodType = couponAvailablePeriodType;
	}

	public String getCouponRelativeBeginRoundingType() {
		return this.couponRelativeBeginRoundingType;
	}
	public void setCouponRelativeBeginRoundingType(String couponRelativeBeginRoundingType) {
		this.couponRelativeBeginRoundingType = couponRelativeBeginRoundingType;
	}

	public Long getCouponRelativeBeginValue() {
		return this.couponRelativeBeginValue;
	}
	public void setCouponRelativeBeginValue(Long couponRelativeBeginValue) {
		this.couponRelativeBeginValue = couponRelativeBeginValue;
	}

	public String getCouponRelativeEndRoundingType() {
		return this.couponRelativeEndRoundingType;
	}
	public void setCouponRelativeEndRoundingType(String couponRelativeEndRoundingType) {
		this.couponRelativeEndRoundingType = couponRelativeEndRoundingType;
	}

	public Long getCouponRelativeEndValue() {
		return this.couponRelativeEndValue;
	}
	public void setCouponRelativeEndValue(Long couponRelativeEndValue) {
		this.couponRelativeEndValue = couponRelativeEndValue;
	}

}
