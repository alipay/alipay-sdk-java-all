package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.business.analysis.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-30 10:02:01
 */
public class AlipayDataDataserviceBusinessAnalysisCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4248723321375222136L;

	/** 
	 * 商圈分析任务ID，唯一
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
