package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ScheduleShiftResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.aiservice.cloudbus.scheduletaskshift.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-10-21 10:37:03
 */
public class AlipayDataAiserviceCloudbusScheduletaskshiftQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6562784576987274844L;

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
