package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.ai.device.pay.callback response.
 * 
 * @author auto create
 * @since 1.0, 2025-02-19 10:27:23
 */
public class AnttechAiDevicePayCallbackResponse extends AlipayResponse {

	private static final long serialVersionUID = 5833526282829596185L;

	/** 
	 * 业务回执，调用方需要 说明： 如果在提交创建任务的请求参数中传入了biz_receiet，则此处返回对应的biz_receiet
	 */
	@ApiField("biz_receiet")
	private String bizReceiet;

	/** 
	 * 调用设备支付回执对应的请求ID 说明： 如果在提交创建任务的请求参数中传入了request_id，则此处返回对应的request_id
	 */
	@ApiField("request_id")
	private String requestId;

	public void setBizReceiet(String bizReceiet) {
		this.bizReceiet = bizReceiet;
	}
	public String getBizReceiet( ) {
		return this.bizReceiet;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId( ) {
		return this.requestId;
	}

}
