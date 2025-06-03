package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 线下拉新结算汇总数据查询
 *
 * @author auto create
 * @since 1.0, 2022-09-21 18:07:14
 */
public class AlipayUserInviteOfflinesummaryQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4475984812188376249L;

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
