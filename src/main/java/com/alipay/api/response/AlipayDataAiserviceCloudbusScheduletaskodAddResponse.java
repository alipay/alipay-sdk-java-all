package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CloudbusCommonResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.aiservice.cloudbus.scheduletaskod.add response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 05:40:15
 */
public class AlipayDataAiserviceCloudbusScheduletaskodAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 6713445636563264578L;

	/** 
	 * 任务结果
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
