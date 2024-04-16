package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.layer.version.get response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-14 17:41:45
 */
public class AlipayCloudCloudbaseLayerVersionGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 2737528572793437241L;

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
	 * 镜像列表
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

	public void setEnableDelete(Boolean enableDelete) {
		this.enableDelete = enableDelete;
	}
	public Boolean getEnableDelete( ) {
		return this.enableDelete;
	}

	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	public String getGmtCreate( ) {
		return this.gmtCreate;
	}

	public void setImageDisplayNames(List<String> imageDisplayNames) {
		this.imageDisplayNames = imageDisplayNames;
	}
	public List<String> getImageDisplayNames( ) {
		return this.imageDisplayNames;
	}

	public void setImageList(List<String> imageList) {
		this.imageList = imageList;
	}
	public List<String> getImageList( ) {
		return this.imageList;
	}

	public void setLayerName(String layerName) {
		this.layerName = layerName;
	}
	public String getLayerName( ) {
		return this.layerName;
	}

	public void setLayerVersionName(String layerVersionName) {
		this.layerVersionName = layerVersionName;
	}
	public String getLayerVersionName( ) {
		return this.layerVersionName;
	}

}
