package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卡周期信息
 *
 * @author auto create
 * @since 1.0, 2023-12-01 13:53:37
 */
public class CardCycleInfo extends AlipayObject {

	private static final long serialVersionUID = 5894255583931191741L;

	/**
	 * 周期计费类型
	 */
	@ApiField("cycle_charge_type")
	private String cycleChargeType;

	/**
	 * 周期类型为CycleTypeEnum.DAY时使用、代表几天为一个周期
	 */
	@ApiField("cycle_range")
	private Long cycleRange;

	/**
	 * 周期类型，日、月或周
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

	public Long getCycleRange() {
		return this.cycleRange;
	}
	public void setCycleRange(Long cycleRange) {
		this.cycleRange = cycleRange;
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
