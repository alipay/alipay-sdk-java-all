package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 *  规则配置请求体
 *
 * @author auto create
 * @since 1.0, 2023-02-20 15:50:38
 */
public class CommercializationCustomizeRuleReq extends AlipayObject {

	private static final long serialVersionUID = 1781168786974423395L;

	/**
	 * 规则关注度：
驳回 BLOCK
提醒 ATTENTION
	 */
	@ApiField("attention_level")
	private String attentionLevel;

	/**
	 * 禁用词
	 */
	@ApiListField("black_list")
	@ApiField("string")
	private List<String> blackList;

	/**
	 * 提交唯一标识，幂等性验证
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 必备词
	 */
	@ApiListField("required_list")
	@ApiField("string")
	private List<String> requiredList;

	/**
	 * 风险等级：
低 LOW
中 MID
高 HIGH
	 */
	@ApiField("risk_level")
	private String riskLevel;

	/**
	 * 默认风险提示
	 */
	@ApiField("risk_tips")
	private String riskTips;

	/**
	 * 规则编码，新增不传，修改时传
	 */
	@ApiField("rule_code")
	private String ruleCode;

	/**
	 * 规则描述
	 */
	@ApiField("rule_desc")
	private String ruleDesc;

	/**
	 * 规则名称
	 */
	@ApiField("rule_name")
	private String ruleName;

	/**
	 * 所属场景编码，不可修改
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 豁免词
	 */
	@ApiListField("white_list")
	@ApiField("string")
	private List<String> whiteList;

	public String getAttentionLevel() {
		return this.attentionLevel;
	}
	public void setAttentionLevel(String attentionLevel) {
		this.attentionLevel = attentionLevel;
	}

	public List<String> getBlackList() {
		return this.blackList;
	}
	public void setBlackList(List<String> blackList) {
		this.blackList = blackList;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<String> getRequiredList() {
		return this.requiredList;
	}
	public void setRequiredList(List<String> requiredList) {
		this.requiredList = requiredList;
	}

	public String getRiskLevel() {
		return this.riskLevel;
	}
	public void setRiskLevel(String riskLevel) {
		this.riskLevel = riskLevel;
	}

	public String getRiskTips() {
		return this.riskTips;
	}
	public void setRiskTips(String riskTips) {
		this.riskTips = riskTips;
	}

	public String getRuleCode() {
		return this.ruleCode;
	}
	public void setRuleCode(String ruleCode) {
		this.ruleCode = ruleCode;
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

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public List<String> getWhiteList() {
		return this.whiteList;
	}
	public void setWhiteList(List<String> whiteList) {
		this.whiteList = whiteList;
	}

}
