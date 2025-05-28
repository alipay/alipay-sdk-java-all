package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改参数配置
 *
 * @author auto create
 * @since 1.0, 2023-08-08 22:44:56
 */
public class AlipayCloudCloudbaseFunctionArgumentModifyModel extends AlipayObject {

	private static final long serialVersionUID = 7527792581379139871L;

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
	 * 参数数据
	 */
	@ApiField("body")
	private String body;

	/**
	 * 云函数名称
	 */
	@ApiField("function_name")
	private String functionName;

	/**
	 * 参数名称
	 */
	@ApiField("name")
	private String name;

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

	public String getBody() {
		return this.body;
	}
	public void setBody(String body) {
		this.body = body;
	}

	public String getFunctionName() {
		return this.functionName;
	}
	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
