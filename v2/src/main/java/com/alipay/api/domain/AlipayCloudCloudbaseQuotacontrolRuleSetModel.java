package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设置额度防控规则
 *
 * @author auto create
 * @since 1.0, 2023-09-19 14:39:06
 */
public class AlipayCloudCloudbaseQuotacontrolRuleSetModel extends AlipayObject {

	private static final long serialVersionUID = 2457652974986994263L;

	/**
	 * 小程序id
	 */
	@ApiField("biz_app_id")
	private String bizAppId;

	/**
	 * 环境id
	 */
	@ApiField("biz_env_id")
	private String bizEnvId;

	/**
	 * 规则ID
	 */
	@ApiField("rule_id")
	private String ruleId;

	/**
	 * 阈值（比例）
	 */
	@ApiField("threshold")
	private Long threshold;

	public String getBizAppId() {
		return this.bizAppId;
	}
	public void setBizAppId(String bizAppId) {
		this.bizAppId = bizAppId;
	}

	public String getBizEnvId() {
		return this.bizEnvId;
	}
	public void setBizEnvId(String bizEnvId) {
		this.bizEnvId = bizEnvId;
	}

	public String getRuleId() {
		return this.ruleId;
	}
	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
	}

	public Long getThreshold() {
		return this.threshold;
	}
	public void setThreshold(Long threshold) {
		this.threshold = threshold;
	}

}
