package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RcSmartResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fincore.compliance.rcservcenter.rcsmart.approve response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 22:50:20
 */
public class AlipayFincoreComplianceRcservcenterRcsmartApproveResponse extends AlipayResponse {

	private static final long serialVersionUID = 8832591642922612786L;

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
