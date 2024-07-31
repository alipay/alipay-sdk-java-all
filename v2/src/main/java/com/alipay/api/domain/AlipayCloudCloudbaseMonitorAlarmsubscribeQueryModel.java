package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询报警订阅列表
 *
 * @author auto create
 * @since 1.0, 2024-05-08 14:32:29
 */
public class AlipayCloudCloudbaseMonitorAlarmsubscribeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1424247416118635714L;

	/**
	 * 小程序云app ID
	 */
	@ApiField("biz_app_id")
	private String bizAppId;

	/**
	 * 小程序云环境ID
	 */
	@ApiField("biz_env_id")
	private String bizEnvId;

	/**
	 * 规则ID
	 */
	@ApiField("rule_id")
	private String ruleId;

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

}
