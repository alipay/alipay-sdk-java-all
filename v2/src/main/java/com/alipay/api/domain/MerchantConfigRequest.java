package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签署平台的商户配置信息
 *
 * @author auto create
 * @since 1.0, 2020-06-04 13:58:07
 */
public class MerchantConfigRequest extends AlipayObject {

	private static final long serialVersionUID = 5677993314195368261L;

	/**
	 * 详情页banner跳转目标小程序appid
	 */
	@ApiField("banner_app_id")
	private String bannerAppId;

	/**
	 * 详情页banner图片url
	 */
	@ApiField("banner_image_url")
	private String bannerImageUrl;

	/**
	 * 详情页banner跳转所需参数
	 */
	@ApiField("banner_page")
	private String bannerPage;

	/**
	 * 详情页banner跳转地址
	 */
	@ApiField("banner_web_url")
	private String bannerWebUrl;

	/**
	 * 目标小程序appid
	 */
	@ApiField("jump_app_id")
	private String jumpAppId;

	/**
	 * 跳转所需参数
	 */
	@ApiField("jump_page")
	private String jumpPage;

	/**
	 * 跳转地址
	 */
	@ApiField("jump_web_url")
	private String jumpWebUrl;

	/**
	 * 商家联系方式
	 */
	@ApiField("merchant_contact")
	private String merchantContact;

	/**
	 * 签署平台为商家分配的应用Id
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 商家logo
	 */
	@ApiField("merchant_logo")
	private String merchantLogo;

	/**
	 * 商家名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	public String getBannerAppId() {
		return this.bannerAppId;
	}
	public void setBannerAppId(String bannerAppId) {
		this.bannerAppId = bannerAppId;
	}

	public String getBannerImageUrl() {
		return this.bannerImageUrl;
	}
	public void setBannerImageUrl(String bannerImageUrl) {
		this.bannerImageUrl = bannerImageUrl;
	}

	public String getBannerPage() {
		return this.bannerPage;
	}
	public void setBannerPage(String bannerPage) {
		this.bannerPage = bannerPage;
	}

	public String getBannerWebUrl() {
		return this.bannerWebUrl;
	}
	public void setBannerWebUrl(String bannerWebUrl) {
		this.bannerWebUrl = bannerWebUrl;
	}

	public String getJumpAppId() {
		return this.jumpAppId;
	}
	public void setJumpAppId(String jumpAppId) {
		this.jumpAppId = jumpAppId;
	}

	public String getJumpPage() {
		return this.jumpPage;
	}
	public void setJumpPage(String jumpPage) {
		this.jumpPage = jumpPage;
	}

	public String getJumpWebUrl() {
		return this.jumpWebUrl;
	}
	public void setJumpWebUrl(String jumpWebUrl) {
		this.jumpWebUrl = jumpWebUrl;
	}

	public String getMerchantContact() {
		return this.merchantContact;
	}
	public void setMerchantContact(String merchantContact) {
		this.merchantContact = merchantContact;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getMerchantLogo() {
		return this.merchantLogo;
	}
	public void setMerchantLogo(String merchantLogo) {
		this.merchantLogo = merchantLogo;
	}

	public String getMerchantName() {
		return this.merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

}
