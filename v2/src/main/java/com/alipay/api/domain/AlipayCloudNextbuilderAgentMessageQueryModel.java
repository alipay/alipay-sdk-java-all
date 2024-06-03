package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询消息列表
 *
 * @author auto create
 * @since 1.0, 2024-05-31 16:13:24
 */
public class AlipayCloudNextbuilderAgentMessageQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5663144914517369228L;

	/**
	 * AI创作平台agentId
	 */
	@ApiField("agent_id")
	private String agentId;

	/**
	 * 会话id
	 */
	@ApiField("conversation_id")
	private String conversationId;

	/**
	 * 当前页码，从1开始，默认为1
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页大小，默认10
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getAgentId() {
		return this.agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getConversationId() {
		return this.conversationId;
	}
	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

}
