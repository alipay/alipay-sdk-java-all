package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.innerversion.instantiation.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-11 19:11:11
 */
public class AlipayOpenMiniInnerversionInstantiationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4866217319926481597L;

	/** 
	 * 小程序版本号
	 */
	@ApiField("app_version")
	private String appVersion;

	/** 
	 * 端id
	 */
	@ApiField("bundle_id")
	private String bundleId;

	/** 
	 * 小程序appId
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/** 
	 * 模板id
	 */
	@ApiField("template_id")
	private String templateId;

	/** 
	 * 模板的版本号
	 */
	@ApiField("template_version")
	private String templateVersion;

	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}
	public String getAppVersion( ) {
		return this.appVersion;
	}

	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
	}
	public String getBundleId( ) {
		return this.bundleId;
	}

	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}
	public String getMiniAppId( ) {
		return this.miniAppId;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}
	public String getTemplateId( ) {
		return this.templateId;
	}

	public void setTemplateVersion(String templateVersion) {
		this.templateVersion = templateVersion;
	}
	public String getTemplateVersion( ) {
		return this.templateVersion;
	}

}
