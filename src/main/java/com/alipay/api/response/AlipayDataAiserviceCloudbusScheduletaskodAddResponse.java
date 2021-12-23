package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CloudbusCommonResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.aiservice.cloudbus.scheduletaskod.add response.
 * 
 * @author auto create
 * @since 1.0, 2020-10-21 10:35:41
 */
public class AlipayDataAiserviceCloudbusScheduletaskodAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 1657474232949585923L;

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
