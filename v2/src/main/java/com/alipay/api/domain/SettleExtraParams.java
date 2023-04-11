package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻GO结算退出与任务描述信息
 *
 * @author auto create
 * @since 1.0, 2023-03-27 17:50:45
 */
public class SettleExtraParams extends AlipayObject {

	private static final long serialVersionUID = 1776251891929683922L;

	/**
	 * quit_type为USER_CANCEL_QUIT或者SETTLE_APPLY_QUIT
	 */
	@ApiField("quit_type")
	private String quitType;

	/**
	 * action_type选择PAY_TO_ZERO时必填，
"SERVICE_CANCELED":"服务已取消",
"OTHER_CHANNEL_PERFORMANCE":"户已通过其他方式履约"
	 */
	@ApiField("settle_adjust_reason")
	private String settleAdjustReason;

	public String getQuitType() {
		return this.quitType;
	}
	public void setQuitType(String quitType) {
		this.quitType = quitType;
	}

	public String getSettleAdjustReason() {
		return this.settleAdjustReason;
	}
	public void setSettleAdjustReason(String settleAdjustReason) {
		this.settleAdjustReason = settleAdjustReason;
	}

}
