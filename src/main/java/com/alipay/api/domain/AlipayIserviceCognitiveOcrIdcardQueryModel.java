package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 身份证信息识别
 *
 * @author auto create
 * @since 1.0, 2018-05-09 12:20:19
 */
public class AlipayIserviceCognitiveOcrIdcardQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6546346534961291226L;

	/**
	 * 身份证图片base64编码内容
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
