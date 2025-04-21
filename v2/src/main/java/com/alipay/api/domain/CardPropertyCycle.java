package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卡属性周期计费信息
 *
 * @author auto create
 * @since 1.0, 2025-03-06 11:22:18
 */
public class CardPropertyCycle extends AlipayObject {

	private static final long serialVersionUID = 6675885969616449282L;

	/**
	 * 指定周期付首期扣款的方式
	 */
	@ApiField("cycle_charge_type")
	private String cycleChargeType;

	/**
	 * 根据周期计费类型来传递参数值
1.固定日期开始扣费，需要传入周几（1-7）或每月几号（1-28）开始扣费
	 */
	@ApiField("cycle_value")
	private String cycleValue;

	public String getCycleChargeType() {
		return this.cycleChargeType;
	}
	public void setCycleChargeType(String cycleChargeType) {
		this.cycleChargeType = cycleChargeType;
	}

	public String getCycleValue() {
		return this.cycleValue;
	}
	public void setCycleValue(String cycleValue) {
		this.cycleValue = cycleValue;
	}

}
