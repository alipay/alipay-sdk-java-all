package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.logistics.info.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-26 16:51:24
 */
public class AlipayInsSceneLogisticsInfoSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6373265598543523477L;

	/** 
	 * 受理单号
	 */
	@ApiField("application_no")
	private String applicationNo;

	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}
	public String getApplicationNo( ) {
		return this.applicationNo;
	}

}
