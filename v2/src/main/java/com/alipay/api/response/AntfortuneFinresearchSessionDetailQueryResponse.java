package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.FinMessageDetail;
import com.alipay.api.domain.FinSessionDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.finresearch.session.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-07 11:27:04
 */
public class AntfortuneFinresearchSessionDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2296377624461749131L;

	/** 
	 * 会话列表
	 */
	@ApiField("message_list")
	private FinMessageDetail messageList;

	/** 
	 * 会话详情
	 */
	@ApiField("session_detail")
	private FinSessionDetail sessionDetail;

	public void setMessageList(FinMessageDetail messageList) {
		this.messageList = messageList;
	}
	public FinMessageDetail getMessageList( ) {
		return this.messageList;
	}

	public void setSessionDetail(FinSessionDetail sessionDetail) {
		this.sessionDetail = sessionDetail;
	}
	public FinSessionDetail getSessionDetail( ) {
		return this.sessionDetail;
	}

}
