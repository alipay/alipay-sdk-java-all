package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 图样分类模型
 *
 * @author auto create
 * @since 1.0, 2018-07-03 12:02:05
 */
public class AlipayIserviceCognitiveOcrImageclassifyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1144875863874195592L;

	/**
	 * 图片base64加密后的内容，大小控制在1.5M
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
