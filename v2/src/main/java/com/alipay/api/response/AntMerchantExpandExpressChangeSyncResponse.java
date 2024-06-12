package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AssetResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.express.change.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-23 19:40:50
 */
public class AntMerchantExpandExpressChangeSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 1165633411248312993L;

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
