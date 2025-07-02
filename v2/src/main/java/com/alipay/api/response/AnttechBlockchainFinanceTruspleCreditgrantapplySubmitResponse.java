package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.finance.trusple.creditgrantapply.submit response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:36:22
 */
public class AnttechBlockchainFinanceTruspleCreditgrantapplySubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 6216715785861277185L;

	/** 
	 * 机构授信编号
	 */
	@ApiField("inst_credit_grant_id")
	private String instCreditGrantId;

	/** 
	 * 结果状态，S表示成功，F表示明确失败，U表示未知异常。一般返回U，调用方可能会重试
	 */
	@ApiField("result_status")
	private String resultStatus;

	public void setInstCreditGrantId(String instCreditGrantId) {
		this.instCreditGrantId = instCreditGrantId;
	}
	public String getInstCreditGrantId( ) {
		return this.instCreditGrantId;
	}

	public void setResultStatus(String resultStatus) {
		this.resultStatus = resultStatus;
	}
	public String getResultStatus( ) {
		return this.resultStatus;
	}

}
