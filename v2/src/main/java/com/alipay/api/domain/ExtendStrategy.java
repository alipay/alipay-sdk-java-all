package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 提现使用的扩展策略
 *
 * @author auto create
 * @since 1.0, 2025-04-27 21:51:16
 */
public class ExtendStrategy extends AlipayObject {

	private static final long serialVersionUID = 4578814698585329513L;

	/**
	 * 账户信息
	 */
	@ApiField("participant_form")
	private ParticipantForm participantForm;

	/**
	 * 提现策略。
withdrawToSamePersonAccount仅支持支付宝已注销，但是场景钱包仍有余额的情况；
withdrawToSameCidAccount支持同CID，且双方支付宝未注销时，场景钱包提现到同CID支付宝余额。
	 */
	@ApiField("strategy")
	private String strategy;

	public ParticipantForm getParticipantForm() {
		return this.participantForm;
	}
	public void setParticipantForm(ParticipantForm participantForm) {
		this.participantForm = participantForm;
	}

	public String getStrategy() {
		return this.strategy;
	}
	public void setStrategy(String strategy) {
		this.strategy = strategy;
	}

}
