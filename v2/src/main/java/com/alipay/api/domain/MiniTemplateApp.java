package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小程序模板应用
 *
 * @author auto create
 * @since 1.0, 2023-05-26 18:03:10
 */
public class MiniTemplateApp extends AlipayObject {

	private static final long serialVersionUID = 4811635176926727763L;

	/**
	 * 小程序模板应用名称
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 应用创建时间
	 */
	@ApiField("date_create")
	private String dateCreate;

	/**
	 * 小程序logo图标
	 */
	@ApiField("logo_url")
	private String logoUrl;

	/**
	 * 小程序id
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 模板版本列表
	 */
	@ApiListField("version_list")
	@ApiField("mini_template_version_info")
	private List<MiniTemplateVersionInfo> versionList;

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getDateCreate() {
		return this.dateCreate;
	}
	public void setDateCreate(String dateCreate) {
		this.dateCreate = dateCreate;
	}

	public String getLogoUrl() {
		return this.logoUrl;
	}
	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public List<MiniTemplateVersionInfo> getVersionList() {
		return this.versionList;
	}
	public void setVersionList(List<MiniTemplateVersionInfo> versionList) {
		this.versionList = versionList;
	}

}
