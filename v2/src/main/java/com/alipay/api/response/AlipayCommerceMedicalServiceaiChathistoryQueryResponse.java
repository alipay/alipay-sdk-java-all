package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.LlmChatHistoryVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.serviceai.chathistory.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-15 14:22:42
 */
public class AlipayCommerceMedicalServiceaiChathistoryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1686318654548834197L;

	/** 
	 * null
	 */
	@ApiListField("content_list")
	@ApiField("llm_chat_history_v_o")
	private List<LlmChatHistoryVO> contentList;

	/** 
	 * 是否还有更多
	 */
	@ApiField("has_next")
	private Boolean hasNext;

	/** 
	 * 最近历史会话时间
	 */
	@ApiField("latest_time")
	private Long latestTime;

	/** 
	 * 每页条数
	 */
	@ApiField("page_size")
	private Long pageSize;

	public void setContentList(List<LlmChatHistoryVO> contentList) {
		this.contentList = contentList;
	}
	public List<LlmChatHistoryVO> getContentList( ) {
		return this.contentList;
	}

	public void setHasNext(Boolean hasNext) {
		this.hasNext = hasNext;
	}
	public Boolean getHasNext( ) {
		return this.hasNext;
	}

	public void setLatestTime(Long latestTime) {
		this.latestTime = latestTime;
	}
	public Long getLatestTime( ) {
		return this.latestTime;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

}
