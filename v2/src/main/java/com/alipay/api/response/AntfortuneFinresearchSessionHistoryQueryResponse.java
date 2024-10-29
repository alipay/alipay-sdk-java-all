package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.FinSessionDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.finresearch.session.history.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-18 15:47:01
 */
public class AntfortuneFinresearchSessionHistoryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2187849425376799572L;

	/** 
	 * 会话列表
	 */
	@ApiField("session_list")
	private FinSessionDetail sessionList;

	public void setSessionList(FinSessionDetail sessionList) {
		this.sessionList = sessionList;
	}
	public FinSessionDetail getSessionList( ) {
		return this.sessionList;
	}

}
