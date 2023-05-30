package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.application.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 21:28:22
 */
public class AlipayInsSceneApplicationCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 6336745988279779896L;

	/** 
	 * 投保订单号
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
