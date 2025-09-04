package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RcSmartAuditResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fincore.compliance.rcservcenter.rcsmart.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 00:22:52
 */
public class AlipayFincoreComplianceRcservcenterRcsmartQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5517523827448194539L;

	/** 
	 * 内容审核结果
	 */
	@ApiField("rc_smart_audit_response")
	private RcSmartAuditResponse rcSmartAuditResponse;

	public void setRcSmartAuditResponse(RcSmartAuditResponse rcSmartAuditResponse) {
		this.rcSmartAuditResponse = rcSmartAuditResponse;
	}
	public RcSmartAuditResponse getRcSmartAuditResponse( ) {
		return this.rcSmartAuditResponse;
	}

}
