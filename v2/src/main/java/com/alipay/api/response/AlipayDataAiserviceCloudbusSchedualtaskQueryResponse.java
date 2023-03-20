package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ScheduleWorkResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.aiservice.cloudbus.schedualtask.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-12 18:30:48
 */
public class AlipayDataAiserviceCloudbusSchedualtaskQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8669527823951578881L;

	/** 
	 * 结果
	 */
	@ApiField("result")
	private ScheduleWorkResult result;

	public void setResult(ScheduleWorkResult result) {
		this.result = result;
	}
	public ScheduleWorkResult getResult( ) {
		return this.result;
	}

}
