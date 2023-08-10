package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 设置云函数环境变量
 *
 * @author auto create
 * @since 1.0, 2023-08-09 11:02:03
 */
public class AlipayCloudCloudbaseFunctionEnvvarsSetModel extends AlipayObject {

	private static final long serialVersionUID = 1414187329753494514L;

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
	 * 环境变量集合
	 */
	@ApiListField("env_vars")
	@ApiField("env_var")
	private List<EnvVar> envVars;

	/**
	 * 云函数名称
	 */
	@ApiField("function_name")
	private String functionName;

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

	public List<EnvVar> getEnvVars() {
		return this.envVars;
	}
	public void setEnvVars(List<EnvVar> envVars) {
		this.envVars = envVars;
	}

	public String getFunctionName() {
		return this.functionName;
	}
	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}

}
