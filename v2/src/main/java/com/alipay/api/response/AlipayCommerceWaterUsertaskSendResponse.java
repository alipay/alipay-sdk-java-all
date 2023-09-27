package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.water.usertask.send response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-04 17:31:57
 */
public class AlipayCommerceWaterUsertaskSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 5571928515743516919L;

	/** 
	 * 上报是否成功
	 */
	@ApiField("trigger_result")
	private Boolean triggerResult;

	public void setTriggerResult(Boolean triggerResult) {
		this.triggerResult = triggerResult;
	}
	public Boolean getTriggerResult( ) {
		return this.triggerResult;
	}

}
