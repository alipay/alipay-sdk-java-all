package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 默认结算规则
 *
 * @author auto create
 * @since 1.0, 2025-09-22 14:16:37
 */
public class ZftDefaultSettleRule extends AlipayObject {

	private static final long serialVersionUID = 5561265492627918335L;

	/**
	 * 默认结算目标。当默认结算类型为alipayAccount时填写支付宝账号登录号，其值需在进件填写的结算支付宝账号范围内。
	 */
	@ApiField("default_settle_target")
	private String defaultSettleTarget;

	/**
	 * 默认结算类型，默认alipayAccount
	 */
	@ApiField("default_settle_type")
	private String defaultSettleType;

	public String getDefaultSettleTarget() {
		return this.defaultSettleTarget;
	}
	public void setDefaultSettleTarget(String defaultSettleTarget) {
		this.defaultSettleTarget = defaultSettleTarget;
	}

	public String getDefaultSettleType() {
		return this.defaultSettleType;
	}
	public void setDefaultSettleType(String defaultSettleType) {
		this.defaultSettleType = defaultSettleType;
	}

}
