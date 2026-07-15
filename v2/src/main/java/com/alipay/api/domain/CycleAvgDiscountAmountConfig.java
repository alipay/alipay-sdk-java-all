package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 指定周期均价
 *
 * @author auto create
 * @since 1.0, 2026-04-17 10:59:17
 */
public class CycleAvgDiscountAmountConfig extends AlipayObject {

	private static final long serialVersionUID = 4424953264521243473L;

	/**
	 * 当前周期均价，单位：分
	 */
	@ApiField("avg_discount_amount")
	private Long avgDiscountAmount;

	/**
	 * 指定周期均价配置中的周期
	 */
	@ApiListField("day_of_week")
	@ApiField("string")
	private List<String> dayOfWeek;

	/**
	 * 指定周期配置的顺序
	 */
	@ApiField("order")
	private Long order;

	public Long getAvgDiscountAmount() {
		return this.avgDiscountAmount;
	}
	public void setAvgDiscountAmount(Long avgDiscountAmount) {
		this.avgDiscountAmount = avgDiscountAmount;
	}

	public List<String> getDayOfWeek() {
		return this.dayOfWeek;
	}
	public void setDayOfWeek(List<String> dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	public Long getOrder() {
		return this.order;
	}
	public void setOrder(Long order) {
		this.order = order;
	}

}
