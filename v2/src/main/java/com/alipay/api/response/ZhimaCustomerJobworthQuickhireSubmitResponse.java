package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.customer.jobworth.quickhire.submit response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-14 11:32:38
 */
public class ZhimaCustomerJobworthQuickhireSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 4353187173583118967L;

	/** 
	 * 投递同步是否成功，true = 成功，false = 失败
	 */
	@ApiField("deliver_result")
	private Boolean deliverResult;

	public void setDeliverResult(Boolean deliverResult) {
		this.deliverResult = deliverResult;
	}
	public Boolean getDeliverResult( ) {
		return this.deliverResult;
	}

}
