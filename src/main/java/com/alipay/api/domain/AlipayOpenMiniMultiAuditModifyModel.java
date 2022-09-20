package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 多端审核工单结果回调
 *
 * @author auto create
 * @since 1.0, 2019-04-11 10:42:58
 */
public class AlipayOpenMiniMultiAuditModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4868521725788234859L;

	/**
	 * 审核备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 处理动作agree/reject
	 */
	@ApiField("operate_result")
	private String operateResult;

	/**
	 * 操作类型，高德固定填写AMAP_AUDIT_CALL_BACK
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * 工单id
	 */
	@ApiField("task_id")
	private String taskId;

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOperateResult() {
		return this.operateResult;
	}
	public void setOperateResult(String operateResult) {
		this.operateResult = operateResult;
	}

	public String getOperateType() {
		return this.operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

}
