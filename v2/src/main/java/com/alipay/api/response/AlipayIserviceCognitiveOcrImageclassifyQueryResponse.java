package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.cognitive.ocr.imageclassify.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 08:26:19
 */
public class AlipayIserviceCognitiveOcrImageclassifyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4458521439828412767L;

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
