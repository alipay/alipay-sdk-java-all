package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 层版本信息
 *
 * @author auto create
 * @since 1.0, 2023-09-14 16:02:13
 */
public class LayerVersion extends AlipayObject {

	private static final long serialVersionUID = 6866223438275936868L;

	/**
	 * 版本描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 版本中文名
	 */
	@ApiField("display_name")
	private String displayName;

	/**
	 * 是否能够删除
	 */
	@ApiField("enable_delete")
	private Boolean enableDelete;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/**
	 * 镜像列表中文名称
	 */
	@ApiListField("image_display_names")
	@ApiField("string")
	private List<String> imageDisplayNames;

	/**
	 * 环境镜像值
	 */
	@ApiListField("image_list")
	@ApiField("string")
	private List<String> imageList;

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

	public Boolean getEnableDelete() {
		return this.enableDelete;
	}
	public void setEnableDelete(Boolean enableDelete) {
		this.enableDelete = enableDelete;
	}

	public String getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public List<String> getImageDisplayNames() {
		return this.imageDisplayNames;
	}
	public void setImageDisplayNames(List<String> imageDisplayNames) {
		this.imageDisplayNames = imageDisplayNames;
	}

	public List<String> getImageList() {
		return this.imageList;
	}
	public void setImageList(List<String> imageList) {
		this.imageList = imageList;
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
