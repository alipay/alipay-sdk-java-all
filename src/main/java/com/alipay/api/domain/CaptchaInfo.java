package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 图片验证码信息
 *
 * @author auto create
 * @since 1.0, 2017-11-02 20:44:31
 */
public class CaptchaInfo extends AlipayObject {

	private static final long serialVersionUID = 8128564674178267791L;

	/**
	 * 图片特殊描述信息
	 */
	@ApiField("captcha_desc")
	private String captchaDesc;

	/**
	 * 图片内容，base64编码
	 */
	@ApiField("image_content")
	private String imageContent;

	/**
	 * 图片类型，jpeg|bmp
	 */
	@ApiField("image_type")
	private String imageType;

	public String getCaptchaDesc() {
		return this.captchaDesc;
	}
	public void setCaptchaDesc(String captchaDesc) {
		this.captchaDesc = captchaDesc;
	}

	public String getImageContent() {
		return this.imageContent;
	}
	public void setImageContent(String imageContent) {
		this.imageContent = imageContent;
	}

	public String getImageType() {
		return this.imageType;
	}
	public void setImageType(String imageType) {
		this.imageType = imageType;
	}

}
