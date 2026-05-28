package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.insurance.tpadirectpayquota.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-11 15:27:45
 */
public class AlipayCommerceMedicalInsuranceTpadirectpayquotaQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1576927742339422735L;

	/** 
	 * 基金额度（单位：元）保留两位小数
	 */
	@ApiField("quota")
	private String quota;

	public void setQuota(String quota) {
		this.quota = quota;
	}
	public String getQuota( ) {
		return this.quota;
	}

}
