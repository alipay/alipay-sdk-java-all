package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.antlescenter.partcontractreview.apply response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-07 12:47:36
 */
public class AlipayBossAntlescenterPartcontractreviewApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7188145781852898745L;

	/** 
	 * 人工审核链接
	 */
	@ApiField("apply_manual_review_url")
	private String applyManualReviewUrl;

	/** 
	 * 合同编号
	 */
	@ApiField("contract_no")
	private String contractNo;

	public void setApplyManualReviewUrl(String applyManualReviewUrl) {
		this.applyManualReviewUrl = applyManualReviewUrl;
	}
	public String getApplyManualReviewUrl( ) {
		return this.applyManualReviewUrl;
	}

	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}
	public String getContractNo( ) {
		return this.contractNo;
	}

}
