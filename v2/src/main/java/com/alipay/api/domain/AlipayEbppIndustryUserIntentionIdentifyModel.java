package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 行业智能体用户意图识别
 *
 * @author auto create
 * @since 1.0, 2025-05-22 17:53:36
 */
public class AlipayEbppIndustryUserIntentionIdentifyModel extends AlipayObject {

	private static final long serialVersionUID = 8463695253195221187L;

	/**
	 * 历史提问和回答
	 */
	@ApiListField("history_list")
	@ApiField("history_query_and_answer")
	private List<HistoryQueryAndAnswer> historyList;

	/**
	 * 用户身份id
	 */
	@ApiField("identity_id")
	private String identityId;

	/**
	 * 用户提问的问题
	 */
	@ApiField("query")
	private String query;

	/**
	 * 用户会话id，用于描述用户当前的会话树
	 */
	@ApiField("session_id")
	private String sessionId;

	public List<HistoryQueryAndAnswer> getHistoryList() {
		return this.historyList;
	}
	public void setHistoryList(List<HistoryQueryAndAnswer> historyList) {
		this.historyList = historyList;
	}

	public String getIdentityId() {
		return this.identityId;
	}
	public void setIdentityId(String identityId) {
		this.identityId = identityId;
	}

	public String getQuery() {
		return this.query;
	}
	public void setQuery(String query) {
		this.query = query;
	}

	public String getSessionId() {
		return this.sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

}
