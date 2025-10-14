package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 荣耀优惠券发放结果
 *
 * @author auto create
 * @since 1.0, 2025-09-01 16:43:16
 */
public class HonorCouponSendResultDTO extends AlipayObject {

	private static final long serialVersionUID = 8741445762175461726L;

	/**
	 * 渠道侧用户id
	 */
	@ApiField("channel_customer_id")
	private String channelCustomerId;

	/**
	 * 优惠券名称
	 */
	@ApiField("coupon_name")
	private String couponName;

	/**
	 * 优惠券id
	 */
	@ApiField("coupon_no")
	private String couponNo;

	/**
	 * 券类型，枚举值：
1-放款券
2-还款券
	 */
	@ApiField("coupon_type")
	private Long couponType;

	/**
	 * 券有效期结束时间，时间戳毫秒
	 */
	@ApiField("end_time")
	private Long endTime;

	/**
	 * 券有效期开始时间，时间戳毫秒
	 */
	@ApiField("start_time")
	private Long startTime;

	public String getChannelCustomerId() {
		return this.channelCustomerId;
	}
	public void setChannelCustomerId(String channelCustomerId) {
		this.channelCustomerId = channelCustomerId;
	}

	public String getCouponName() {
		return this.couponName;
	}
	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}

	public String getCouponNo() {
		return this.couponNo;
	}
	public void setCouponNo(String couponNo) {
		this.couponNo = couponNo;
	}

	public Long getCouponType() {
		return this.couponType;
	}
	public void setCouponType(Long couponType) {
		this.couponType = couponType;
	}

	public Long getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Long endTime) {
		this.endTime = endTime;
	}

	public Long getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Long startTime) {
		this.startTime = startTime;
	}

}
