package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ScheduleConfigGetResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.aiservice.cloudbus.schedualconfig.get response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 14:57:43
 */
public class AlipayDataAiserviceCloudbusSchedualconfigGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 4859545257117427828L;

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
