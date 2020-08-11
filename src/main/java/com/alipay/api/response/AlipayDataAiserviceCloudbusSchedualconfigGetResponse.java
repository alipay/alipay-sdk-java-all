package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ScheduleConfigGetResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.aiservice.cloudbus.schedualconfig.get response.
 * 
 * @author auto create
 * @since 1.0, 2020-03-02 16:20:07
 */
public class AlipayDataAiserviceCloudbusSchedualconfigGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 2838737846153751551L;

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
