package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营业执照信息识别
 *
 * @author auto create
 * @since 1.0, 2019-04-26 12:38:40
 */
public class AlipayIserviceCognitiveOcrBusinesslicenseQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6353743294641172231L;

	/**
	 * 营业执照图片base64加密后内容
	 */
	@ApiField("image_content")
	private String imageContent;

	public String getImageContent() {
		return this.imageContent;
	}
	public void setImageContent(String imageContent) {
		this.imageContent = imageContent;
	}

}
