package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资金池规则修改
 *
 * @author auto create
 * @since 1.0, 2020-07-06 11:21:43
 */
public class AlipayAccountCashpoolRuleModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2895181162438728567L;

	/**
	 * 资金池唯一标识
	 */
	@ApiField("cash_pool_id")
	private String cashPoolId;

	/**
	 * 机构自定义备注配置
	 */
	@ApiField("inst_rule_custom_memo")
	private InstRuleCustomMemoVO instRuleCustomMemo;

	/**
	 * 限额水位线
	 */
	@ApiField("limit_walter_line")
	private String limitWalterLine;

	/**
	 * 是否需要自定义备注
	 */
	@ApiField("need_custom_memo")
	private Boolean needCustomMemo;

	/**
	 * 操作员
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 规则唯一标识
	 */
	@ApiField("rule_id")
	private String ruleId;

	/**
	 * RUN/STOP，运行态/暂停态
	 */
	@ApiField("rule_status")
	private String ruleStatus;

	/**
	 * UP_WARD_RULE/DOWN_WARD_RULE，资金上划/下拨
	 */
	@ApiField("rule_type")
	private String ruleType;

	/**
	 * 目标水位线
	 */
	@ApiField("target_walter_line")
	private String targetWalterLine;

	public String getCashPoolId() {
		return this.cashPoolId;
	}
	public void setCashPoolId(String cashPoolId) {
		this.cashPoolId = cashPoolId;
	}

	public InstRuleCustomMemoVO getInstRuleCustomMemo() {
		return this.instRuleCustomMemo;
	}
	public void setInstRuleCustomMemo(InstRuleCustomMemoVO instRuleCustomMemo) {
		this.instRuleCustomMemo = instRuleCustomMemo;
	}

	public String getLimitWalterLine() {
		return this.limitWalterLine;
	}
	public void setLimitWalterLine(String limitWalterLine) {
		this.limitWalterLine = limitWalterLine;
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

	public String getRuleId() {
		return this.ruleId;
	}
	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
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

	public String getTargetWalterLine() {
		return this.targetWalterLine;
	}
	public void setTargetWalterLine(String targetWalterLine) {
		this.targetWalterLine = targetWalterLine;
	}

}
