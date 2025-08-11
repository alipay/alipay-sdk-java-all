package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.water.usertask.send response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-07 13:06:08
 */
public class AlipayCommerceWaterUsertaskSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 4189945615667171142L;

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
