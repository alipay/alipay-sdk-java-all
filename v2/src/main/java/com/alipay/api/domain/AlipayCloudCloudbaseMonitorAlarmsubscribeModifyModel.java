package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 更新报警规则订阅(CUD)
 *
 * @author auto create
 * @since 1.0, 2024-05-08 14:34:55
 */
public class AlipayCloudCloudbaseMonitorAlarmsubscribeModifyModel extends AlipayObject {

	private static final long serialVersionUID = 6744918187281291728L;

	/**
	 * 报警规则订阅集合
	 */
	@ApiListField("alarm_subscribes")
	@ApiField("alarm_subscribe")
	private List<AlarmSubscribe> alarmSubscribes;

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

	public List<AlarmSubscribe> getAlarmSubscribes() {
		return this.alarmSubscribes;
	}
	public void setAlarmSubscribes(List<AlarmSubscribe> alarmSubscribes) {
		this.alarmSubscribes = alarmSubscribes;
	}

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
