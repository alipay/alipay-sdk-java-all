package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 淘客任务模板列表查询
 *
 * @author auto create
 * @since 1.0, 2023-12-12 16:12:07
 */
public class AlipayCommerceCommonTasktemplateBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 1472719699317961732L;

	/**
	 * 查询时间范围结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 出资方id
	 */
	@ApiField("funder_id")
	private String funderId;

	/**
	 * 代运营商户的id
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/**
	 * 活动方id
	 */
	@ApiField("organizer_id")
	private String organizerId;

	/**
	 * 分页页码
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 分页的大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 查询时间范围开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 任务的状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 任务名称
	 */
	@ApiField("task_name")
	private String taskName;

	/**
	 * 任务模板id集合
	 */
	@ApiListField("task_template_ids")
	@ApiField("string")
	private List<String> taskTemplateIds;

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

	public String getMerchantPid() {
		return this.merchantPid;
	}
	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}

	public String getOrganizerId() {
		return this.organizerId;
	}
	public void setOrganizerId(String organizerId) {
		this.organizerId = organizerId;
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

	public List<String> getTaskTemplateIds() {
		return this.taskTemplateIds;
	}
	public void setTaskTemplateIds(List<String> taskTemplateIds) {
		this.taskTemplateIds = taskTemplateIds;
	}

}
