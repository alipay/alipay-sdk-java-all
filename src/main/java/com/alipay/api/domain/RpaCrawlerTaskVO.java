package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * rpa爬虫返回对象
 *
 * @author auto create
 * @since 1.0, 2021-03-08 15:16:19
 */
public class RpaCrawlerTaskVO extends AlipayObject {

	private static final long serialVersionUID = 7387774825674324722L;

	/**
	 * 算法id
	 */
	@ApiField("algo_id")
	private String algoId;

	/**
	 * 业务目标
	 */
	@ApiField("biz_goal")
	private String bizGoal;

	/**
	 * 创意列表
	 */
	@ApiListField("creative_code_list")
	@ApiField("string")
	private List<String> creativeCodeList;

	/**
	 * 创意包code
	 */
	@ApiField("creative_group_code")
	private String creativeGroupCode;

	/**
	 * 创意包版本
	 */
	@ApiField("creative_group_version")
	private String creativeGroupVersion;

	/**
	 * 人群列表
	 */
	@ApiListField("crowd_id_list")
	@ApiField("string")
	private List<String> crowdIdList;

	/**
	 * 单元名称
	 */
	@ApiField("deliver_unit_name")
	private String deliverUnitName;

	/**
	 * 结束时间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 疲劳度
	 */
	@ApiField("fatigue")
	private String fatigue;

	/**
	 * 计划code
	 */
	@ApiField("plan_id")
	private String planId;

	/**
	 * 展位码
	 */
	@ApiField("position_code")
	private String positionCode;

	/**
	 * 规则ID
	 */
	@ApiField("rule_id")
	private String ruleId;

	/**
	 * 开始时间
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * 策略ID
	 */
	@ApiField("strategy_id")
	private String strategyId;

	/**
	 * 任务ID
	 */
	@ApiField("task_id")
	private String taskId;

	/**
	 * 白名单列表
	 */
	@ApiListField("white_list")
	@ApiField("string")
	private List<String> whiteList;

	public String getAlgoId() {
		return this.algoId;
	}
	public void setAlgoId(String algoId) {
		this.algoId = algoId;
	}

	public String getBizGoal() {
		return this.bizGoal;
	}
	public void setBizGoal(String bizGoal) {
		this.bizGoal = bizGoal;
	}

	public List<String> getCreativeCodeList() {
		return this.creativeCodeList;
	}
	public void setCreativeCodeList(List<String> creativeCodeList) {
		this.creativeCodeList = creativeCodeList;
	}

	public String getCreativeGroupCode() {
		return this.creativeGroupCode;
	}
	public void setCreativeGroupCode(String creativeGroupCode) {
		this.creativeGroupCode = creativeGroupCode;
	}

	public String getCreativeGroupVersion() {
		return this.creativeGroupVersion;
	}
	public void setCreativeGroupVersion(String creativeGroupVersion) {
		this.creativeGroupVersion = creativeGroupVersion;
	}

	public List<String> getCrowdIdList() {
		return this.crowdIdList;
	}
	public void setCrowdIdList(List<String> crowdIdList) {
		this.crowdIdList = crowdIdList;
	}

	public String getDeliverUnitName() {
		return this.deliverUnitName;
	}
	public void setDeliverUnitName(String deliverUnitName) {
		this.deliverUnitName = deliverUnitName;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getFatigue() {
		return this.fatigue;
	}
	public void setFatigue(String fatigue) {
		this.fatigue = fatigue;
	}

	public String getPlanId() {
		return this.planId;
	}
	public void setPlanId(String planId) {
		this.planId = planId;
	}

	public String getPositionCode() {
		return this.positionCode;
	}
	public void setPositionCode(String positionCode) {
		this.positionCode = positionCode;
	}

	public String getRuleId() {
		return this.ruleId;
	}
	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getStrategyId() {
		return this.strategyId;
	}
	public void setStrategyId(String strategyId) {
		this.strategyId = strategyId;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public List<String> getWhiteList() {
		return this.whiteList;
	}
	public void setWhiteList(List<String> whiteList) {
		this.whiteList = whiteList;
	}

}
