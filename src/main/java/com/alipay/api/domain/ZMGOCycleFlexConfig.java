package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻GO模板的周期灵活扣配置
 *
 * @author auto create
 * @since 1.0, 2022-08-26 09:59:59
 */
public class ZMGOCycleFlexConfig extends AlipayObject {

	private static final long serialVersionUID = 5462484843885341334L;

	/**
	 * 周期灵活扣的费用名称
	 */
	@ApiField("cycle_flex_withhold_fee_name")
	private String cycleFlexWithholdFeeName;

	/**
	 * 周期灵活扣单期扣款的最大额度
	 */
	@ApiField("cycle_flex_withhold_max_price")
	private String cycleFlexWithholdMaxPrice;

	/**
	 * 周期灵活扣的总期数
	 */
	@ApiField("cycle_flex_withhold_total_period_count")
	private Long cycleFlexWithholdTotalPeriodCount;

	public String getCycleFlexWithholdFeeName() {
		return this.cycleFlexWithholdFeeName;
	}
	public void setCycleFlexWithholdFeeName(String cycleFlexWithholdFeeName) {
		this.cycleFlexWithholdFeeName = cycleFlexWithholdFeeName;
	}

	public String getCycleFlexWithholdMaxPrice() {
		return this.cycleFlexWithholdMaxPrice;
	}
	public void setCycleFlexWithholdMaxPrice(String cycleFlexWithholdMaxPrice) {
		this.cycleFlexWithholdMaxPrice = cycleFlexWithholdMaxPrice;
	}

	public Long getCycleFlexWithholdTotalPeriodCount() {
		return this.cycleFlexWithholdTotalPeriodCount;
	}
	public void setCycleFlexWithholdTotalPeriodCount(Long cycleFlexWithholdTotalPeriodCount) {
		this.cycleFlexWithholdTotalPeriodCount = cycleFlexWithholdTotalPeriodCount;
	}

}
