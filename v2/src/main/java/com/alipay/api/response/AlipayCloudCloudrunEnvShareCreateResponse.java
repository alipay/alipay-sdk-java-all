package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudrun.env.share.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-13 17:31:55
 */
public class AlipayCloudCloudrunEnvShareCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6145458657914364424L;

	/** 
	 * 对响应结果的描述
	 */
	@ApiField("result_msg")
	private String resultMsg;

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	public String getResultMsg( ) {
		return this.resultMsg;
	}

}
