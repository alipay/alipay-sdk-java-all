package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 任务取消
 *
 * @author auto create
 * @since 1.0, 2026-03-10 14:47:44
 */
public class RobbyOpenTaskCancelModel extends AlipayObject {

	private static final long serialVersionUID = 5736342251318937221L;

	/**
	 * 机器人编号
	 */
	@ApiField("sn")
	private String sn;

	/**
	 * 子业务编号，全局唯一
	 */
	@ApiField("sub_biz_no")
	private String subBizNo;

	/**
	 * 灵波任务指令编号
	 */
	@ApiField("task_no")
	private String taskNo;

	public String getSn() {
		return this.sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}

	public String getSubBizNo() {
		return this.subBizNo;
	}
	public void setSubBizNo(String subBizNo) {
		this.subBizNo = subBizNo;
	}

	public String getTaskNo() {
		return this.taskNo;
	}
	public void setTaskNo(String taskNo) {
		this.taskNo = taskNo;
	}

}
