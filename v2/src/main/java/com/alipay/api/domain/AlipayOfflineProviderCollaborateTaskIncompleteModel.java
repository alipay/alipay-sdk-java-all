package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 无法完成协同任务
 *
 * @author auto create
 * @since 1.0, 2024-11-30 15:56:55
 */
public class AlipayOfflineProviderCollaborateTaskIncompleteModel extends AlipayObject {

	private static final long serialVersionUID = 1498572837271792814L;

	/**
	 * 当前操作在业务系统实际发生的时间。
	 */
	@ApiField("biz_time")
	private Date bizTime;

	/**
	 * 外部系统对应操作流水号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 原因编码。
	 */
	@ApiField("reason_code")
	private String reasonCode;

	/**
	 * 原因描述
	 */
	@ApiField("reason_desc")
	private String reasonDesc;

	/**
	 * 二级原因编码
	 */
	@ApiField("reason_sub_code")
	private String reasonSubCode;

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

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getReasonCode() {
		return this.reasonCode;
	}
	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}

	public String getReasonDesc() {
		return this.reasonDesc;
	}
	public void setReasonDesc(String reasonDesc) {
		this.reasonDesc = reasonDesc;
	}

	public String getReasonSubCode() {
		return this.reasonSubCode;
	}
	public void setReasonSubCode(String reasonSubCode) {
		this.reasonSubCode = reasonSubCode;
	}

	public String getTaskNo() {
		return this.taskNo;
	}
	public void setTaskNo(String taskNo) {
		this.taskNo = taskNo;
	}

}
