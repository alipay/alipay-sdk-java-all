package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AlipayDataServiceResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.service.open.analyze response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayDataServiceOpenAnalyzeResponse extends AlipayResponse {

	private static final long serialVersionUID = 6839268121799122376L;

	/** 
	 * 调用返回
	 */
	@ApiField("result")
	private AlipayDataServiceResult result;

	public void setResult(AlipayDataServiceResult result) {
		this.result = result;
	}
	public AlipayDataServiceResult getResult( ) {
		return this.result;
	}

}
