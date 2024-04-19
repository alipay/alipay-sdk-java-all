package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 设置流量分配配置
 *
 * @author auto create
 * @since 1.0, 2023-08-08 22:43:20
 */
public class AlipayCloudCloudbaseFunctionTrafficconfigSetModel extends AlipayObject {

	private static final long serialVersionUID = 7181383193966524474L;

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
	 * 云函数名称
	 */
	@ApiField("function_name")
	private String functionName;

	/**
	 * 流量分配规则
	 */
	@ApiListField("traffic_rules")
	@ApiField("traffic_rule")
	private List<TrafficRule> trafficRules;

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

	public String getFunctionName() {
		return this.functionName;
	}
	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}

	public List<TrafficRule> getTrafficRules() {
		return this.trafficRules;
	}
	public void setTrafficRules(List<TrafficRule> trafficRules) {
		this.trafficRules = trafficRules;
	}

}
