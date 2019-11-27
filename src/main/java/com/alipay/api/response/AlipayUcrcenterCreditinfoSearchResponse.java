package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AliCreditScoreResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ucrcenter.creditinfo.search response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayUcrcenterCreditinfoSearchResponse extends AlipayResponse {

	private static final long serialVersionUID = 8767778219676282847L;

	/** 
	 * 信用分结果
	 */
	@ApiField("ali_credit_score_result")
	private AliCreditScoreResult aliCreditScoreResult;

	public void setAliCreditScoreResult(AliCreditScoreResult aliCreditScoreResult) {
		this.aliCreditScoreResult = aliCreditScoreResult;
	}
	public AliCreditScoreResult getAliCreditScoreResult( ) {
		return this.aliCreditScoreResult;
	}

}
