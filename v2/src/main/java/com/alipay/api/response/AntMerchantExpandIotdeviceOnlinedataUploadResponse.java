package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.iotdevice.onlinedata.upload response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 12:23:16
 */
public class AntMerchantExpandIotdeviceOnlinedataUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 6475713469198622943L;

	/** 
	 * 商户合作设备在线时间回传结果
	 */
	@ApiField("onlinedata_upload_result")
	private Boolean onlinedataUploadResult;

	public void setOnlinedataUploadResult(Boolean onlinedataUploadResult) {
		this.onlinedataUploadResult = onlinedataUploadResult;
	}
	public Boolean getOnlinedataUploadResult( ) {
		return this.onlinedataUploadResult;
	}

}
