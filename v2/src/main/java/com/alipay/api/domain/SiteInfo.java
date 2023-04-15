package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 站点信息
 *
 * @author auto create
 * @since 1.0, 2021-04-07 21:04:06
 */
public class SiteInfo extends AlipayObject {

	private static final long serialVersionUID = 8789572384594587819L;

	/**
	 * 测试账号
	 */
	@ApiField("account")
	private String account;

	/**
	 * 测试密码
	 */
	@ApiField("password")
	private String password;

	/**
	 * 站点名称
	 */
	@ApiField("site_name")
	private String siteName;

	/**
	 * 网站：01
APP  : 02
服务窗:03
公众号:04
其他:05
支付宝小程序:06
	 */
	@ApiField("site_type")
	private String siteType;

	/**
	 * 站点地址
	 */
	@ApiField("site_url")
	private String siteUrl;

	public String getAccount() {
		return this.account;
	}
	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return this.password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

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
