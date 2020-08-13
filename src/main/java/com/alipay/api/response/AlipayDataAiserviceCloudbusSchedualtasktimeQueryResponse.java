package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ScheduleTimeResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.aiservice.cloudbus.schedualtasktime.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-03-02 15:55:07
 */
public class AlipayDataAiserviceCloudbusSchedualtasktimeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4416814579929449939L;

	/** 
	 * 结果
	 */
	@ApiField("result")
	private ScheduleTimeResult result;

	public void setResult(ScheduleTimeResult result) {
		this.result = result;
	}
	public ScheduleTimeResult getResult( ) {
		return this.result;
	}

}
