package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.data.risk.riskevent.sync response.
 * 
 * @author auto create
 * @since 1.0, 2019-11-19 14:45:18
 */
public class AlipayCommerceDataRiskRiskeventSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5435828689963214521L;

	/** 
	 * 风险id
	 */
	@ApiField("value")
	private Long value;

	public void setValue(Long value) {
		this.value = value;
	}
	public Long getValue( ) {
		return this.value;
	}

}
