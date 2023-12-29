package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.mbpcard.file.upload response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-24 10:04:51
 */
public class AlipayFundMbpcardFileUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 6635655996785582395L;

	/** 
	 * 影像文件存储平台的标识
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
