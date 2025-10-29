package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.claim.overdue.close response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-28 21:57:40
 */
public class AlipayInsSceneClaimOverdueCloseResponse extends AlipayResponse {

	private static final long serialVersionUID = 5583383562261856885L;

	/** 
	 * 追偿单号
	 */
	@ApiField("overdue_no")
	private String overdueNo;

	public void setOverdueNo(String overdueNo) {
		this.overdueNo = overdueNo;
	}
	public String getOverdueNo( ) {
		return this.overdueNo;
	}

}
