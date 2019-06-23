package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户站点信息，包括网站、app、小程序。商户使用服务包含电脑支付或wap支付时，必须填充一个类型为01(网站)的SiteInfo对象；当包含app支付时，必须至少填充类型为02(APP)或06(支付宝小程序)中一种类型的SiteInfo对象
 *
 * @author auto create
 * @since 1.0, 2018-12-13 16:57:26
 */
public class SiteInfoKt extends AlipayObject {

	private static final long serialVersionUID = 8336474364629483318L;

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
	 * 网站：01&#160;&#8232;APP : 02&#160;&#8232;服务窗:03&#160;&#8232;公众号:04&#160;&#8232;其他:05&#160;&#8232;支付宝小程序:06
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
