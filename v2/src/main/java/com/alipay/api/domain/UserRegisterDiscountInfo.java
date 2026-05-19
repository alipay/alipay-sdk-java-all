package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户报名后优惠信息
 *
 * @author auto create
 * @since 1.0, 2026-04-17 10:01:56
 */
public class UserRegisterDiscountInfo extends AlipayObject {

	private static final long serialVersionUID = 5818119934882764825L;

	/**
	 * 用户报名天天减活动时间
	 */
	@ApiField("register_time")
	private Date registerTime;

	/**
	 * 剩余可核销的优惠笔数
	 */
	@ApiField("user_remaining_discount_count")
	private Long userRemainingDiscountCount;

	/**
	 * 报名后可享受的优惠笔数
	 */
	@ApiField("user_total_discount_count")
	private Long userTotalDiscountCount;

	/**
	 * 累计核销优惠金额,单位:人民币 分
	 */
	@ApiField("user_total_use_discount_amount")
	private Long userTotalUseDiscountAmount;

	public Date getRegisterTime() {
		return this.registerTime;
	}
	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}

	public Long getUserRemainingDiscountCount() {
		return this.userRemainingDiscountCount;
	}
	public void setUserRemainingDiscountCount(Long userRemainingDiscountCount) {
		this.userRemainingDiscountCount = userRemainingDiscountCount;
	}

	public Long getUserTotalDiscountCount() {
		return this.userTotalDiscountCount;
	}
	public void setUserTotalDiscountCount(Long userTotalDiscountCount) {
		this.userTotalDiscountCount = userTotalDiscountCount;
	}

	public Long getUserTotalUseDiscountAmount() {
		return this.userTotalUseDiscountAmount;
	}
	public void setUserTotalUseDiscountAmount(Long userTotalUseDiscountAmount) {
		this.userTotalUseDiscountAmount = userTotalUseDiscountAmount;
	}

}
