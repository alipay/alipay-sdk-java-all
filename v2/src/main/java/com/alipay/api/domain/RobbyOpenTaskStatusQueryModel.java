package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机器人任务状态查询
 *
 * @author auto create
 * @since 1.0, 2026-01-05 17:46:54
 */
public class RobbyOpenTaskStatusQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2172712987485445937L;

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
