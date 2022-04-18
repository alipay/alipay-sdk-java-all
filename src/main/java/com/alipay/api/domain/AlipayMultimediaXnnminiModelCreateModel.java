package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * xnn小程序创建模型
 *
 * @author auto create
 * @since 1.0, 2020-11-19 16:07:10
 */
public class AlipayMultimediaXnnminiModelCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4884942984519128825L;

	/**
	 * 业务id
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 模型描述
	 */
	@ApiField("des")
	private String des;

	/**
	 * 模型校验参数信息
	 */
	@ApiField("license")
	private String license;

	/**
	 * 模型绑定应用id
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 模型名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 模型原始链接地址
	 */
	@ApiField("ori_url")
	private String oriUrl;

	/**
	 * 模型类型：XNN、TF_JS
	 */
	@ApiField("type")
	private String type;

	/**
	 * 模型创建用户
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 版本信息标识id
	 */
	@ApiField("version_id")
	private String versionId;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getDes() {
		return this.des;
	}
	public void setDes(String des) {
		this.des = des;
	}

	public String getLicense() {
		return this.license;
	}
	public void setLicense(String license) {
		this.license = license;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOriUrl() {
		return this.oriUrl;
	}
	public void setOriUrl(String oriUrl) {
		this.oriUrl = oriUrl;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getVersionId() {
		return this.versionId;
	}
	public void setVersionId(String versionId) {
		this.versionId = versionId;
	}

}
