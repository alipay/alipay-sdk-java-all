package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 固定租金计费规则
 *
 * @author auto create
 * @since 1.0, 2024-10-11 09:09:46
 */
public class FixedRentBillingRuleDTO extends AlipayObject {

	private static final long serialVersionUID = 5151617215367461866L;

	/**
	 * 按期数时必填
只作展示
	 */
	@ApiField("period_num")
	private Long periodNum;

	/**
	 * 每期租金金额(单位元),最多2位小数
按期数时必填
	 */
	@ApiField("period_rent_amount")
	private String periodRentAmount;

	/**
	 * 按期数时必填
分钟: MINUTE;小时: HOUR;
晚（酒店住宿用）: NIGHT;
天: DAY;
周: WEEK;
月: MONTH;
期: PERIOD
	 */
	@ApiField("period_unit")
	private String periodUnit;

	/**
	 * 按期数时必填
例：每期时间单位是分钟, 每期时间数值15, 那就是每15分钟是一个计费周期
	 */
	@ApiField("period_unit_num")
	private Long periodUnitNum;

	/**
	 * 最多2位小数，
类型固定FIXED时必填
	 */
	@ApiField("rent_amount")
	private String rentAmount;

	/**
	 * 固定：FIXED
按期数：PERIOD
	 */
	@ApiField("type")
	private String type;

	public Long getPeriodNum() {
		return this.periodNum;
	}
	public void setPeriodNum(Long periodNum) {
		this.periodNum = periodNum;
	}

	public String getPeriodRentAmount() {
		return this.periodRentAmount;
	}
	public void setPeriodRentAmount(String periodRentAmount) {
		this.periodRentAmount = periodRentAmount;
	}

	public String getPeriodUnit() {
		return this.periodUnit;
	}
	public void setPeriodUnit(String periodUnit) {
		this.periodUnit = periodUnit;
	}

	public Long getPeriodUnitNum() {
		return this.periodUnitNum;
	}
	public void setPeriodUnitNum(Long periodUnitNum) {
		this.periodUnitNum = periodUnitNum;
	}

	public String getRentAmount() {
		return this.rentAmount;
	}
	public void setRentAmount(String rentAmount) {
		this.rentAmount = rentAmount;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
