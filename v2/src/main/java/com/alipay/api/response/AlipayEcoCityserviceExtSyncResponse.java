package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.SyncDataResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.cityservice.ext.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 05:13:26
 */
public class AlipayEcoCityserviceExtSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2352263841933753575L;

	/** 
	 * 同步结果
	 */
	@ApiField("result")
	private SyncDataResult result;

	public void setResult(SyncDataResult result) {
		this.result = result;
	}
	public SyncDataResult getResult( ) {
		return this.result;
	}

}
