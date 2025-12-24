package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取通话记录详情列表请求体
 *
 * @author auto create
 * @since 1.0, 2023-10-16 16:42:57
 */
public class ListCallDetailRecordsRequest extends AlipayObject {

	private static final long serialVersionUID = 4576916471969964717L;

	/**
	 * 坐席ID
	 */
	@ApiField("agent_id")
	private String agentId;

	/**
	 * 通话ID
	 */
	@ApiField("contact_id")
	private String contactId;

	/**
	 * 通话类型
	 */
	@ApiField("contact_type")
	private String contactType;

	/**
	 * 历史通话数据的结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 排序字段
	 */
	@ApiField("order_by_field")
	private String orderByField;

	/**
	 * 页码
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 单页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 排序方式
	 */
	@ApiField("sort_order")
	private String sortOrder;

	/**
	 * 历史通话数据的起始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	public String getAgentId() {
		return this.agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getContactId() {
		return this.contactId;
	}
	public void setContactId(String contactId) {
		this.contactId = contactId;
	}

	public String getContactType() {
		return this.contactType;
	}
	public void setContactType(String contactType) {
		this.contactType = contactType;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getOrderByField() {
		return this.orderByField;
	}
	public void setOrderByField(String orderByField) {
		this.orderByField = orderByField;
	}

	public Long getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getSortOrder() {
		return this.sortOrder;
	}
	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

}
