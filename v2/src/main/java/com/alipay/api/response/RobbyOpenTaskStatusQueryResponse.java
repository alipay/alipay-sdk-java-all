package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ObjectTaskStatus;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: robby.open.task.status.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-05 17:46:54
 */
public class RobbyOpenTaskStatusQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6499655772219172376L;

	/** 
	 * 业务编号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * null
	 */
	@ApiListField("object_task_status_list")
	@ApiField("object_task_status")
	private List<ObjectTaskStatus> objectTaskStatusList;

	/** 
	 * 子业务编号
	 */
	@ApiField("sub_biz_no")
	private String subBizNo;

	/** 
	 * 灵波任务指令编号
	 */
	@ApiField("task_no")
	private String taskNo;

	/** 
	 * 任务接收状态，具体查看枚举值
	 */
	@ApiField("task_status")
	private String taskStatus;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setObjectTaskStatusList(List<ObjectTaskStatus> objectTaskStatusList) {
		this.objectTaskStatusList = objectTaskStatusList;
	}
	public List<ObjectTaskStatus> getObjectTaskStatusList( ) {
		return this.objectTaskStatusList;
	}

	public void setSubBizNo(String subBizNo) {
		this.subBizNo = subBizNo;
	}
	public String getSubBizNo( ) {
		return this.subBizNo;
	}

	public void setTaskNo(String taskNo) {
		this.taskNo = taskNo;
	}
	public String getTaskNo( ) {
		return this.taskNo;
	}

	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}
	public String getTaskStatus( ) {
		return this.taskStatus;
	}

}
