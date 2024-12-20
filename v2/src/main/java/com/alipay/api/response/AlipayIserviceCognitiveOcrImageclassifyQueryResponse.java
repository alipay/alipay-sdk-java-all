package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.cognitive.ocr.imageclassify.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-27 11:25:12
 */
public class AlipayIserviceCognitiveOcrImageclassifyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6624714762347685795L;

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
