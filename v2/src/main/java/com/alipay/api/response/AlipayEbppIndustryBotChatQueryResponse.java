package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BotChatLog;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.bot.chat.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-26 22:47:27
 */
public class AlipayEbppIndustryBotChatQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5112729552469244685L;

	/** 
	 * 机器人问答记录列表
	 */
	@ApiListField("answer_list")
	@ApiField("bot_chat_log")
	private List<BotChatLog> answerList;

	/** 
	 * 当前返回的第几页数据
	 */
	@ApiField("current_page")
	private Long currentPage;

	/** 
	 * 是否有下一页
	 */
	@ApiField("has_next")
	private Boolean hasNext;

	/** 
	 * 当前入参条件下查询到的个数。单位：个。
	 */
	@ApiField("total")
	private Long total;

	public void setAnswerList(List<BotChatLog> answerList) {
		this.answerList = answerList;
	}
	public List<BotChatLog> getAnswerList( ) {
		return this.answerList;
	}

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}
	public Long getCurrentPage( ) {
		return this.currentPage;
	}

	public void setHasNext(Boolean hasNext) {
		this.hasNext = hasNext;
	}
	public Boolean getHasNext( ) {
		return this.hasNext;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
