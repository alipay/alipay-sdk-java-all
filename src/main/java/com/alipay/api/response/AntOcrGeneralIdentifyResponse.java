package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.ocr.general.identify response.
 * 
 * @author auto create
 * @since 1.0, 2020-02-07 11:29:39
 */
public class AntOcrGeneralIdentifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7816861888813284256L;

	/** 
	 * 识别结果
	 */
	@ApiField("result")
	private String result;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
