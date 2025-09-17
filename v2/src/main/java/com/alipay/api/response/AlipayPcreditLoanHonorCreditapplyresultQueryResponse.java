package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.HonorCreditApplyResultDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.loan.honor.creditapplyresult.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-12 17:57:39
 */
public class AlipayPcreditLoanHonorCreditapplyresultQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7391845979143142838L;

	/** 
	 * 授信申请结果
	 */
	@ApiField("result")
	private HonorCreditApplyResultDTO result;

	public void setResult(HonorCreditApplyResultDTO result) {
		this.result = result;
	}
	public HonorCreditApplyResultDTO getResult( ) {
		return this.result;
	}

}
