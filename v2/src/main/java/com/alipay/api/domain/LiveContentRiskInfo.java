package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 直播物料风险信息
 *
 * @author auto create
 * @since 1.0, 2021-07-29 16:54:53
 */
public class LiveContentRiskInfo extends AlipayObject {

	private static final long serialVersionUID = 3889244128897919584L;

	/**
	 * 当前规则命中的风险详情信息，譬如风险在图片的坐标、位置信息,坐标对应文字。
	 */
	@ApiField("risk_infos")
	private String riskInfos;

	/**
	 * 枚举值：HIGH:高；MID:中；LOW：低
	 */
	@ApiField("risk_level")
	private String riskLevel;

	/**
	 * 风险提示信息
	 */
	@ApiField("risk_tips")
	private String riskTips;

	/**
	 * 规则编码
	 */
	@ApiField("rule_code")
	private String ruleCode;

	/**
	 * 规则名称
	 */
	@ApiField("rule_name")
	private String ruleName;

	public String getRiskInfos() {
		return this.riskInfos;
	}
	public void setRiskInfos(String riskInfos) {
		this.riskInfos = riskInfos;
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

	public String getRuleName() {
		return this.ruleName;
	}
	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}

}
