package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票内容识别
 *
 * @author auto create
 * @since 1.0, 2018-05-21 18:03:48
 */
public class AlipayIserviceCognitiveBillInferenceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3436383726833898496L;

	/**
	 * 图片大小
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
