package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 金额试算
 *
 * @author auto create
 * @since 1.0, 2021-05-20 17:33:29
 */
public class AlipayOverseasOpenAmountPreconsultModel extends AlipayObject {

	private static final long serialVersionUID = 5756275937351288945L;

	/**
	 * 机构信息
	 */
	@ApiField("agent_info")
	private TuitionISVAgentInfoDTO agentInfo;

	/**
	 * 原金额
	 */
	@ApiField("original_amount")
	private TuitionMoneyDTO originalAmount;

	/**
	 * 外部参考号，由调用方生成
	 */
	@ApiField("reference_id")
	private String referenceId;

	public TuitionISVAgentInfoDTO getAgentInfo() {
		return this.agentInfo;
	}
	public void setAgentInfo(TuitionISVAgentInfoDTO agentInfo) {
		this.agentInfo = agentInfo;
	}

	public TuitionMoneyDTO getOriginalAmount() {
		return this.originalAmount;
	}
	public void setOriginalAmount(TuitionMoneyDTO originalAmount) {
		this.originalAmount = originalAmount;
	}

	public String getReferenceId() {
		return this.referenceId;
	}
	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
	}

}
