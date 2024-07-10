package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ScheduleConfigResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.aiservice.cloudbus.schedualconfig.set response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 02:39:22
 */
public class AlipayDataAiserviceCloudbusSchedualconfigSetResponse extends AlipayResponse {

	private static final long serialVersionUID = 3637581941382774872L;

	/** 
	 * 结果
	 */
	@ApiField("result")
	private ScheduleConfigResult result;

	public void setResult(ScheduleConfigResult result) {
		this.result = result;
	}
	public ScheduleConfigResult getResult( ) {
		return this.result;
	}

}
