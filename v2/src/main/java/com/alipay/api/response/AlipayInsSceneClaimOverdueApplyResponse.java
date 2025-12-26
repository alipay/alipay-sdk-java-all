package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.claim.overdue.apply response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-05 18:12:41
 */
public class AlipayInsSceneClaimOverdueApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2372624666389554157L;

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
