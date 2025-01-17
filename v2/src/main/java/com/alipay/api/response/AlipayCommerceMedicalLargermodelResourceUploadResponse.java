package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.largermodel.resource.upload response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-23 11:12:10
 */
public class AlipayCommerceMedicalLargermodelResourceUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 4262675561946187737L;

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
