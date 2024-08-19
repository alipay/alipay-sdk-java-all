package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.aichat.history.add response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-16 11:42:18
 */
public class AlipayCloudCloudpromoAichatHistoryAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 7374794737427362379L;

	/** 
	 * 本次请求的的ID，可以用来查询历史记录
	 */
	@ApiField("request_id")
	private String requestId;

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId( ) {
		return this.requestId;
	}

}
