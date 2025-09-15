package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预定限制
 *
 * @author auto create
 * @since 1.0, 2024-01-23 16:14:00
 */
public class BookingLimit extends AlipayObject {

	private static final long serialVersionUID = 1239613241312975582L;

	/**
	 * 餐饮政策
	 */
	@ApiField("breakfast_policy")
	private String breakfastPolicy;

	/**
	 * 儿童政策
	 */
	@ApiField("children_policy")
	private String childrenPolicy;

	/**
	 * 是否可以养宠物
	 */
	@ApiField("pet_info")
	private String petInfo;

	/**
	 * 可订时间范围
	 */
	@ApiField("time")
	private String time;

	public String getBreakfastPolicy() {
		return this.breakfastPolicy;
	}
	public void setBreakfastPolicy(String breakfastPolicy) {
		this.breakfastPolicy = breakfastPolicy;
	}

	public String getChildrenPolicy() {
		return this.childrenPolicy;
	}
	public void setChildrenPolicy(String childrenPolicy) {
		this.childrenPolicy = childrenPolicy;
	}

	public String getPetInfo() {
		return this.petInfo;
	}
	public void setPetInfo(String petInfo) {
		this.petInfo = petInfo;
	}

	public String getTime() {
		return this.time;
	}
	public void setTime(String time) {
		this.time = time;
	}

}
