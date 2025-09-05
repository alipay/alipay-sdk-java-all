package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AssetResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.attachment.upload.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-24 21:31:11
 */
public class AntMerchantExpandAttachmentUploadSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 1544673274236582918L;

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
