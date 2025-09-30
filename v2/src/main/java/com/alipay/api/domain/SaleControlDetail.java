package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 售卖限制的详情
 *
 * @author auto create
 * @since 1.0, 2025-04-28 21:59:17
 */
public class SaleControlDetail extends AlipayObject {

	private static final long serialVersionUID = 3571134245667196382L;

	/**
	 * 售卖策略为SPEC_CROWD时传入该值，null标识无限制，枚举类型
1. STUDENT：学生
2. SILVER：银发人群（老人）
3. MEMBER：会员
	 */
	@ApiField("crowd_type")
	private String crowdType;

	/**
	 * 人数/年龄上限	售卖策略为PASSENGER_NUM/AGE时传入该值，null标识无限制
	 */
	@ApiField("lower_limit")
	private String lowerLimit;

	/**
	 * 乘机人类型	售卖策略为PASSENGER_TYPE时传入该值，null标识无限制，枚举类型
ADULT：成人
ADULT_CHILD：成人+儿童
ADULT_INFANT：成人+婴儿
	 */
	@ApiField("passenger_type")
	private String passengerType;

	/**
	 * 人数/年龄上限	售卖策略为PASSENGER_NUM/AGE时传入该值，null标识无限制
	 */
	@ApiField("up_limit")
	private String upLimit;

	public String getCrowdType() {
		return this.crowdType;
	}
	public void setCrowdType(String crowdType) {
		this.crowdType = crowdType;
	}

	public String getLowerLimit() {
		return this.lowerLimit;
	}
	public void setLowerLimit(String lowerLimit) {
		this.lowerLimit = lowerLimit;
	}

	public String getPassengerType() {
		return this.passengerType;
	}
	public void setPassengerType(String passengerType) {
		this.passengerType = passengerType;
	}

	public String getUpLimit() {
		return this.upLimit;
	}
	public void setUpLimit(String upLimit) {
		this.upLimit = upLimit;
	}

}
