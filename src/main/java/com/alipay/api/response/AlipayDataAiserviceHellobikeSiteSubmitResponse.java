package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CloudbusCommonResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.aiservice.hellobike.site.submit response.
 * 
 * @author auto create
 * @since 1.0, 2020-04-22 15:31:13
 */
public class AlipayDataAiserviceHellobikeSiteSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 2524611396382621783L;

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
