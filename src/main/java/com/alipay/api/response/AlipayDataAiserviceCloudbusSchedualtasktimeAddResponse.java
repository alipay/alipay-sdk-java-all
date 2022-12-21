package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CloudbusCommonResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.aiservice.cloudbus.schedualtasktime.add response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 07:42:09
 */
public class AlipayDataAiserviceCloudbusSchedualtasktimeAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 7724493689227627162L;

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
