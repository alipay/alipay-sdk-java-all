package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁期数
 *
 * @author auto create
 * @since 1.0, 2025-03-18 16:05:55
 */
public class RentPeriod extends AlipayObject {

	private static final long serialVersionUID = 3393251926146351746L;

	/**
	 * 期数的步长，单位：天/月/年
	 */
	@ApiField("step")
	private Long step;

	/**
	 * 总的期数
	 */
	@ApiField("total")
	private Long total;

	/**
	 * 期数的单位，默认月
	 */
	@ApiField("unit")
	private String unit;

	public Long getStep() {
		return this.step;
	}
	public void setStep(Long step) {
		this.step = step;
	}

	public Long getTotal() {
		return this.total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}

	public String getUnit() {
		return this.unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}

}
