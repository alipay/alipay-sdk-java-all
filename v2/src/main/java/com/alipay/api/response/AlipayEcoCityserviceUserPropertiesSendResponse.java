package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.cityservice.user.properties.send response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 08:17:16
 */
public class AlipayEcoCityserviceUserPropertiesSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 4886598433911463484L;

	/** 
	 * 数据同步结果
	 */
	@ApiField("sync_result")
	private String syncResult;

	public void setSyncResult(String syncResult) {
		this.syncResult = syncResult;
	}
	public String getSyncResult( ) {
		return this.syncResult;
	}

}
