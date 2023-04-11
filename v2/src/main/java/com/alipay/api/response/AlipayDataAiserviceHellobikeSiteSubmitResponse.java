package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CloudbusCommonResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.aiservice.hellobike.site.submit response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 11:57:22
 */
public class AlipayDataAiserviceHellobikeSiteSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 7124399938374428835L;

	/** 
	 * 结果
	 */
	@ApiField("result")
	private CloudbusCommonResult result;

	public void setResult(CloudbusCommonResult result) {
		this.result = result;
	}
	public CloudbusCommonResult getResult( ) {
		return this.result;
	}

}
