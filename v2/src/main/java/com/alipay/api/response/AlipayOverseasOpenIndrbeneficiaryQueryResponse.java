package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.IndrISVBeneficiaryDTO;
import com.alipay.api.domain.IndrISVResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.open.indrbeneficiary.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 20:52:37
 */
public class AlipayOverseasOpenIndrbeneficiaryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4899571666418157593L;

	/** 
	 * 收款方信息(结果为success才会返回)
	 */
	@ApiField("beneficiary_list")
	private IndrISVBeneficiaryDTO beneficiaryList;

	/** 
	 * 验证结果
	 */
	@ApiField("result")
	private IndrISVResult result;

	public void setBeneficiaryList(IndrISVBeneficiaryDTO beneficiaryList) {
		this.beneficiaryList = beneficiaryList;
	}
	public IndrISVBeneficiaryDTO getBeneficiaryList( ) {
		return this.beneficiaryList;
	}

	public void setResult(IndrISVResult result) {
		this.result = result;
	}
	public IndrISVResult getResult( ) {
		return this.result;
	}

}
