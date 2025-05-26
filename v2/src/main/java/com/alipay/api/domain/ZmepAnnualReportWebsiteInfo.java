package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业工商年报网站信息
 *
 * @author auto create
 * @since 1.0, 2025-01-20 11:20:25
 */
public class ZmepAnnualReportWebsiteInfo extends AlipayObject {

	private static final long serialVersionUID = 6731733579861767317L;

	/**
	 * 名称
	 */
	@ApiField("website_name")
	private String websiteName;

	/**
	 * 网站类型
	 */
	@ApiField("website_type")
	private String websiteType;

	/**
	 * 网址
	 */
	@ApiField("website_url")
	private String websiteUrl;

	public String getWebsiteName() {
		return this.websiteName;
	}
	public void setWebsiteName(String websiteName) {
		this.websiteName = websiteName;
	}

	public String getWebsiteType() {
		return this.websiteType;
	}
	public void setWebsiteType(String websiteType) {
		this.websiteType = websiteType;
	}

	public String getWebsiteUrl() {
		return this.websiteUrl;
	}
	public void setWebsiteUrl(String websiteUrl) {
		this.websiteUrl = websiteUrl;
	}

}
