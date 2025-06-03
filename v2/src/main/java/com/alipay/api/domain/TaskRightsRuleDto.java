package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益规则信息
 *
 * @author auto create
 * @since 1.0, 2023-07-11 19:54:26
 */
public class TaskRightsRuleDto extends AlipayObject {

	private static final long serialVersionUID = 7296899553292894487L;

	/**
	 * 完成任务后的基础奖励个数
	 */
	@ApiField("base_award_count")
	private Long baseAwardCount;

	/**
	 * 权益规则配置信息
	 */
	@ApiField("dynamic_award_config")
	private TaskRightsRuleDynamicAwardConfigDto dynamicAwardConfig;

	/**
	 * 权益ID
	 */
	@ApiField("rights_id")
	private String rightsId;

	/**
	 * 权益名称
	 */
	@ApiField("rights_name")
	private String rightsName;

	/**
	 * 权益描述
	 */
	@ApiField("rule_desc")
	private String ruleDesc;

	/**
	 * 规则名称
	 */
	@ApiField("rule_name")
	private String ruleName;

	/**
	 * 规则类型
NORMAL("NORMAL", "普通规则"), 
DYNAMIC("DYNAMIC", "动态规则"),
	 */
	@ApiField("rule_type")
	private String ruleType;

	public Long getBaseAwardCount() {
		return this.baseAwardCount;
	}
	public void setBaseAwardCount(Long baseAwardCount) {
		this.baseAwardCount = baseAwardCount;
	}

	public TaskRightsRuleDynamicAwardConfigDto getDynamicAwardConfig() {
		return this.dynamicAwardConfig;
	}
	public void setDynamicAwardConfig(TaskRightsRuleDynamicAwardConfigDto dynamicAwardConfig) {
		this.dynamicAwardConfig = dynamicAwardConfig;
	}

	public String getRightsId() {
		return this.rightsId;
	}
	public void setRightsId(String rightsId) {
		this.rightsId = rightsId;
	}

	public String getRightsName() {
		return this.rightsName;
	}
	public void setRightsName(String rightsName) {
		this.rightsName = rightsName;
	}

	public String getRuleDesc() {
		return this.ruleDesc;
	}
	public void setRuleDesc(String ruleDesc) {
		this.ruleDesc = ruleDesc;
	}

	public String getRuleName() {
		return this.ruleName;
	}
	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}

	public String getRuleType() {
		return this.ruleType;
	}
	public void setRuleType(String ruleType) {
		this.ruleType = ruleType;
	}

}
