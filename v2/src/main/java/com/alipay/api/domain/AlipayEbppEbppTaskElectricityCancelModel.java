package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 虚拟电厂任务取消
 *
 * @author auto create
 * @since 1.0, 2024-08-30 10:21:26
 */
public class AlipayEbppEbppTaskElectricityCancelModel extends AlipayObject {

	private static final long serialVersionUID = 1859599754154975224L;

	/**
	 * 取消原因
	 */
	@ApiField("cancel_reason")
	private String cancelReason;

	/**
	 * 电科院任务id
	 */
	@ApiField("out_task_id")
	private String outTaskId;

	public String getCancelReason() {
		return this.cancelReason;
	}
	public void setCancelReason(String cancelReason) {
		this.cancelReason = cancelReason;
	}

	public String getOutTaskId() {
		return this.outTaskId;
	}
	public void setOutTaskId(String outTaskId) {
		this.outTaskId = outTaskId;
	}

}
