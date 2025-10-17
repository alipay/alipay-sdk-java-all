package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 计划分页返回对象
 *
 * @author auto create
 * @since 1.0, 2025-05-12 16:14:53
 */
public class PlanPageListRes extends AlipayObject {

	private static final long serialVersionUID = 1858296579119519591L;

	/**
	 * 计划日预算。单位：元
	 */
	@ApiField("budget")
	private String budget;

	/**
	 * 计费方式
	 */
	@ApiField("charge_type")
	private String chargeType;

	/**
	 * 投放结束日期,日期格式为yyyy-MM-dd
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 二级营销目标code
	 */
	@ApiField("market_target_code")
	private String marketTargetCode;

	/**
	 * 营销目标配置
	 */
	@ApiField("market_target_config")
	private MarketTargetConfiguration marketTargetConfig;

	/**
	 * 二级营销目标名称
	 */
	@ApiField("market_target_name")
	private String marketTargetName;

	/**
	 * 计划id
	 */
	@ApiField("plan_id")
	private Long planId;

	/**
	 * 计划名称
	 */
	@ApiField("plan_name")
	private String planName;

	/**
	 * 计划状态
	 */
	@ApiField("plan_status")
	private String planStatus;

	/**
	 * 计划不限日预算开关
	 */
	@ApiField("plan_unlimited_budget_switch")
	private String planUnlimitedBudgetSwitch;

	/**
	 * 商家id
	 */
	@ApiField("principal_id")
	private Long principalId;

	/**
	 * 场景code
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 交易模式
	 */
	@ApiField("sell_mode")
	private String sellMode;

	/**
	 * 投放开始时间,日期格式为yyyy-MM-dd
	 */
	@ApiField("start_date")
	private String startDate;

	/**
	 * 投放时段 全时段投放-位null 不返回该字段
	 */
	@ApiField("time_schema")
	private String timeSchema;

	public String getBudget() {
		return this.budget;
	}
	public void setBudget(String budget) {
		this.budget = budget;
	}

	public String getChargeType() {
		return this.chargeType;
	}
	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
	}

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getMarketTargetCode() {
		return this.marketTargetCode;
	}
	public void setMarketTargetCode(String marketTargetCode) {
		this.marketTargetCode = marketTargetCode;
	}

	public MarketTargetConfiguration getMarketTargetConfig() {
		return this.marketTargetConfig;
	}
	public void setMarketTargetConfig(MarketTargetConfiguration marketTargetConfig) {
		this.marketTargetConfig = marketTargetConfig;
	}

	public String getMarketTargetName() {
		return this.marketTargetName;
	}
	public void setMarketTargetName(String marketTargetName) {
		this.marketTargetName = marketTargetName;
	}

	public Long getPlanId() {
		return this.planId;
	}
	public void setPlanId(Long planId) {
		this.planId = planId;
	}

	public String getPlanName() {
		return this.planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getPlanStatus() {
		return this.planStatus;
	}
	public void setPlanStatus(String planStatus) {
		this.planStatus = planStatus;
	}

	public String getPlanUnlimitedBudgetSwitch() {
		return this.planUnlimitedBudgetSwitch;
	}
	public void setPlanUnlimitedBudgetSwitch(String planUnlimitedBudgetSwitch) {
		this.planUnlimitedBudgetSwitch = planUnlimitedBudgetSwitch;
	}

	public Long getPrincipalId() {
		return this.principalId;
	}
	public void setPrincipalId(Long principalId) {
		this.principalId = principalId;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getSellMode() {
		return this.sellMode;
	}
	public void setSellMode(String sellMode) {
		this.sellMode = sellMode;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getTimeSchema() {
		return this.timeSchema;
	}
	public void setTimeSchema(String timeSchema) {
		this.timeSchema = timeSchema;
	}

}
