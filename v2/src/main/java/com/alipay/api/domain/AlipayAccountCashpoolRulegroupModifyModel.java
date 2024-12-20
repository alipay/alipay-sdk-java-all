package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 资金池规则组修改
 *
 * @author auto create
 * @since 1.0, 2020-07-06 11:21:03
 */
public class AlipayAccountCashpoolRulegroupModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1354789224182141124L;

	/**
	 * 资金池唯一标识
	 */
	@ApiField("cash_pool_id")
	private String cashPoolId;

	/**
	 * UP_WARD_RULE/DOWN_WARD_RULE;上划/下拨
	 */
	@ApiField("config_type")
	private String configType;

	/**
	 * 调拨限额修改
	 */
	@ApiListField("inst_allocation_quota_vo_list")
	@ApiField("inst_allocation_quota_v_o")
	private List<InstAllocationQuotaVO> instAllocationQuotaVoList;

	/**
	 * 操作员
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 父账户目标水位
	 */
	@ApiField("parent_target_water_line")
	private String parentTargetWaterLine;

	/**
	 * 规则组唯一标识
	 */
	@ApiField("rule_group_id")
	private String ruleGroupId;

	/**
	 * INITIAL/RUN/STOP，规则组状态，初始/运行/暂停
	 */
	@ApiField("rule_group_status")
	private String ruleGroupStatus;

	/**
	 * 规则触发的cron表达式
	 */
	@ApiField("trigger_time")
	private String triggerTime;

	/**
	 * 子账户模式/主账户模式，SUB_ACCOUNT_MODE/MAIN_ACCOUNT_MODE
	 */
	@ApiField("water_mode")
	private String waterMode;

	public String getCashPoolId() {
		return this.cashPoolId;
	}
	public void setCashPoolId(String cashPoolId) {
		this.cashPoolId = cashPoolId;
	}

	public String getConfigType() {
		return this.configType;
	}
	public void setConfigType(String configType) {
		this.configType = configType;
	}

	public List<InstAllocationQuotaVO> getInstAllocationQuotaVoList() {
		return this.instAllocationQuotaVoList;
	}
	public void setInstAllocationQuotaVoList(List<InstAllocationQuotaVO> instAllocationQuotaVoList) {
		this.instAllocationQuotaVoList = instAllocationQuotaVoList;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getParentTargetWaterLine() {
		return this.parentTargetWaterLine;
	}
	public void setParentTargetWaterLine(String parentTargetWaterLine) {
		this.parentTargetWaterLine = parentTargetWaterLine;
	}

	public String getRuleGroupId() {
		return this.ruleGroupId;
	}
	public void setRuleGroupId(String ruleGroupId) {
		this.ruleGroupId = ruleGroupId;
	}

	public String getRuleGroupStatus() {
		return this.ruleGroupStatus;
	}
	public void setRuleGroupStatus(String ruleGroupStatus) {
		this.ruleGroupStatus = ruleGroupStatus;
	}

	public String getTriggerTime() {
		return this.triggerTime;
	}
	public void setTriggerTime(String triggerTime) {
		this.triggerTime = triggerTime;
	}

	public String getWaterMode() {
		return this.waterMode;
	}
	public void setWaterMode(String waterMode) {
		this.waterMode = waterMode;
	}

}
