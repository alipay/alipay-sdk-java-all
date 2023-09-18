package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 任务批量更新接口
 *
 * @author auto create
 * @since 1.0, 2020-09-11 10:56:45
 */
public class AlipayCommerceAbntaskModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3723625516424485813L;

	/**
	 * 操作任务列表
	 */
	@ApiListField("operate_task_list")
	@ApiField("operate_task")
	private List<OperateTask> operateTaskList;

	/**
	 * 操作时间，yyyy-MM-dd HH:mm:ss格式的字符串，不传的话默认为当前时间
	 */
	@ApiField("operation_time")
	private String operationTime;

	/**
	 * 操作人id，操作人在开发者系统中的账号id
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 操作人昵称
	 */
	@ApiField("operator_nick")
	private String operatorNick;

	public List<OperateTask> getOperateTaskList() {
		return this.operateTaskList;
	}
	public void setOperateTaskList(List<OperateTask> operateTaskList) {
		this.operateTaskList = operateTaskList;
	}

	public String getOperationTime() {
		return this.operationTime;
	}
	public void setOperationTime(String operationTime) {
		this.operationTime = operationTime;
	}

	public String getOperatorId() {
		return this.operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getOperatorNick() {
		return this.operatorNick;
	}
	public void setOperatorNick(String operatorNick) {
		this.operatorNick = operatorNick;
	}

}
