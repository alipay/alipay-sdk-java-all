package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.autocheck.case.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:41:19
 */
public class AlipayOpenMiniAutocheckCaseCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2284811462393961457L;

	/** 
	 * 用例ID
	 */
	@ApiField("case_id")
	private String caseId;

	public void setCaseId(String caseId) {
		this.caseId = caseId;
	}
	public String getCaseId( ) {
		return this.caseId;
	}

}
