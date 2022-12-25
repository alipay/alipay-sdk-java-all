package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PunishStatusResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fincore.compliance.rcservcenter.rcdisposal.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-21 10:11:37
 */
public class AlipayFincoreComplianceRcservcenterRcdisposalQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5198627368859589611L;

	/** 
	 * 处罚结果
	 */
	@ApiField("punish_status_result")
	private PunishStatusResult punishStatusResult;

	public void setPunishStatusResult(PunishStatusResult punishStatusResult) {
		this.punishStatusResult = punishStatusResult;
	}
	public PunishStatusResult getPunishStatusResult( ) {
		return this.punishStatusResult;
	}

}
