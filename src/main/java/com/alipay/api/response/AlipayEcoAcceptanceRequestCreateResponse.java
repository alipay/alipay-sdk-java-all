package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.acceptance.request.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayEcoAcceptanceRequestCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4845565382596299176L;

	/** 
	 * 提交数据ID
	 */
	@ApiField("request_id")
	private Long requestId;

	/** 
	 * 结果记录条数
	 */
	@ApiField("total_results")
	private Long totalResults;

	public void setRequestId(Long requestId) {
		this.requestId = requestId;
	}
	public Long getRequestId( ) {
		return this.requestId;
	}

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}

}
