package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RcSmartResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fincore.compliance.rcservcenter.rcsmart.approve response.
 * 
 * @author auto create
 * @since 1.0, 2022-08-26 11:11:45
 */
public class AlipayFincoreComplianceRcservcenterRcsmartApproveResponse extends AlipayResponse {

	private static final long serialVersionUID = 8389245639799713721L;

	/** 
	 * 解语花统一返回对象
	 */
	@ApiField("rc_smart_response")
	private RcSmartResponse rcSmartResponse;

	public void setRcSmartResponse(RcSmartResponse rcSmartResponse) {
		this.rcSmartResponse = rcSmartResponse;
	}
	public RcSmartResponse getRcSmartResponse( ) {
		return this.rcSmartResponse;
	}

}
