package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 周期信息
 *
 * @author auto create
 * @since 1.0, 2024-11-01 17:06:17
 */
public class CardCycle extends AlipayObject {

	private static final long serialVersionUID = 8847739819359148334L;

	/**
	 * 1.当该参数配置为true时，在用户下单时立即扣第一期的金额
2.默认没有权限，需要找客户经理申请权限
	 */
	@ApiField("charge_now")
	private Boolean chargeNow;

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
	 * 周期卡商品类型，用于业务标识，年卡/季卡 当前字段已废弃(支持自定义期数，不需要该字段)
	 */
	@ApiField("period_item_type")
	@Deprecated
	private String periodItemType;

	/**
	 * 周期计费类型为USER_DESIGN，即用户可指定固定日期开始扣费的场景下，商家可以控制用户下单可选择时间范围。
值的范围是[0,26]：如下单时用户只能选0-30天范围内的时间作为首期计费时间，则该参数传0。如下单时用户只能选15-30天范围内的时间作为首期计费时间，则该参数传15。
	 */
	@ApiField("user_select_range_start")
	private String userSelectRangeStart;

	public Boolean getChargeNow() {
		return this.chargeNow;
	}
	public void setChargeNow(Boolean chargeNow) {
		this.chargeNow = chargeNow;
	}

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

	public String getPeriodItemType() {
		return this.periodItemType;
	}
	public void setPeriodItemType(String periodItemType) {
		this.periodItemType = periodItemType;
	}

	public String getUserSelectRangeStart() {
		return this.userSelectRangeStart;
	}
	public void setUserSelectRangeStart(String userSelectRangeStart) {
		this.userSelectRangeStart = userSelectRangeStart;
	}

}
