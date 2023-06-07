package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.iotdevice.onlinedata.upload response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 22:05:58
 */
public class AntMerchantExpandIotdeviceOnlinedataUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 7845741812364532157L;

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
