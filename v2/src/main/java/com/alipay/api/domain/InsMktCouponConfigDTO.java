package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险营销权益配置
 *
 * @author auto create
 * @since 1.0, 2016-10-12 15:45:05
 */
public class InsMktCouponConfigDTO extends AlipayObject {

	private static final long serialVersionUID = 8245624655194382782L;

	/**
	 * 权益配置Id
	 */
	@ApiField("coupon_conf_id")
	private String couponConfId;

	/**
	 * 权益类型
	 */
	@ApiField("coupon_type")
	private String couponType;

	/**
	 * 200元优惠券
	 */
	@ApiField("coupon_value")
	private String couponValue;

	/**
	 * 核销结束时间
	 */
	@ApiField("use_end_time")
	private Date useEndTime;

	/**
	 * 核销使用规则
	 */
	@ApiField("use_rule")
	private String useRule;

	/**
	 * 核销开始时间
	 */
	@ApiField("use_start_time")
	private Date useStartTime;

	public String getCouponConfId() {
		return this.couponConfId;
	}
	public void setCouponConfId(String couponConfId) {
		this.couponConfId = couponConfId;
	}

	public String getCouponType() {
		return this.couponType;
	}
	public void setCouponType(String couponType) {
		this.couponType = couponType;
	}

	public String getCouponValue() {
		return this.couponValue;
	}
	public void setCouponValue(String couponValue) {
		this.couponValue = couponValue;
	}

	public Date getUseEndTime() {
		return this.useEndTime;
	}
	public void setUseEndTime(Date useEndTime) {
		this.useEndTime = useEndTime;
	}

	public String getUseRule() {
		return this.useRule;
	}
	public void setUseRule(String useRule) {
		this.useRule = useRule;
	}

	public Date getUseStartTime() {
		return this.useStartTime;
	}
	public void setUseStartTime(Date useStartTime) {
		this.useStartTime = useStartTime;
	}

}
