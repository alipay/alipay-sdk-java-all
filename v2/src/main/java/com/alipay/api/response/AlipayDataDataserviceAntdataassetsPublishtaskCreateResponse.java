package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.antdataassets.publishtask.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-03 23:03:30
 */
public class AlipayDataDataserviceAntdataassetsPublishtaskCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7195615896793433869L;

	/** 
	 * 发布D2任务是否成功
	 */
	@ApiField("result")
	private Boolean result;

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

}
