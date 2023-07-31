package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ScheduleConfigGetResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.aiservice.cloudbus.schedualconfig.get response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 00:08:04
 */
public class AlipayDataAiserviceCloudbusSchedualconfigGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 4622377239672276456L;

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
