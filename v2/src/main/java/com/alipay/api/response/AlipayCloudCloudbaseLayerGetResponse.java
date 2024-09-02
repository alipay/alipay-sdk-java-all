package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.layer.get response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-14 17:41:45
 */
public class AlipayCloudCloudbaseLayerGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 7115314519663493567L;

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

	public void setDescription(String description) {
		this.description = description;
	}
	public String getDescription( ) {
		return this.description;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getDisplayName( ) {
		return this.displayName;
	}

	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}
	public String getGmtModified( ) {
		return this.gmtModified;
	}

	public void setLatestLayerVersionName(String latestLayerVersionName) {
		this.latestLayerVersionName = latestLayerVersionName;
	}
	public String getLatestLayerVersionName( ) {
		return this.latestLayerVersionName;
	}

	public void setLayerName(String layerName) {
		this.layerName = layerName;
	}
	public String getLayerName( ) {
		return this.layerName;
	}

}
