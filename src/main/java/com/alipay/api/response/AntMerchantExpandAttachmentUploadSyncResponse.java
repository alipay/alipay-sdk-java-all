package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AssetResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.attachment.upload.sync response.
 * 
 * @author auto create
 * @since 1.0, 2019-06-03 19:46:15
 */
public class AntMerchantExpandAttachmentUploadSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 7341945572338582256L;

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
