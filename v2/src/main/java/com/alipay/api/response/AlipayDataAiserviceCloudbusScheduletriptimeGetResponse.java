package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ScheduleTripResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.aiservice.cloudbus.scheduletriptime.get response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-27 13:26:24
 */
public class AlipayDataAiserviceCloudbusScheduletriptimeGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 6328271122952523969L;

	/** 
	 * 结果
	 */
	@ApiField("result")
	private ScheduleTripResult result;

	public void setResult(ScheduleTripResult result) {
		this.result = result;
	}
	public ScheduleTripResult getResult( ) {
		return this.result;
	}

}
