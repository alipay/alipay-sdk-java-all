package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 绑定层列表
 *
 * @author auto create
 * @since 1.0, 2024-06-27 17:49:45
 */
public class LayerInfo extends AlipayObject {

	private static final long serialVersionUID = 6579471156999379886L;

	/**
	 * 层描述
	 */
	@ApiField("layer_description")
	private String layerDescription;

	/**
	 * 层显示名称
	 */
	@ApiField("layer_display_name")
	private String layerDisplayName;

	/**
	 * 层名称
	 */
	@ApiField("layer_name")
	private String layerName;

	/**
	 * 层版本描述
	 */
	@ApiField("layer_version_description")
	private String layerVersionDescription;

	/**
	 * 层版本中文名
	 */
	@ApiField("layer_version_display_name")
	private String layerVersionDisplayName;

	/**
	 * 层版本镜像列表中文名称
	 */
	@ApiListField("layer_version_image_display_names")
	@ApiField("string")
	private List<String> layerVersionImageDisplayNames;

	/**
	 * 层版本镜像列表
	 */
	@ApiListField("layer_version_image_list")
	@ApiField("string")
	private List<String> layerVersionImageList;

	/**
	 * 层版本名称
	 */
	@ApiField("layer_version_name")
	private String layerVersionName;

	public String getLayerDescription() {
		return this.layerDescription;
	}
	public void setLayerDescription(String layerDescription) {
		this.layerDescription = layerDescription;
	}

	public String getLayerDisplayName() {
		return this.layerDisplayName;
	}
	public void setLayerDisplayName(String layerDisplayName) {
		this.layerDisplayName = layerDisplayName;
	}

	public String getLayerName() {
		return this.layerName;
	}
	public void setLayerName(String layerName) {
		this.layerName = layerName;
	}

	public String getLayerVersionDescription() {
		return this.layerVersionDescription;
	}
	public void setLayerVersionDescription(String layerVersionDescription) {
		this.layerVersionDescription = layerVersionDescription;
	}

	public String getLayerVersionDisplayName() {
		return this.layerVersionDisplayName;
	}
	public void setLayerVersionDisplayName(String layerVersionDisplayName) {
		this.layerVersionDisplayName = layerVersionDisplayName;
	}

	public List<String> getLayerVersionImageDisplayNames() {
		return this.layerVersionImageDisplayNames;
	}
	public void setLayerVersionImageDisplayNames(List<String> layerVersionImageDisplayNames) {
		this.layerVersionImageDisplayNames = layerVersionImageDisplayNames;
	}

	public List<String> getLayerVersionImageList() {
		return this.layerVersionImageList;
	}
	public void setLayerVersionImageList(List<String> layerVersionImageList) {
		this.layerVersionImageList = layerVersionImageList;
	}

	public String getLayerVersionName() {
		return this.layerVersionName;
	}
	public void setLayerVersionName(String layerVersionName) {
		this.layerVersionName = layerVersionName;
	}

}
