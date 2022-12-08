package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RcSmartResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fincore.compliance.rcservcenter.rcsmart.approve response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 06:47:01
 */
public class AlipayFincoreComplianceRcservcenterRcsmartApproveResponse extends AlipayResponse {

	private static final long serialVersionUID = 8491633259225893189L;

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
