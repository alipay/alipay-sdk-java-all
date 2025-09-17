package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外呼服务
 *
 * @author auto create
 * @since 1.0, 2025-03-10 13:51:22
 */
public class AlipayOfflineProviderCollaborateTaskTriggerModel extends AlipayObject {

	private static final long serialVersionUID = 3124676436649234799L;

	/**
	 * 当前操作在业务系统实际发生的时间。
匹配格式yyyy-MM-dd HH:mm:ss的date类型
	 */
	@ApiField("biz_time")
	private Date bizTime;

	/**
	 * 发起呼叫的手机号
	 */
	@ApiField("call_number")
	private String callNumber;

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

	public String getCallNumber() {
		return this.callNumber;
	}
	public void setCallNumber(String callNumber) {
		this.callNumber = callNumber;
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
