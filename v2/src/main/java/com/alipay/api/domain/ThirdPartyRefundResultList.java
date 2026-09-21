package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 退款订单明细
 *
 * @author auto create
 * @since 1.0, 2026-09-15 10:47:56
 */
public class ThirdPartyRefundResultList extends AlipayObject {

	private static final long serialVersionUID = 4268254587421956648L;

	/**
	 * 退款失败的原因,退款成功时为空
	 */
	@ApiField("failure_reason")
	private String failureReason;

	/**
	 * 平台订单号
	 */
	@ApiField("platform_order_no")
	private String platformOrderNo;

	/**
	 * 单笔订单的状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 退款异常任务id
	 */
	@ApiField("task_id")
	private String taskId;

	public String getFailureReason() {
		return this.failureReason;
	}
	public void setFailureReason(String failureReason) {
		this.failureReason = failureReason;
	}

	public String getPlatformOrderNo() {
		return this.platformOrderNo;
	}
	public void setPlatformOrderNo(String platformOrderNo) {
		this.platformOrderNo = platformOrderNo;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

}
