package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询任务列表
 *
 * @author auto create
 * @since 1.0, 2022-07-13 13:27:12
 */
public class AlipayCommerceYuntaskListQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2319825953122624297L;

	/**
	 * 结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 出资方id
	 */
	@ApiField("funder_id")
	private String funderId;

	/**
	 * 出资方类型：品牌BRAND，零售商RETAILER，平台PLATFORM
	 */
	@ApiField("funder_type")
	private String funderType;

	/**
	 * 活动方id
	 */
	@ApiField("organizer_id")
	private String organizerId;

	/**
	 * 活动方类型：零售商RETAILER
	 */
	@ApiField("organizer_type")
	private String organizerType;

	/**
	 * 分页数
	 */
	@ApiField("page")
	private Long page;

	/**
	 * 分页大小，默认10
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 起始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 任务状态
未发布(UNPUBLISHED)
可发布(PUBLISHABLE)
未开始(NOTSTARTED)
进行中(STARTED)
暂停中(SUSPENDED)
已结束(FINISH)
	 */
	@ApiField("status")
	private String status;

	/**
	 * 任务名称
	 */
	@ApiField("task_name")
	private String taskName;

	/**
	 * 任务模版id
	 */
	@ApiField("task_template_id")
	private String taskTemplateId;

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getFunderId() {
		return this.funderId;
	}
	public void setFunderId(String funderId) {
		this.funderId = funderId;
	}

	public String getFunderType() {
		return this.funderType;
	}
	public void setFunderType(String funderType) {
		this.funderType = funderType;
	}

	public String getOrganizerId() {
		return this.organizerId;
	}
	public void setOrganizerId(String organizerId) {
		this.organizerId = organizerId;
	}

	public String getOrganizerType() {
		return this.organizerType;
	}
	public void setOrganizerType(String organizerType) {
		this.organizerType = organizerType;
	}

	public Long getPage() {
		return this.page;
	}
	public void setPage(Long page) {
		this.page = page;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTaskName() {
		return this.taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getTaskTemplateId() {
		return this.taskTemplateId;
	}
	public void setTaskTemplateId(String taskTemplateId) {
		this.taskTemplateId = taskTemplateId;
	}

}
