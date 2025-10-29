package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资金结算信息
 *
 * @author auto create
 * @since 1.0, 2025-04-23 17:31:16
 */
public class BizfundSettleInfo extends AlipayObject {

	private static final long serialVersionUID = 1417129125721325135L;

	/**
	 * 请款|账期 模式
	 */
	@ApiField("settle_mode")
	private String settleMode;

	/**
	 * 结算的目标对象类型
	 */
	@ApiField("settle_target_type")
	private String settleTargetType;

	public String getSettleMode() {
		return this.settleMode;
	}
	public void setSettleMode(String settleMode) {
		this.settleMode = settleMode;
	}

	public String getSettleTargetType() {
		return this.settleTargetType;
	}
	public void setSettleTargetType(String settleTargetType) {
		this.settleTargetType = settleTargetType;
	}

}
