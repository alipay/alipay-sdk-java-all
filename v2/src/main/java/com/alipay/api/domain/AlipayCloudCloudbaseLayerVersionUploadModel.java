package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 上传文件
 *
 * @author auto create
 * @since 1.0, 2023-09-19 14:28:00
 */
public class AlipayCloudCloudbaseLayerVersionUploadModel extends AlipayObject {

	private static final long serialVersionUID = 2142689243452639973L;

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
	 * 版本描述
	 */
	@ApiField("version_description")
	private String versionDescription;

	/**
	 * 镜像列表
	 */
	@ApiListField("version_image_list")
	@ApiField("string")
	private List<String> versionImageList;

	/**
	 * 版本名称
	 */
	@ApiField("version_name")
	private String versionName;

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

	public String getVersionDescription() {
		return this.versionDescription;
	}
	public void setVersionDescription(String versionDescription) {
		this.versionDescription = versionDescription;
	}

	public List<String> getVersionImageList() {
		return this.versionImageList;
	}
	public void setVersionImageList(List<String> versionImageList) {
		this.versionImageList = versionImageList;
	}

	public String getVersionName() {
		return this.versionName;
	}
	public void setVersionName(String versionName) {
		this.versionName = versionName;
	}

}
