package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 解语花风险信息
 *
 * @author auto create
 * @since 1.0, 2022-08-26 11:07:31
 */
public class RiskInfo extends AlipayObject {

	private static final long serialVersionUID = 7329634876155124583L;

	/**
	 * 业务规则 规则相关法律信息，
	 */
	@ApiField("biz_rule")
	private String bizRule;

	/**
	 * 风险提示语
	 */
	@ApiField("notice")
	private String notice;

	/**
	 * 风险详情列表
	 */
	@ApiListField("risk_info_detail_list")
	@ApiField("risk_info_detail")
	private List<RiskInfoDetail> riskInfoDetailList;

	/**
	 * 风险等级，枚举
高,中,低三种
	 */
	@ApiField("risk_level")
	private String riskLevel;

	/**
	 * 规则名称
	 */
	@ApiField("rule_name")
	private String ruleName;

	/**
	 * 规则机审结果
	 */
	@ApiField("rule_robot_status")
	private String ruleRobotStatus;

	public String getBizRule() {
		return this.bizRule;
	}
	public void setBizRule(String bizRule) {
		this.bizRule = bizRule;
	}

	public String getNotice() {
		return this.notice;
	}
	public void setNotice(String notice) {
		this.notice = notice;
	}

	public List<RiskInfoDetail> getRiskInfoDetailList() {
		return this.riskInfoDetailList;
	}
	public void setRiskInfoDetailList(List<RiskInfoDetail> riskInfoDetailList) {
		this.riskInfoDetailList = riskInfoDetailList;
	}

	public String getRiskLevel() {
		return this.riskLevel;
	}
	public void setRiskLevel(String riskLevel) {
		this.riskLevel = riskLevel;
	}

	public String getRuleName() {
		return this.ruleName;
	}
	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}

	public String getRuleRobotStatus() {
		return this.ruleRobotStatus;
	}
	public void setRuleRobotStatus(String ruleRobotStatus) {
		this.ruleRobotStatus = ruleRobotStatus;
	}

}
