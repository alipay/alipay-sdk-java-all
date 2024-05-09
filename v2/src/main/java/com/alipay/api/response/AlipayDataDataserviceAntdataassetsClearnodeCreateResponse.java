package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.antdataassets.clearnode.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-23 20:53:21
 */
public class AlipayDataDataserviceAntdataassetsClearnodeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4543274595955869127L;

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
