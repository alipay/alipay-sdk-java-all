package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.IndrISVResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.open.indraccount.consult response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:28:36
 */
public class AlipayOverseasOpenIndraccountConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 4313776591457823994L;

	/** 
	 * 账户id, 结果为success才会返回, 失败返回空
	 */
	@ApiField("beneficiary_account_id")
	private String beneficiaryAccountId;

	/** 
	 * 验证结果
	 */
	@ApiField("result")
	private IndrISVResult result;

	public void setBeneficiaryAccountId(String beneficiaryAccountId) {
		this.beneficiaryAccountId = beneficiaryAccountId;
	}
	public String getBeneficiaryAccountId( ) {
		return this.beneficiaryAccountId;
	}

	public void setResult(IndrISVResult result) {
		this.result = result;
	}
	public IndrISVResult getResult( ) {
		return this.result;
	}

}
