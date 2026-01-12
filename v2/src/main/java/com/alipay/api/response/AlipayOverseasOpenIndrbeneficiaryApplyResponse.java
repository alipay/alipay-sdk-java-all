package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.IndrISVResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.open.indrbeneficiary.apply response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-07 11:42:42
 */
public class AlipayOverseasOpenIndrbeneficiaryApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6754583147134828981L;

	/** 
	 * 机构id
	 */
	@ApiField("beneficiary_id")
	private String beneficiaryId;

	/** 
	 * 调用结果
	 */
	@ApiField("result")
	private IndrISVResult result;

	public void setBeneficiaryId(String beneficiaryId) {
		this.beneficiaryId = beneficiaryId;
	}
	public String getBeneficiaryId( ) {
		return this.beneficiaryId;
	}

	public void setResult(IndrISVResult result) {
		this.result = result;
	}
	public IndrISVResult getResult( ) {
		return this.result;
	}

}
