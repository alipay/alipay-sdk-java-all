package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.antdataassets.clearnode.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 06:03:04
 */
public class AlipayDataDataserviceAntdataassetsClearnodeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2725387381396186561L;

	/** 
	 * 清除任务操作是否成功
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
