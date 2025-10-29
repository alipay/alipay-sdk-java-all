package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.claim.overdue.apply response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-24 09:57:41
 */
public class AlipayInsSceneClaimOverdueApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1451914748459978283L;

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
