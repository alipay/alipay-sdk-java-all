package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 线下拉新结算明细数据查询
 *
 * @author auto create
 * @since 1.0, 2019-12-17 11:38:45
 */
public class AlipayUserInviteOfflinedetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6417281545554471574L;

	/**
	 * 页号
	 */
	@ApiField("page")
	private Long page;

	/**
	 * 页大小，page_size上限500，当大于500时，最多返回500条记录
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 二级渠道
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 一级渠道
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 日期
	 */
	@ApiField("report_date")
	private String reportDate;

	/**
	 * 参数名task_id，提供给商户按不同的线下拉新任务类型查询任务完成报表，当前枚举值有：xianxia001,xianxia002,xianxia_super,xianxia_bank。获取方式：该API仅提供给KA商户使用，接入时由运营沟通该参数如何使用。
	 */
	@ApiField("task_id")
	private String taskId;

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

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getReportDate() {
		return this.reportDate;
	}
	public void setReportDate(String reportDate) {
		this.reportDate = reportDate;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

}
