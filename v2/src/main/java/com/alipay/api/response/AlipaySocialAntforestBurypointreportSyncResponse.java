package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.antforest.burypointreport.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-08 19:52:30
 */
public class AlipaySocialAntforestBurypointreportSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 1772432932641264615L;

	/** 
	 * 是否有访问
	 */
	@ApiField("acknowledged")
	private Boolean acknowledged;

	public void setAcknowledged(Boolean acknowledged) {
		this.acknowledged = acknowledged;
	}
	public Boolean getAcknowledged( ) {
		return this.acknowledged;
	}

}
