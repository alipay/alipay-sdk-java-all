package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 线上二级商户网站信息，包括网站名称、网址类型、网址URL等
 *
 * @author auto create
 * @since 1.0, 2021-10-25 15:24:42
 */
public class MerchantSiteInfo extends AlipayObject {

	private static final long serialVersionUID = 7665844726389825824L;

	/**
	 * 二级商户网站名称
	 */
	@ApiField("site_name")
	private String siteName;

	/**
	 * 二级商户网站类型
	 */
	@ApiField("site_type")
	private String siteType;

	/**
	 * 二级商户网址URL
	 */
	@ApiField("site_url")
	private String siteUrl;

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

}
