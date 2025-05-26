package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询层版本绑定函数列表
 *
 * @author auto create
 * @since 1.0, 2024-08-16 15:00:16
 */
public class AlipayCloudCloudbaseLayerFunctionQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8669687561763584125L;

	/**
	 * 小程序云AppID
	 */
	@ApiField("biz_app_id")
	private String bizAppId;

	/**
	 * 小程序云环境ID
	 */
	@ApiField("biz_env_id")
	private String bizEnvId;

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
