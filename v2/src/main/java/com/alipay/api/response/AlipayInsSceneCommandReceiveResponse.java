package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.command.receive response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-05 11:34:46
 */
public class AlipayInsSceneCommandReceiveResponse extends AlipayResponse {

	private static final long serialVersionUID = 4865631992339831423L;

	/** 
	 * 执行结果JSON字符串
	 */
	@ApiField("result_object_string")
	private String resultObjectString;

	public void setResultObjectString(String resultObjectString) {
		this.resultObjectString = resultObjectString;
	}
	public String getResultObjectString( ) {
		return this.resultObjectString;
	}

}
