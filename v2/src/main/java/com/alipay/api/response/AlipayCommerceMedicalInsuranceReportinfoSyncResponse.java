package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.insurance.reportinfo.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-04 11:22:26
 */
public class AlipayCommerceMedicalInsuranceReportinfoSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6718352782346132948L;

	/** 
	 * 结果数据
	 */
	@ApiField("result_data")
	private Boolean resultData;

	public void setResultData(Boolean resultData) {
		this.resultData = resultData;
	}
	public Boolean getResultData( ) {
		return this.resultData;
	}

}
