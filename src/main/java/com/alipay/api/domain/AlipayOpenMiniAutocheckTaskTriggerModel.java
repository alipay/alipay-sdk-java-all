package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 一站式验收触发接口
 *
 * @author auto create
 * @since 1.0, 2022-10-27 09:16:49
 */
public class AlipayOpenMiniAutocheckTaskTriggerModel extends AlipayObject {

	private static final long serialVersionUID = 7375816969911416137L;

	/**
	 * 用例ID
	 */
	@ApiField("case_id")
	private String caseId;

	/**
	 * 策略ID
	 */
	@ApiField("strategy_id")
	private String strategyId;

	/**
	 * 任务执行人，传工号
	 */
	@ApiField("trigger")
	private String trigger;

	public String getCaseId() {
		return this.caseId;
	}
	public void setCaseId(String caseId) {
		this.caseId = caseId;
	}

	public String getStrategyId() {
		return this.strategyId;
	}
	public void setStrategyId(String strategyId) {
		this.strategyId = strategyId;
	}

	public String getTrigger() {
		return this.trigger;
	}
	public void setTrigger(String trigger) {
		this.trigger = trigger;
	}

}
