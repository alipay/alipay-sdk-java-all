package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ScheduleConfigGetResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.aiservice.cloudbus.schedualconfig.get response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 01:43:12
 */
public class AlipayDataAiserviceCloudbusSchedualconfigGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 4883849721696442862L;

	/** 
	 * 结果
	 */
	@ApiField("result")
	private ScheduleConfigGetResult result;

	public void setResult(ScheduleConfigGetResult result) {
		this.result = result;
	}
	public ScheduleConfigGetResult getResult( ) {
		return this.result;
	}

}
