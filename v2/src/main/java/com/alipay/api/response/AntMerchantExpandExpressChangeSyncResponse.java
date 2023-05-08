package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AssetResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.express.change.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 19:35:06
 */
public class AntMerchantExpandExpressChangeSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 8614515159738249424L;

	/** 
	 * 响应参数
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
