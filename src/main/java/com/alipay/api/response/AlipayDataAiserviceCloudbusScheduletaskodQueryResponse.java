package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ScheduleOdResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.aiservice.cloudbus.scheduletaskod.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-10-21 10:35:15
 */
public class AlipayDataAiserviceCloudbusScheduletaskodQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5173991357117159762L;

	/** 
	 * 结果
	 */
	@ApiField("result")
	private ScheduleOdResult result;

	public void setResult(ScheduleOdResult result) {
		this.result = result;
	}
	public ScheduleOdResult getResult( ) {
		return this.result;
	}

}
