package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ScenicAuditResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.data.scenic.mapping.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 08:29:22
 */
public class AlipayCommerceDataScenicMappingQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2378781774435954236L;

	/** 
	 * 景区审核信息查询结果
	 */
	@ApiField("scenic_audit_response")
	private ScenicAuditResponse scenicAuditResponse;

	public void setScenicAuditResponse(ScenicAuditResponse scenicAuditResponse) {
		this.scenicAuditResponse = scenicAuditResponse;
	}
	public ScenicAuditResponse getScenicAuditResponse( ) {
		return this.scenicAuditResponse;
	}

}
