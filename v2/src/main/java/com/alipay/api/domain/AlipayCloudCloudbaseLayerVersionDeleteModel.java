package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 删除版本
 *
 * @author auto create
 * @since 1.0, 2023-09-14 17:45:03
 */
public class AlipayCloudCloudbaseLayerVersionDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 6451739168348828796L;

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
	 * 层名称
	 */
	@ApiField("layer_name")
	private String layerName;

	/**
	 * 版本名称
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
