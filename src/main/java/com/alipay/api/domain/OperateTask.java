package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 操作任务对象
 *
 * @author auto create
 * @since 1.0, 2020-09-11 10:45:33
 */
public class OperateTask extends AlipayObject {

	private static final long serialVersionUID = 5325379186653639797L;

	/**
	 * 操作参数，json格式字符串，根据operation_type值不同，传入不同的值。
当operation_type=RESPONSE时，operation_params不传；
当operation_type=DEAL时，传入的参数包括feedback_code(反馈code)、feedback_remark(反馈备注)；
当operation_type=REMARK时，传入的参数包括remark_content(备注内容)
	 */
	@ApiField("operation_params")
	private String operationParams;

	/**
	 * 操作类型:
RESPONSE：任务响应
DEAL：任务处理
REMARK：任务备注
	 */
	@ApiField("operation_type")
	private String operationType;

	/**
	 * 操作任务id
	 */
	@ApiField("task_id")
	private String taskId;

	public String getOperationParams() {
		return this.operationParams;
	}
	public void setOperationParams(String operationParams) {
		this.operationParams = operationParams;
	}

	public String getOperationType() {
		return this.operationType;
	}
	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

}
