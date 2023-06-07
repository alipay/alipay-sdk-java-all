package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AssetResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.attachment.upload.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 04:49:09
 */
public class AntMerchantExpandAttachmentUploadSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 8851767532444973217L;

	/** 
	 * 响应结果
	 */
	@ApiField("upload_result")
	private AssetResult uploadResult;

	public void setUploadResult(AssetResult uploadResult) {
		this.uploadResult = uploadResult;
	}
	public AssetResult getUploadResult( ) {
		return this.uploadResult;
	}

}
