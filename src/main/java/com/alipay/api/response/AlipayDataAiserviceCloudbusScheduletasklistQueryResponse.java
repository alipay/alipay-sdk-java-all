package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ScheduleListResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.aiservice.cloudbus.scheduletasklist.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-03-02 16:10:07
 */
public class AlipayDataAiserviceCloudbusScheduletasklistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4177985316658564773L;

	/** 
	 * 结果
	 */
	@ApiField("result")
	private ScheduleListResult result;

	public void setResult(ScheduleListResult result) {
		this.result = result;
	}
	public ScheduleListResult getResult( ) {
		return this.result;
	}

}
