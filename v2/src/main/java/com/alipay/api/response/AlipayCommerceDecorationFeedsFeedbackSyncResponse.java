package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.decoration.feeds.feedback.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-02-10 15:47:43
 */
public class AlipayCommerceDecorationFeedsFeedbackSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2364388417128284129L;

	/** 
	 * 反馈类型
	 */
	@ApiField("feedback_type")
	private String feedbackType;

	/** 
	 * 线索ID
	 */
	@ApiField("lead_id")
	private String leadId;

	/** 
	 * 同步结果描述
	 */
	@ApiField("sync_message")
	private String syncMessage;

	public void setFeedbackType(String feedbackType) {
		this.feedbackType = feedbackType;
	}
	public String getFeedbackType( ) {
		return this.feedbackType;
	}

	public void setLeadId(String leadId) {
		this.leadId = leadId;
	}
	public String getLeadId( ) {
		return this.leadId;
	}

	public void setSyncMessage(String syncMessage) {
		this.syncMessage = syncMessage;
	}
	public String getSyncMessage( ) {
		return this.syncMessage;
	}

}
