package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户意图确认
 *
 * @author auto create
 * @since 1.0, 2025-02-18 11:26:20
 */
public class AlipayOfflineProviderCollaborateTaskConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 3465939899398779481L;

	/**
	 * 当前操作在业务系统实际发生的时间。
匹配格式yyyy-MM-dd HH:mm:ss的date类型
	 */
	@ApiField("biz_time")
	private Date bizTime;

	/**
	 * 商家意图确认结果
	 */
	@ApiField("confirm_result")
	private String confirmResult;

	/**
	 * 外部系统对应操作流水号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 拉取任务时获得的任务号
	 */
	@ApiField("task_no")
	private String taskNo;

	public Date getBizTime() {
		return this.bizTime;
	}
	public void setBizTime(Date bizTime) {
		this.bizTime = bizTime;
	}

	public String getConfirmResult() {
		return this.confirmResult;
	}
	public void setConfirmResult(String confirmResult) {
		this.confirmResult = confirmResult;
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
