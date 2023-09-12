package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 策略风险模型
 *
 * @author auto create
 * @since 1.0, 2022-11-14 14:20:55
 */
public class RiskStrategy extends AlipayObject {

	private static final long serialVersionUID = 7282147541418897478L;

	/**
	 * 是否有详情
	 */
	@ApiField("has_detail")
	private Boolean hasDetail;

	/**
	 * 策略命中标识
	 */
	@ApiField("strategy_hit_flag")
	private Boolean strategyHitFlag;

	/**
	 * 策略id
	 */
	@ApiField("strategy_id")
	private String strategyId;

	/**
	 * 风险策略名称
	 */
	@ApiField("strategy_name")
	private String strategyName;

	/**
	 * 命中策略的值
	 */
	@ApiField("strategy_value")
	private String strategyValue;

	/**
	 * 策略值状态，SUCCESS表示可用，FAILURE表示无效
	 */
	@ApiField("strategy_value_status")
	private String strategyValueStatus;

	/**
	 * 策略值类型
	 */
	@ApiField("strategy_value_type")
	private String strategyValueType;

	public Boolean getHasDetail() {
		return this.hasDetail;
	}
	public void setHasDetail(Boolean hasDetail) {
		this.hasDetail = hasDetail;
	}

	public Boolean getStrategyHitFlag() {
		return this.strategyHitFlag;
	}
	public void setStrategyHitFlag(Boolean strategyHitFlag) {
		this.strategyHitFlag = strategyHitFlag;
	}

	public String getStrategyId() {
		return this.strategyId;
	}
	public void setStrategyId(String strategyId) {
		this.strategyId = strategyId;
	}

	public String getStrategyName() {
		return this.strategyName;
	}
	public void setStrategyName(String strategyName) {
		this.strategyName = strategyName;
	}

	public String getStrategyValue() {
		return this.strategyValue;
	}
	public void setStrategyValue(String strategyValue) {
		this.strategyValue = strategyValue;
	}

	public String getStrategyValueStatus() {
		return this.strategyValueStatus;
	}
	public void setStrategyValueStatus(String strategyValueStatus) {
		this.strategyValueStatus = strategyValueStatus;
	}

	public String getStrategyValueType() {
		return this.strategyValueType;
	}
	public void setStrategyValueType(String strategyValueType) {
		this.strategyValueType = strategyValueType;
	}

}
