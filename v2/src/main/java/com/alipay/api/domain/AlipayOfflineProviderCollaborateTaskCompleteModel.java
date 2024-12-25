package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 完成协同任务
 *
 * @author auto create
 * @since 1.0, 2024-11-30 15:56:56
 */
public class AlipayOfflineProviderCollaborateTaskCompleteModel extends AlipayObject {

	private static final long serialVersionUID = 1352448641364431658L;

	/**
	 * 当前操作在业务系统实际发生的时间。
	 */
	@ApiField("biz_time")
	private Date bizTime;

	/**
	 * 完成返回内容列表
	 */
	@ApiListField("contents")
	@ApiField("collaborate_task_complete_content")
	private List<CollaborateTaskCompleteContent> contents;

	/**
	 * 外部系统对应操作流水号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 拉取任务时获得的任务号。
	 */
	@ApiField("task_no")
	private String taskNo;

	public Date getBizTime() {
		return this.bizTime;
	}
	public void setBizTime(Date bizTime) {
		this.bizTime = bizTime;
	}

	public List<CollaborateTaskCompleteContent> getContents() {
		return this.contents;
	}
	public void setContents(List<CollaborateTaskCompleteContent> contents) {
		this.contents = contents;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getTaskNo() {
		return this.taskNo;
	}
	public void setTaskNo(String taskNo) {
		this.taskNo = taskNo;
	}

}
