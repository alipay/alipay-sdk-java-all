package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 模板样式信息
 *
 * @author auto create
 * @since 1.0, 2018-11-29 16:33:02
 */
public class ViewStyleInfoModel extends AlipayObject {

	private static final long serialVersionUID = 1757944872121731577L;

	/**
	 * 背景色
	 */
	@ApiField("bg_color")
	private String bgColor;

	/**
	 * 背景图片Id，通过接口（alipay.offline.material.image.upload）上传图片 
图片说明：2M以内，格式：bmp、png、jpeg、jpg、gif； 
尺寸不小于1020*643px； 
图片不得有圆角，不得拉伸变形
	 */
	@ApiField("bg_img")
	private String bgImg;

	/**
	 * 品牌商名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * logo的图片ID，通过接口（alipay.offline.material.image.upload）上传图片 
图片说明：1M以内，格式bmp、png、jpeg、jpg、gif； 
尺寸不小于500*500px的正方形； 
请优先使用商家LOGO；
	 */
	@ApiField("logo_img")
	private String logoImg;

	public String getBgColor() {
		return this.bgColor;
	}
	public void setBgColor(String bgColor) {
		this.bgColor = bgColor;
	}

	public String getBgImg() {
		return this.bgImg;
	}
	public void setBgImg(String bgImg) {
		this.bgImg = bgImg;
	}

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getLogoImg() {
		return this.logoImg;
	}
	public void setLogoImg(String logoImg) {
		this.logoImg = logoImg;
	}

}
