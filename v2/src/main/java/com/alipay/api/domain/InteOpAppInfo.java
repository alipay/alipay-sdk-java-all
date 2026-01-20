package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 一体化作业商户APP信息
 *
 * @author auto create
 * @since 1.0, 2026-01-09 18:33:09
 */
public class InteOpAppInfo extends AlipayObject {

	private static final long serialVersionUID = 5397381178311749427L;

	/**
	 * APP授权函图片，最小5KB，最大5M，图片格式必须为：png、bmp、gif、jpg、jpeg。
传入 alipay.open.file.upload接口上传图片获取的file_id。
	 */
	@ApiField("app_auth_pic")
	private String appAuthPic;

	/**
	 * 应用下载链接。
	 */
	@ApiField("app_download_link")
	private String appDownloadLink;

	/**
	 * 应用首页截图，最小5KB，最大5M，图片格式必须为：png、bmp、gif、jpg、jpeg。传入alipay.open.file.upload接口上传图片获取的file_id。
	 */
	@ApiField("app_home_screenshot")
	private String appHomeScreenshot;

	/**
	 * 商品或服务页截图，最小5KB，最大5M，图片格式必须为：png、bmp、gif、jpg、jpeg。
传入alipay.open.file.upload接口上传图片获取的file_id。
	 */
	@ApiField("app_item_screenshot")
	private String appItemScreenshot;

	/**
	 * 【枚举值】
● 苹果: 苹果
● 应用宝: 应用宝
● 华为: 华为
● 360: 360
● 小米: 小米
● 豌豆荚: 豌豆荚
● 其他: 其他
	 */
	@ApiListField("app_market")
	@ApiField("string")
	private List<String> appMarket;

	/**
	 * 商户的APP应用名称。
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 应用内支付页截图，最小5KB，最大5M，图片格式必须为：png、bmp、gif、jpg、jpeg。传入alipay.open.file.upload接口上传图片获取的file_id。
	 */
	@ApiField("app_pay_screenshot")
	private String appPayScreenshot;

	/**
	 * 应用状态。
枚举值：
● 已上架: ONLINE
● 未上架: OFFLINE
	 */
	@ApiField("app_status")
	private String appStatus;

	/**
	 * 应用测试账号。
	 */
	@ApiField("app_test_account")
	private String appTestAccount;

	/**
	 * 应用测试账号密码。
	 */
	@ApiField("app_test_account_password")
	private String appTestAccountPassword;

	/**
	 * 应用类型(IOS/Android)。
	 */
	@ApiField("app_type")
	private String appType;

	/**
	 * 应用内截图，最小5KB，最大5M，图片格式必须为：png、bmp、gif、jpg、jpeg。传入 alipay.open.file.upload接口上传图片获取的file_id。
	 */
	@ApiField("in_app_screenshot")
	private String inAppScreenshot;

	public String getAppAuthPic() {
		return this.appAuthPic;
	}
	public void setAppAuthPic(String appAuthPic) {
		this.appAuthPic = appAuthPic;
	}

	public String getAppDownloadLink() {
		return this.appDownloadLink;
	}
	public void setAppDownloadLink(String appDownloadLink) {
		this.appDownloadLink = appDownloadLink;
	}

	public String getAppHomeScreenshot() {
		return this.appHomeScreenshot;
	}
	public void setAppHomeScreenshot(String appHomeScreenshot) {
		this.appHomeScreenshot = appHomeScreenshot;
	}

	public String getAppItemScreenshot() {
		return this.appItemScreenshot;
	}
	public void setAppItemScreenshot(String appItemScreenshot) {
		this.appItemScreenshot = appItemScreenshot;
	}

	public List<String> getAppMarket() {
		return this.appMarket;
	}
	public void setAppMarket(List<String> appMarket) {
		this.appMarket = appMarket;
	}

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getAppPayScreenshot() {
		return this.appPayScreenshot;
	}
	public void setAppPayScreenshot(String appPayScreenshot) {
		this.appPayScreenshot = appPayScreenshot;
	}

	public String getAppStatus() {
		return this.appStatus;
	}
	public void setAppStatus(String appStatus) {
		this.appStatus = appStatus;
	}

	public String getAppTestAccount() {
		return this.appTestAccount;
	}
	public void setAppTestAccount(String appTestAccount) {
		this.appTestAccount = appTestAccount;
	}

	public String getAppTestAccountPassword() {
		return this.appTestAccountPassword;
	}
	public void setAppTestAccountPassword(String appTestAccountPassword) {
		this.appTestAccountPassword = appTestAccountPassword;
	}

	public String getAppType() {
		return this.appType;
	}
	public void setAppType(String appType) {
		this.appType = appType;
	}

	public String getInAppScreenshot() {
		return this.inAppScreenshot;
	}
	public void setInAppScreenshot(String inAppScreenshot) {
		this.inAppScreenshot = inAppScreenshot;
	}

}
