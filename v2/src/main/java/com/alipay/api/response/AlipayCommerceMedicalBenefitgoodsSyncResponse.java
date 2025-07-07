package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.benefitgoods.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-03 13:47:34
 */
public class AlipayCommerceMedicalBenefitgoodsSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4452577535897779732L;

	/** 
	 * 数据是否同步后台
	 */
	@ApiField("sync_result")
	private Boolean syncResult;

	public void setSyncResult(Boolean syncResult) {
		this.syncResult = syncResult;
	}
	public Boolean getSyncResult( ) {
		return this.syncResult;
	}

}
