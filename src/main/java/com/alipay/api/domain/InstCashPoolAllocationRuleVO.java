package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机构资金池调拨规则
 *
 * @author auto create
 * @since 1.0, 2020-06-19 17:51:29
 */
public class InstCashPoolAllocationRuleVO extends AlipayObject {

	private static final long serialVersionUID = 8364534776852383144L;

	/**
	 * 机构账号
	 */
	@ApiField("inst_account")
	private InstAccountDTO instAccount;

	/**
	 * 机构自定义备注
	 */
	@ApiField("inst_rule_custom_memo")
	private InstRuleCustomMemoVO instRuleCustomMemo;

	/**
	 * 限额水位
	 */
	@ApiField("limit_water_line")
	private String limitWaterLine;

	/**
	 * 规则备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 是否需要自定义备注
	 */
	@ApiField("need_custom_memo")
	private Boolean needCustomMemo;

	/**
	 * 操作员名称
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 父机构类型
	 */
	@ApiField("parent_inst_account")
	private InstAccountDTO parentInstAccount;

	/**
	 * 规则名称
	 */
	@ApiField("rule_name")
	private String ruleName;

	/**
	 * 规则优先级
	 */
	@ApiField("rule_order")
	private Long ruleOrder;

	/**
	 * INITIAL/RUN/STOP，初始态/运行态/暂停态
	 */
	@ApiField("rule_status")
	private String ruleStatus;

	/**
	 * 上划规则/下拨规则，UP_WARD_RULE/DOWN_WARD_RULE
	 */
	@ApiField("rule_type")
	private String ruleType;

	/**
	 * 目标水位线
	 */
	@ApiField("target_water_line")
	private String targetWaterLine;

	public InstAccountDTO getInstAccount() {
		return this.instAccount;
	}
	public void setInstAccount(InstAccountDTO instAccount) {
		this.instAccount = instAccount;
	}

	public InstRuleCustomMemoVO getInstRuleCustomMemo() {
		return this.instRuleCustomMemo;
	}
	public void setInstRuleCustomMemo(InstRuleCustomMemoVO instRuleCustomMemo) {
		this.instRuleCustomMemo = instRuleCustomMemo;
	}

	public String getLimitWaterLine() {
		return this.limitWaterLine;
	}
	public void setLimitWaterLine(String limitWaterLine) {
		this.limitWaterLine = limitWaterLine;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Boolean getNeedCustomMemo() {
		return this.needCustomMemo;
	}
	public void setNeedCustomMemo(Boolean needCustomMemo) {
		this.needCustomMemo = needCustomMemo;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public InstAccountDTO getParentInstAccount() {
		return this.parentInstAccount;
	}
	public void setParentInstAccount(InstAccountDTO parentInstAccount) {
		this.parentInstAccount = parentInstAccount;
	}

	public String getRuleName() {
		return this.ruleName;
	}
	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}

	public Long getRuleOrder() {
		return this.ruleOrder;
	}
	public void setRuleOrder(Long ruleOrder) {
		this.ruleOrder = ruleOrder;
	}

	public String getRuleStatus() {
		return this.ruleStatus;
	}
	public void setRuleStatus(String ruleStatus) {
		this.ruleStatus = ruleStatus;
	}

	public String getRuleType() {
		return this.ruleType;
	}
	public void setRuleType(String ruleType) {
		this.ruleType = ruleType;
	}

	public String getTargetWaterLine() {
		return this.targetWaterLine;
	}
	public void setTargetWaterLine(String targetWaterLine) {
		this.targetWaterLine = targetWaterLine;
	}

}
