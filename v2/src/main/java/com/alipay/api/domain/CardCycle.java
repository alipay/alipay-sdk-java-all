package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 周期信息
 *
 * @author auto create
 * @since 1.0, 2024-04-18 18:01:18
 */
public class CardCycle extends AlipayObject {

	private static final long serialVersionUID = 2837975655495586238L;

	/**
	 * 指定周期付首期扣款的方式
	 */
	@ApiField("cycle_charge_type")
	private String cycleChargeType;

	/**
	 * 指定周期付的周期单位
	 */
	@ApiField("cycle_type")
	private String cycleType;

	/**
	 * 根据周期计费类型来传递参数值
1.固定日期开始扣费，需要传入周几（1-7）或每月几号（1-28）开始扣费
2.指定固定天数后开始扣费，需要传入具体多少天（0-30）
	 */
	@ApiField("cycle_value")
	private String cycleValue;

	/**
	 * 周期计费类型为USER_DESIGN，即用户可指定固定日期开始扣费的场景下，商家可以控制用户下单可选择时间范围，如下单时用户只能选0-30天范围内的时间作为首期计费时间，则该参数传0
	 */
	@ApiField("user_select_range_start")
	private String userSelectRangeStart;

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

	public String getCycleValue() {
		return this.cycleValue;
	}
	public void setCycleValue(String cycleValue) {
		this.cycleValue = cycleValue;
	}

	public String getUserSelectRangeStart() {
		return this.userSelectRangeStart;
	}
	public void setUserSelectRangeStart(String userSelectRangeStart) {
		this.userSelectRangeStart = userSelectRangeStart;
	}

}
