package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.cognitive.ocr.imageclassify.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 15:42:42
 */
public class AlipayIserviceCognitiveOcrImageclassifyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6379414433123654629L;

	/** 
	 * 图像分类类型
	 */
	@ApiField("image_type")
	private String imageType;

	public void setImageType(String imageType) {
		this.imageType = imageType;
	}
	public String getImageType( ) {
		return this.imageType;
	}

}
