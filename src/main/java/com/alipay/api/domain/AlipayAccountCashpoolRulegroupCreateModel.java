package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 资金池规则组新增
 *
 * @author auto create
 * @since 1.0, 2020-07-06 11:20:19
 */
public class AlipayAccountCashpoolRulegroupCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2464618426574686619L;

	/**
	 * 资金池唯一标识
	 */
	@ApiField("cash_pool_id")
	private String cashPoolId;

	/**
	 * 生效日期
	 */
	@ApiField("effective_time")
	private Date effectiveTime;

	/**
	 * 过期日期
	 */
	@ApiField("expire_time")
	private String expireTime;

	/**
	 * 调拨额度配置
	 */
	@ApiListField("inst_allocation_quota_vo_list")
	@ApiField("inst_allocation_quota_v_o")
	private List<InstAllocationQuotaVO> instAllocationQuotaVoList;

	/**
	 * 备注信息
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 操作人
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 外部单据号，做业务幂等使用
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 父账户目标水位
	 */
	@ApiField("parent_target_water_line")
	private String parentTargetWaterLine;

	/**
	 * 规则组名称
	 */
	@ApiField("rule_group_name")
	private String ruleGroupName;

	/**
	 * 规则组类型，上划/下拨，UP_WARD_RULE/DOWN_WARD_RULE
	 */
	@ApiField("rule_group_type")
	private String ruleGroupType;

	/**
	 * 触发时间，填cron表达式
	 */
	@ApiField("trigger_time")
	private String triggerTime;

	/**
	 * 规则组水位模式，主账户模式/子账户模式SUB_ACCOUNT_MODE/MAIN_ACCOUNT_MODE
	 */
	@ApiField("water_mode")
	private String waterMode;

	public String getCashPoolId() {
		return this.cashPoolId;
	}
	public void setCashPoolId(String cashPoolId) {
		this.cashPoolId = cashPoolId;
	}

	public Date getEffectiveTime() {
		return this.effectiveTime;
	}
	public void setEffectiveTime(Date effectiveTime) {
		this.effectiveTime = effectiveTime;
	}

	public String getExpireTime() {
		return this.expireTime;
	}
	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}

	public List<InstAllocationQuotaVO> getInstAllocationQuotaVoList() {
		return this.instAllocationQuotaVoList;
	}
	public void setInstAllocationQuotaVoList(List<InstAllocationQuotaVO> instAllocationQuotaVoList) {
		this.instAllocationQuotaVoList = instAllocationQuotaVoList;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getParentTargetWaterLine() {
		return this.parentTargetWaterLine;
	}
	public void setParentTargetWaterLine(String parentTargetWaterLine) {
		this.parentTargetWaterLine = parentTargetWaterLine;
	}

	public String getRuleGroupName() {
		return this.ruleGroupName;
	}
	public void setRuleGroupName(String ruleGroupName) {
		this.ruleGroupName = ruleGroupName;
	}

	public String getRuleGroupType() {
		return this.ruleGroupType;
	}
	public void setRuleGroupType(String ruleGroupType) {
		this.ruleGroupType = ruleGroupType;
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
