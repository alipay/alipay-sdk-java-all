package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 站点信息
 *
 * @author auto create
 * @since 1.0, 2025-11-17 21:41:05
 */
public class SolutionSiteInfo extends AlipayObject {

	private static final long serialVersionUID = 2251292136359588781L;

	/**
	 * 站点名称
	 */
	@ApiField("site_name")
	private String siteName;

	/**
	 * 站点类型
	 */
	@ApiField("site_type")
	private String siteType;

	/**
	 * 站点地址
	 */
	@ApiField("site_url")
	private String siteUrl;

	/**
	 * 小程序appId
	 */
	@ApiField("tiny_app_id")
	private String tinyAppId;

	public String getSiteName() {
		return this.siteName;
	}
	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}

	public String getSiteType() {
		return this.siteType;
	}
	public void setSiteType(String siteType) {
		this.siteType = siteType;
	}

	public String getSiteUrl() {
		return this.siteUrl;
	}
	public void setSiteUrl(String siteUrl) {
		this.siteUrl = siteUrl;
	}

	public String getTinyAppId() {
		return this.tinyAppId;
	}
	public void setTinyAppId(String tinyAppId) {
		this.tinyAppId = tinyAppId;
	}

}
