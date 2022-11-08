package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 卡等级配置模型
 *
 * @author auto create
 * @since 1.0, 2022-10-21 14:18:33
 */
public class CardLevelConfigDTO extends AlipayObject {

	private static final long serialVersionUID = 8132823134611375769L;

	/**
	 * background_url：在支付宝卡包展示的背景图片地址，通过alipay.offline.material.image.upload接口上传图片资源获取(https://opendocs.alipay.com/open/02qth8)
	 */
	@ApiField("background_url")
	private String backgroundUrl;

	/**
	 * banner_image_url：在支付宝卡包展示的banner图片地址，url通过alipay.offline.material.image.upload接口上传图片资源获取(https://opendocs.alipay.com/open/02qth8)
	 */
	@ApiField("banner_image_url")
	private String bannerImageUrl;

	/**
	 * banner_url：用户在支付宝卡包，店家卡banner后的跳转服务地址
	 */
	@ApiField("banner_url")
	private String bannerUrl;

	/**
	 * level：卡等级名称
	 */
	@ApiField("level")
	private String level;

	/**
	 * logo_url：在支付宝卡包展示的logo地址，通过alipay.offline.material.image.upload接口上传图片资源获取(https://opendocs.alipay.com/open/02qth8)
	 */
	@ApiField("logo_url")
	private String logoUrl;

	/**
	 * quick_services：卡的快捷服务，快捷服务数量限制为[1,3]
	 */
	@ApiListField("quick_services")
	@ApiField("card_quick_service_d_t_o")
	private List<CardQuickServiceDTO> quickServices;

	/**
	 * sub_title:在支付宝卡包中展示的卡副标题
	 */
	@ApiField("sub_title")
	private String subTitle;

	/**
	 * title:在支付宝卡包中展示的卡名称
	 */
	@ApiField("title")
	private String title;

	public String getBackgroundUrl() {
		return this.backgroundUrl;
	}
	public void setBackgroundUrl(String backgroundUrl) {
		this.backgroundUrl = backgroundUrl;
	}

	public String getBannerImageUrl() {
		return this.bannerImageUrl;
	}
	public void setBannerImageUrl(String bannerImageUrl) {
		this.bannerImageUrl = bannerImageUrl;
	}

	public String getBannerUrl() {
		return this.bannerUrl;
	}
	public void setBannerUrl(String bannerUrl) {
		this.bannerUrl = bannerUrl;
	}

	public String getLevel() {
		return this.level;
	}
	public void setLevel(String level) {
		this.level = level;
	}

	public String getLogoUrl() {
		return this.logoUrl;
	}
	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	public List<CardQuickServiceDTO> getQuickServices() {
		return this.quickServices;
	}
	public void setQuickServices(List<CardQuickServiceDTO> quickServices) {
		this.quickServices = quickServices;
	}

	public String getSubTitle() {
		return this.subTitle;
	}
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
