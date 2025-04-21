package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 模版底部横幅信息
 *
 * @author auto create
 * @since 1.0, 2023-06-25 15:17:19
 */
public class TemplateBannerDTO extends AlipayObject {

	private static final long serialVersionUID = 2884854393825121375L;

	/**
	 * 横幅图片ID，通过接口（alipay.offline.material.image.upload）上传图片获得图片ID。图片需在1M以内，支持bmp、png、jpeg、jpg、gif格式，建议使用710*200px的图片。支持以 $动态参数$ 形式的自定义动态参数传值。
	 */
	@ApiField("banner_img")
	private String bannerImg;

	/**
	 * 横幅区域点击跳转链接，需要带上http、https、alipays等协议头。支持以 $动态参数$ 形式的自定义动态参数传值。
	 */
	@ApiField("banner_url")
	private String bannerUrl;

	public String getBannerImg() {
		return this.bannerImg;
	}
	public void setBannerImg(String bannerImg) {
		this.bannerImg = bannerImg;
	}

	public String getBannerUrl() {
		return this.bannerUrl;
	}
	public void setBannerUrl(String bannerUrl) {
		this.bannerUrl = bannerUrl;
	}

}
