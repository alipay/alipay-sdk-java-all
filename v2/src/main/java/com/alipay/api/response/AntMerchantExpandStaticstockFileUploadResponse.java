package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AssetResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.staticstock.file.upload response.
 * 
 * @author auto create
 * @since 1.0, 2024-01-04 20:01:58
 */
public class AntMerchantExpandStaticstockFileUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 2585554531588343126L;

	/** 
	 * 上传结果
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
