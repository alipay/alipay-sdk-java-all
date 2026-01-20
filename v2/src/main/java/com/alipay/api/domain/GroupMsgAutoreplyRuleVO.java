package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家群自动回复规则模型
 *
 * @author auto create
 * @since 1.0, 2025-07-09 11:39:28
 */
public class GroupMsgAutoreplyRuleVO extends AlipayObject {

	private static final long serialVersionUID = 8257654162879281735L;

	/**
	 * 行动配置
	 */
	@ApiField("action_config")
	private GroupMsgAutoreplyActionConfigVO actionConfig;

	/**
	 * 触发规则
	 */
	@ApiField("trigger_rule")
	private GroupMsgAutoreplyTriggerRuleVO triggerRule;

	public GroupMsgAutoreplyActionConfigVO getActionConfig() {
		return this.actionConfig;
	}
	public void setActionConfig(GroupMsgAutoreplyActionConfigVO actionConfig) {
		this.actionConfig = actionConfig;
	}

	public GroupMsgAutoreplyTriggerRuleVO getTriggerRule() {
		return this.triggerRule;
	}
	public void setTriggerRule(GroupMsgAutoreplyTriggerRuleVO triggerRule) {
		this.triggerRule = triggerRule;
	}

}
