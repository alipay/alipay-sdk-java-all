package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudrun.env.share.delete response.
 * 
 * @author auto create
 * @since 1.0, 2024-01-19 16:12:01
 */
public class AlipayCloudCloudrunEnvShareDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 8283573197457487584L;

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
