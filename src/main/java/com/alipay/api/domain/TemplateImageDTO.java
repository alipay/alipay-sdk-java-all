package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 模版图片信息
 *
 * @author auto create
 * @since 1.0, 2020-09-03 15:40:24
 */
public class TemplateImageDTO extends AlipayObject {

	private static final long serialVersionUID = 5788128548425266491L;

	/**
	 * logo的图片ID，通过接口（alipay.offline.material.image.upload）上传图片获得图片ID。图片需在1M以内，支持bmp、png、jpeg、jpg、gif格式，尺寸不小于500*500px的正方形，请优先使用商家LOGO。支持以 $动态参数$ 形式的自定义动态参数传值。
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 背景图片ID，通过接口（alipay.offline.material.image.upload）上传图片获得图片ID。图片需在1M以内，支持bmp、png、jpeg、jpg、gif格式，尺寸不小于1020*643px，不得有圆角，不得拉伸变形。支持以 $动态参数$ 形式的自定义动态参数传值。
	 */
	@ApiField("strip")
	private String strip;

	public String getLogo() {
		return this.logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getStrip() {
		return this.strip;
	}
	public void setStrip(String strip) {
		this.strip = strip;
	}

}
