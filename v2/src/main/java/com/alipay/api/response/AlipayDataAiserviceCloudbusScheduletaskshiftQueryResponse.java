package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ScheduleShiftResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.aiservice.cloudbus.scheduletaskshift.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 06:05:50
 */
public class AlipayDataAiserviceCloudbusScheduletaskshiftQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1256185217856185382L;

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
