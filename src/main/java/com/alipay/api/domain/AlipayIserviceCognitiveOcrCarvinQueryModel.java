package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * OCR服务：识别车辆Vin码服务
 *
 * @author auto create
 * @since 1.0, 2018-05-04 22:38:18
 */
public class AlipayIserviceCognitiveOcrCarvinQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1634625268683158234L;

	/**
	 * 汽车VIN 图片base64 encode内容
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
