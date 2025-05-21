package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户意图确认
 *
 * @author auto create
 * @since 1.0, 2025-03-10 13:51:21
 */
public class AlipayOfflineProviderCollaborateTaskConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 8691496139212967525L;

	/**
	 * 当前操作在业务系统实际发生的时间。
匹配格式yyyy-MM-dd HH:mm:ss的date类型
	 */
	@ApiField("biz_time")
	private Date bizTime;

	/**
	 * 商家意图确认结果；当反馈商家有意向 HAS,接口将返回详细作业信息，任务状态推进到已确认；当反馈商家无意向 NOT_HAS,接口不返回详细作业信息，任务状态推进到无法完成，当反馈商家无法联系，接口将根据业务规则判断是否返回详细作业信息，任务状态不推进
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
