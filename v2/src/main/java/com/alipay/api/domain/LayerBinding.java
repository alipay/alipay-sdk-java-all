package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 绑定配置
 *
 * @author auto create
 * @since 1.0, 2024-06-27 15:07:25
 */
public class LayerBinding extends AlipayObject {

	private static final long serialVersionUID = 2242233821233599251L;

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

	/**
	 * 层绑定优先级(值越大，优先级越高)
	 */
	@ApiField("sort_score")
	private Long sortScore;

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

	public Long getSortScore() {
		return this.sortScore;
	}
	public void setSortScore(Long sortScore) {
		this.sortScore = sortScore;
	}

}
