package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 身份证信息识别
 *
 * @author auto create
 * @since 1.0, 2019-03-20 20:23:39
 */
public class AlipayIserviceCognitiveOcrIdcardQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6332482258898881555L;

	/**
	 * 身份证图片base64编码内容
	 */
	@ApiField("image_content")
	private String imageContent;

	/**
	 * face: 身份证正面
back: 身份证反面
缺省值是：face
	 */
	@ApiField("side")
	private String side;

	public String getImageContent() {
		return this.imageContent;
	}
	public void setImageContent(String imageContent) {
		this.imageContent = imageContent;
	}

	public String getSide() {
		return this.side;
	}
	public void setSide(String side) {
		this.side = side;
	}

}
