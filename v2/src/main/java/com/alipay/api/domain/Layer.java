package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 层列表
 *
 * @author auto create
 * @since 1.0, 2023-09-14 16:07:56
 */
public class Layer extends AlipayObject {

	private static final long serialVersionUID = 1394528761538445579L;

	/**
	 * 层描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 显示名称
	 */
	@ApiField("display_name")
	private String displayName;

	/**
	 * 更新时间
	 */
	@ApiField("gmt_modified")
	private String gmtModified;

	/**
	 * 最新层版本名称
	 */
	@ApiField("latest_layer_version_name")
	private String latestLayerVersionName;

	/**
	 * 层名称
	 */
	@ApiField("layer_name")
	private String layerName;

	/**
	 * 版本信息
	 */
	@ApiField("layer_version")
	private LayerVersion layerVersion;

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getDisplayName() {
		return this.displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getLatestLayerVersionName() {
		return this.latestLayerVersionName;
	}
	public void setLatestLayerVersionName(String latestLayerVersionName) {
		this.latestLayerVersionName = latestLayerVersionName;
	}

	public String getLayerName() {
		return this.layerName;
	}
	public void setLayerName(String layerName) {
		this.layerName = layerName;
	}

	public LayerVersion getLayerVersion() {
		return this.layerVersion;
	}
	public void setLayerVersion(LayerVersion layerVersion) {
		this.layerVersion = layerVersion;
	}

}
