package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票内容识别
 *
 * @author auto create
 * @since 1.0, 2019-04-26 12:38:59
 */
public class AlipayIserviceCognitiveBillInferenceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3742174921961674762L;

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
