package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卡周期信息
 *
 * @author auto create
 * @since 1.0, 2023-11-06 15:14:33
 */
public class CardCycleInfo extends AlipayObject {

	private static final long serialVersionUID = 5578339421436624473L;

	/**
	 * 周期计费类型
	 */
	@ApiField("cycle_charge_type")
	private String cycleChargeType;

	/**
	 * 周期类型，月或周
	 */
	@ApiField("cycle_type")
	private String cycleType;

	/**
	 * 周期值。如月卡固定日期的计费方式，需要传入固定每个月的几号
	 */
	@ApiField("cycle_value")
	private Long cycleValue;

	public String getCycleChargeType() {
		return this.cycleChargeType;
	}
	public void setCycleChargeType(String cycleChargeType) {
		this.cycleChargeType = cycleChargeType;
	}

	public String getCycleType() {
		return this.cycleType;
	}
	public void setCycleType(String cycleType) {
		this.cycleType = cycleType;
	}

	public Long getCycleValue() {
		return this.cycleValue;
	}
	public void setCycleValue(Long cycleValue) {
		this.cycleValue = cycleValue;
	}

}
