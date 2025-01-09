package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 每阶段租金配置信息
 *
 * @author auto create
 * @since 1.0, 2024-10-11 09:09:46
 */
public class MultiStageAmountConfigDTO extends AlipayObject {

	private static final long serialVersionUID = 3189762448413335634L;

	/**
	 * 每期租金(单位元),最多2位小数
	 */
	@ApiField("period_rent_amount")
	private String periodRentAmount;

	/**
	 * 分钟: MINUTE;小时: HOUR;
	 */
	@ApiField("period_unit")
	private String periodUnit;

	/**
	 * 例：每期时间单位是分钟, 每期时间数值15, 那就是每15分钟是一个计费周期
	 */
	@ApiField("period_unit_num")
	private Long periodUnitNum;

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

}
