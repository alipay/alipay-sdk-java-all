package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.customer.jobworth.quickhire.submit response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-27 09:48:23
 */
public class ZhimaCustomerJobworthQuickhireSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 7449153599428198157L;

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
