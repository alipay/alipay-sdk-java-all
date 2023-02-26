package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ScheduleResResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.aiservice.cloudbus.resource.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-10 23:16:06
 */
public class AlipayDataAiserviceCloudbusResourceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8549386761241557865L;

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
