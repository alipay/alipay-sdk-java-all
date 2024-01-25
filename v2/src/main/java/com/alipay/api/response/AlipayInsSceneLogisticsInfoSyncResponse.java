package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.logistics.info.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-01-09 12:18:37
 */
public class AlipayInsSceneLogisticsInfoSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6478424164391911699L;

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
