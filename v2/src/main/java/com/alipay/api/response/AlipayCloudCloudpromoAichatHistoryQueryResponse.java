package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ChatHistory;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.aichat.history.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-26 15:52:07
 */
public class AlipayCloudCloudpromoAichatHistoryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2318989983933545322L;

	/** 
	 * 历史对话详情
	 */
	@ApiField("histories")
	private ChatHistory histories;

	public void setHistories(ChatHistory histories) {
		this.histories = histories;
	}
	public ChatHistory getHistories( ) {
		return this.histories;
	}

}
