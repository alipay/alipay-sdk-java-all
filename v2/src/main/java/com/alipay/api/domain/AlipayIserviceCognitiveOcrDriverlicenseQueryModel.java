package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 驾驶证信息识别
 *
 * @author auto create
 * @since 1.0, 2019-04-26 12:38:15
 */
public class AlipayIserviceCognitiveOcrDriverlicenseQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6734612859763614336L;

	/**
	 * 驾驶证图片base64加密后内容，大小控制在1.5M以内
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
