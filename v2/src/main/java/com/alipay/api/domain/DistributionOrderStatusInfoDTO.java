package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分销订单状态变更信息
 *
 * @author auto create
 * @since 1.0, 2026-08-26 12:37:47
 */
public class DistributionOrderStatusInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 7657188757618827875L;

	/**
	 * 订单关闭原因
	 */
	@ApiField("close_reason")
	private String closeReason;

	/**
	 * 变更前状态
	 */
	@ApiField("source_status")
	private String sourceStatus;

	/**
	 * 变更后状态
	 */
	@ApiField("status")
	private String status;

	public String getCloseReason() {
		return this.closeReason;
	}
	public void setCloseReason(String closeReason) {
		this.closeReason = closeReason;
	}

	public String getSourceStatus() {
		return this.sourceStatus;
	}
	public void setSourceStatus(String sourceStatus) {
		this.sourceStatus = sourceStatus;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
