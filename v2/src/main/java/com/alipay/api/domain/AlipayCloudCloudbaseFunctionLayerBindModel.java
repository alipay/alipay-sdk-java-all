package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 绑定层
 *
 * @author auto create
 * @since 1.0, 2023-08-08 22:45:25
 */
public class AlipayCloudCloudbaseFunctionLayerBindModel extends AlipayObject {

	private static final long serialVersionUID = 5444214322715537797L;

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
	 * 层名称
	 */
	@ApiField("layer_name")
	private String layerName;

	/**
	 * 层版本名称
	 */
	@ApiField("layer_version_name")
	private String layerVersionName;

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

	public String getLayerName() {
		return this.layerName;
	}
	public void setLayerName(String layerName) {
		this.layerName = layerName;
	}

	public String getLayerVersionName() {
		return this.layerVersionName;
	}
	public void setLayerVersionName(String layerVersionName) {
		this.layerVersionName = layerVersionName;
	}

}
