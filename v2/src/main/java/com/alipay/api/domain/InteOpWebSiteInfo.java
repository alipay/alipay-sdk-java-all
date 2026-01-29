package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 一体化作业商户网站信息
 *
 * @author auto create
 * @since 1.0, 2026-01-09 18:33:09
 */
public class InteOpWebSiteInfo extends AlipayObject {

	private static final long serialVersionUID = 4245844442764119789L;

	/**
	 * 网站首页截图，最小5KB，最大5M，图片格式必须为：png、bmp、gif、jpg、jpeg。传入alipay.open.file.upload接口上传图片获取的file_id。
	 */
	@ApiField("web_home_screenshot")
	private String webHomeScreenshot;

	/**
	 * 网站商品页截图，最小5KB，最大5M，图片格式必须为：png、bmp、gif、jpg、jpeg。传入 alipay.open.file.upload接口上传图片获取的file_id。
	 */
	@ApiField("web_item_screenshot")
	private String webItemScreenshot;

	/**
	 * 网站支付页截图，最小5KB，最大5M，图片格式必须为：png、bmp、gif、jpg、jpeg。传入alipay.open.file.upload接口上传图片获取的file_id。
	 */
	@ApiField("web_pay_screenshot")
	private String webPayScreenshot;

	/**
	 * 接入网址信息。
	 */
	@ApiField("web_sites")
	private String webSites;

	/**
	 * 接入网址的授权涵，格式为.doc .docx .pdf格式。传入alipay.open.file.upload接口上传获取的file_id。
	 */
	@ApiField("web_sites_loa")
	private String webSitesLoa;

	/**
	 * 网站状态
	 */
	@ApiField("web_status")
	private String webStatus;

	/**
	 * 网站测试账号。
	 */
	@ApiField("web_test_account")
	private String webTestAccount;

	/**
	 * 可以登录网站的测试账户的密码
	 */
	@ApiField("web_test_account_password")
	private String webTestAccountPassword;

	public String getWebHomeScreenshot() {
		return this.webHomeScreenshot;
	}
	public void setWebHomeScreenshot(String webHomeScreenshot) {
		this.webHomeScreenshot = webHomeScreenshot;
	}

	public String getWebItemScreenshot() {
		return this.webItemScreenshot;
	}
	public void setWebItemScreenshot(String webItemScreenshot) {
		this.webItemScreenshot = webItemScreenshot;
	}

	public String getWebPayScreenshot() {
		return this.webPayScreenshot;
	}
	public void setWebPayScreenshot(String webPayScreenshot) {
		this.webPayScreenshot = webPayScreenshot;
	}

	public String getWebSites() {
		return this.webSites;
	}
	public void setWebSites(String webSites) {
		this.webSites = webSites;
	}

	public String getWebSitesLoa() {
		return this.webSitesLoa;
	}
	public void setWebSitesLoa(String webSitesLoa) {
		this.webSitesLoa = webSitesLoa;
	}

	public String getWebStatus() {
		return this.webStatus;
	}
	public void setWebStatus(String webStatus) {
		this.webStatus = webStatus;
	}

	public String getWebTestAccount() {
		return this.webTestAccount;
	}
	public void setWebTestAccount(String webTestAccount) {
		this.webTestAccount = webTestAccount;
	}

	public String getWebTestAccountPassword() {
		return this.webTestAccountPassword;
	}
	public void setWebTestAccountPassword(String webTestAccountPassword) {
		this.webTestAccountPassword = webTestAccountPassword;
	}

}
