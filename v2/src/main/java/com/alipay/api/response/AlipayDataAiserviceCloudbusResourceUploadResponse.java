package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CloudbusCommonResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.aiservice.cloudbus.resource.upload response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 19:16:05
 */
public class AlipayDataAiserviceCloudbusResourceUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 3271872944111691297L;

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
