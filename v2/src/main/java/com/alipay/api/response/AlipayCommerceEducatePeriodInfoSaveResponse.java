package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.period.info.save response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-09 10:02:29
 */
public class AlipayCommerceEducatePeriodInfoSaveResponse extends AlipayResponse {

	private static final long serialVersionUID = 2387565373237268957L;

	/** 
	 * 课时ID
	 */
	@ApiField("period_id")
	private String periodId;

	public void setPeriodId(String periodId) {
		this.periodId = periodId;
	}
	public String getPeriodId( ) {
		return this.periodId;
	}

}
