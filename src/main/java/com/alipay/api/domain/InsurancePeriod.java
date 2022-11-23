package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保障期限
 *
 * @author auto create
 * @since 1.0, 2022-03-28 17:06:41
 */
public class InsurancePeriod extends AlipayObject {

	private static final long serialVersionUID = 7412622311747678287L;

	/**
	 * 保障期限，正整数
	 */
	@ApiField("period")
	private Long period;

	/**
	 * 保障期限单位，年月日
枚举:YEAR/MONTH/DAY
	 */
	@ApiField("period_unit")
	private String periodUnit;

	public Long getPeriod() {
		return this.period;
	}
	public void setPeriod(Long period) {
		this.period = period;
	}

	public String getPeriodUnit() {
		return this.periodUnit;
	}
	public void setPeriodUnit(String periodUnit) {
		this.periodUnit = periodUnit;
	}

}
