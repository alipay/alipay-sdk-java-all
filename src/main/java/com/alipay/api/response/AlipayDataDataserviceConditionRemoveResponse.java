package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.condition.remove response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayDataDataserviceConditionRemoveResponse extends AlipayResponse {

	private static final long serialVersionUID = 5536521224115231732L;

	/** 
	 * 返回结果，删除成功返回SUCCESS，删除失败返回FAILED
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
