package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ScheduleTripResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.aiservice.cloudbus.scheduletriptime.get response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 17:42:17
 */
public class AlipayDataAiserviceCloudbusScheduletriptimeGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 8515359154252295942L;

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
