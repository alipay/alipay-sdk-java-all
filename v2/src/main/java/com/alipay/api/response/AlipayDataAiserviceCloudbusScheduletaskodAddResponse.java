package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CloudbusCommonResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.aiservice.cloudbus.scheduletaskod.add response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 14:57:42
 */
public class AlipayDataAiserviceCloudbusScheduletaskodAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 3669474178438391688L;

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
