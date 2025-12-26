package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.largermodel.resource.upload response.
 * 
 * @author auto create
 * @since 1.0, 2025-02-13 11:22:27
 */
public class AlipayCommerceMedicalLargermodelResourceUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 1189595562653941465L;

	/** 
	 * 图片或文件存储在afts的标识
	 */
	@ApiField("image_id")
	private String imageId;

	public void setImageId(String imageId) {
		this.imageId = imageId;
	}
	public String getImageId( ) {
		return this.imageId;
	}

}
