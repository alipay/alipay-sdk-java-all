package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.finance.fund.image.upload response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-17 15:56:41
 */
public class AnttechBlockchainFinanceFundImageUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 2423327473958364592L;

	/** 
	 * 图片在文件存储平台的标识
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
