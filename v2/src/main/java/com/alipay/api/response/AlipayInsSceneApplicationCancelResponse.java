package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.application.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 18:22:17
 */
public class AlipayInsSceneApplicationCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 1656989961736537479L;

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
