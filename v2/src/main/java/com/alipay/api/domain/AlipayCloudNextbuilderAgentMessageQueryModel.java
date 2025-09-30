package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询消息列表
 *
 * @author auto create
 * @since 1.0, 2024-06-26 17:41:40
 */
public class AlipayCloudNextbuilderAgentMessageQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7722858564634582775L;

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
	 * 来源，例如小程序id
	 */
	@ApiField("from_source")
	private String fromSource;

	/**
	 * 顺序（升序or降序）
	 */
	@ApiField("order")
	private String order;

	/**
	 * 排序的属性
	 */
	@ApiField("order_by")
	private String orderBy;

	/**
	 * 用户标识
	 */
	@ApiField("outer_user_id")
	private String outerUserId;

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

	public String getFromSource() {
		return this.fromSource;
	}
	public void setFromSource(String fromSource) {
		this.fromSource = fromSource;
	}

	public String getOrder() {
		return this.order;
	}
	public void setOrder(String order) {
		this.order = order;
	}

	public String getOrderBy() {
		return this.orderBy;
	}
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	public String getOuterUserId() {
		return this.outerUserId;
	}
	public void setOuterUserId(String outerUserId) {
		this.outerUserId = outerUserId;
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
