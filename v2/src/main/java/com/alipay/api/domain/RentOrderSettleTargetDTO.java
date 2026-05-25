package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 结算账号信息
 *
 * @author auto create
 * @since 1.0, 2026-03-12 11:46:45
 */
public class RentOrderSettleTargetDTO extends AlipayObject {

	private static final long serialVersionUID = 2756822643117931262L;

	/**
	 * 结算目标
	 */
	@ApiField("settle_target")
	private String settleTarget;

	/**
	 * 结算对象openid
	 */
	@ApiField("settle_target_openid")
	private String settleTargetOpenid;

	/**
	 * 结算对象uid
	 */
	@ApiField("settle_target_uid")
	private String settleTargetUid;

	/**
	 * 结算类型
	 */
	@ApiField("settle_type")
	private String settleType;

	public String getSettleTarget() {
		return this.settleTarget;
	}
	public void setSettleTarget(String settleTarget) {
		this.settleTarget = settleTarget;
	}

	public String getSettleTargetOpenid() {
		return this.settleTargetOpenid;
	}
	public void setSettleTargetOpenid(String settleTargetOpenid) {
		this.settleTargetOpenid = settleTargetOpenid;
	}

	public String getSettleTargetUid() {
		return this.settleTargetUid;
	}
	public void setSettleTargetUid(String settleTargetUid) {
		this.settleTargetUid = settleTargetUid;
	}

	public String getSettleType() {
		return this.settleType;
	}
	public void setSettleType(String settleType) {
		this.settleType = settleType;
	}

}
