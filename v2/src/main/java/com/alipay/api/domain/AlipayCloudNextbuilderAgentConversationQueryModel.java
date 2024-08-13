package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询历史会话列表
 *
 * @author auto create
 * @since 1.0, 2024-06-28 17:32:17
 */
public class AlipayCloudNextbuilderAgentConversationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6369257635143379126L;

	/**
	 * 青蓝平台创建的Agent 的 id，可从青蓝平台页面获取
	 */
	@ApiField("agent_id")
	private String agentId;

	/**
	 * 来源，例如小程序id
	 */
	@ApiField("from_source")
	private String fromSource;

	/**
	 * 开始时间戳，闭区间
	 */
	@ApiField("from_time")
	private Long fromTime;

	/**
	 * 实际用户标识
	 */
	@ApiField("outer_user_id")
	private String outerUserId;

	/**
	 * 当前页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页数量
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 结束时间戳，开区间
	 */
	@ApiField("to_time")
	private Long toTime;

	public String getAgentId() {
		return this.agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getFromSource() {
		return this.fromSource;
	}
	public void setFromSource(String fromSource) {
		this.fromSource = fromSource;
	}

	public Long getFromTime() {
		return this.fromTime;
	}
	public void setFromTime(Long fromTime) {
		this.fromTime = fromTime;
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

	public Long getToTime() {
		return this.toTime;
	}
	public void setToTime(Long toTime) {
		this.toTime = toTime;
	}

}
