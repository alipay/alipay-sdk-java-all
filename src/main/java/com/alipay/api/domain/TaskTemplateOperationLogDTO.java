package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 任务模版操作记录
 *
 * @author auto create
 * @since 1.0, 2022-03-16 15:39:43
 */
public class TaskTemplateOperationLogDTO extends AlipayObject {

	private static final long serialVersionUID = 2371896716791479972L;

	/**
	 * 操作时间
	 */
	@ApiField("action_time")
	private Date actionTime;

	/**
	 * 操作行为
CREATE 创建
MODIFY  修改
PUBLISH 发布
SUSPEND 暂停
RESUME  继续
STOP 终止
	 */
	@ApiField("action_type")
	private String actionType;

	/**
	 * 操作者uid
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 任务模版id
	 */
	@ApiField("task_template_id")
	private String taskTemplateId;

	public Date getActionTime() {
		return this.actionTime;
	}
	public void setActionTime(Date actionTime) {
		this.actionTime = actionTime;
	}

	public String getActionType() {
		return this.actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getTaskTemplateId() {
		return this.taskTemplateId;
	}
	public void setTaskTemplateId(String taskTemplateId) {
		this.taskTemplateId = taskTemplateId;
	}

}
