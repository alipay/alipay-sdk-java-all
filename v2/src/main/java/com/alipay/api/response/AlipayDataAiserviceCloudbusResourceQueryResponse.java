package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ScheduleResResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.aiservice.cloudbus.resource.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 14:57:44
 */
public class AlipayDataAiserviceCloudbusResourceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6213655484644745328L;

	/** 
	 * 结果
	 */
	@ApiField("result")
	private ScheduleResResult result;

	public void setResult(ScheduleResResult result) {
		this.result = result;
	}
	public ScheduleResResult getResult( ) {
		return this.result;
	}

}
