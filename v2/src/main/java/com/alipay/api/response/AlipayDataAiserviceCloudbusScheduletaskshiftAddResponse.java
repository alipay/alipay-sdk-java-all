package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CloudbusCommonResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.aiservice.cloudbus.scheduletaskshift.add response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 02:18:12
 */
public class AlipayDataAiserviceCloudbusScheduletaskshiftAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 5121856241774566592L;

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
