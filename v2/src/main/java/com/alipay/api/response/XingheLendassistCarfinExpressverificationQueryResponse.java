package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: xinghe.lendassist.carfin.expressverification.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-25 21:32:58
 */
public class XingheLendassistCarfinExpressverificationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5393176573567573674L;

	/** 
	 * 完整性校验结果
	 */
	@ApiField("completeness_check_result")
	private String completenessCheckResult;

	/** 
	 * 审批结果
	 */
	@ApiField("status")
	private String status;

	public void setCompletenessCheckResult(String completenessCheckResult) {
		this.completenessCheckResult = completenessCheckResult;
	}
	public String getCompletenessCheckResult( ) {
		return this.completenessCheckResult;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
