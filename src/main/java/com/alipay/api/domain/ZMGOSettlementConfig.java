package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻GO模板的结算信息配置

 *
 * @author auto create
 * @since 1.0, 2022-08-26 09:59:52
 */
public class ZMGOSettlementConfig extends AlipayObject {

	private static final long serialVersionUID = 3466732827322242184L;

	/**
	 * 会员费扣费名称
	 */
	@ApiField("custom_fee_name")
	private String customFeeName;

	/**
	 * 周期灵活扣配置，当商户接入的玩法是周期灵活扣时，此属性为必传
	 */
	@ApiField("cycle_flex_withhold_config")
	private ZMGOCycleFlexConfig cycleFlexWithholdConfig;

	/**
	 * 芝麻GO周期扣配置
	 */
	@ApiField("cycle_withhold_config")
	private ZMGOCycleWithholdConfig cycleWithholdConfig;

	/**
	 * 预计结算延迟天数，当exp_stop_time_mode取值RELATIVE_DATE、ABSOLATE_DATE、ABSOLUTE_PLUS_1_DATE时，必传
	 */
	@ApiField("exp_stop_delay_days")
	private Long expStopDelayDays;

	/**
	 * 预期结算时间，当exp_stop_time_mode取值APPOINT_DATE时，必传
	 */
	@ApiField("exp_stop_time")
	private Date expStopTime;

	/**
	 * 预计结算时间模式，取值：（1）RELATIVE_DATE("RELATIVE_DATE", "相对日期"), （2）ABSOLATE_DATE("ABSOLATE_DATE", "绝对日期(当日开始计算)"), （3）ABSOLUTE_PLUS_1_DATE("ABSOLUTE_PLUS_1_DATE", "绝对日期(次日开始计算)"), （4）APPOINT_DATE("APPOINT_DATE", "指定日期")
	 */
	@ApiField("exp_stop_time_mode")
	private String expStopTimeMode;

	/**
	 * 按履约次数灵活扣款计划。当settlement_type取值为fulfillTimesCustomSettlement时，此属性必传
	 */
	@ApiField("fulfilltimes_custom_settlement_plan")
	private String fulfilltimesCustomSettlementPlan;

	/**
	 * 结算类型，取值：
    BENEFIT_SETTLEMENT("benefitSettlement", "按权益金额结算"),
    FULFILL_TIMES_CUSTOM_SETTLEMENT("fulfillTimesCustomSettlement","按履约次数扣款")
	 */
	@ApiField("settlement_type")
	private String settlementType;

	public String getCustomFeeName() {
		return this.customFeeName;
	}
	public void setCustomFeeName(String customFeeName) {
		this.customFeeName = customFeeName;
	}

	public ZMGOCycleFlexConfig getCycleFlexWithholdConfig() {
		return this.cycleFlexWithholdConfig;
	}
	public void setCycleFlexWithholdConfig(ZMGOCycleFlexConfig cycleFlexWithholdConfig) {
		this.cycleFlexWithholdConfig = cycleFlexWithholdConfig;
	}

	public ZMGOCycleWithholdConfig getCycleWithholdConfig() {
		return this.cycleWithholdConfig;
	}
	public void setCycleWithholdConfig(ZMGOCycleWithholdConfig cycleWithholdConfig) {
		this.cycleWithholdConfig = cycleWithholdConfig;
	}

	public Long getExpStopDelayDays() {
		return this.expStopDelayDays;
	}
	public void setExpStopDelayDays(Long expStopDelayDays) {
		this.expStopDelayDays = expStopDelayDays;
	}

	public Date getExpStopTime() {
		return this.expStopTime;
	}
	public void setExpStopTime(Date expStopTime) {
		this.expStopTime = expStopTime;
	}

	public String getExpStopTimeMode() {
		return this.expStopTimeMode;
	}
	public void setExpStopTimeMode(String expStopTimeMode) {
		this.expStopTimeMode = expStopTimeMode;
	}

	public String getFulfilltimesCustomSettlementPlan() {
		return this.fulfilltimesCustomSettlementPlan;
	}
	public void setFulfilltimesCustomSettlementPlan(String fulfilltimesCustomSettlementPlan) {
		this.fulfilltimesCustomSettlementPlan = fulfilltimesCustomSettlementPlan;
	}

	public String getSettlementType() {
		return this.settlementType;
	}
	public void setSettlementType(String settlementType) {
		this.settlementType = settlementType;
	}

}
