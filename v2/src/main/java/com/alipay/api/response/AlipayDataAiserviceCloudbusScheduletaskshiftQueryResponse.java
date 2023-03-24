package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ScheduleShiftResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.aiservice.cloudbus.scheduletaskshift.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-12 18:32:06
 */
public class AlipayDataAiserviceCloudbusScheduletaskshiftQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5519752134756658321L;

	/** 
	 * 结果
	 */
	@ApiField("result")
	private ScheduleShiftResult result;

	public void setResult(ScheduleShiftResult result) {
		this.result = result;
	}
	public ScheduleShiftResult getResult( ) {
		return this.result;
	}

}
