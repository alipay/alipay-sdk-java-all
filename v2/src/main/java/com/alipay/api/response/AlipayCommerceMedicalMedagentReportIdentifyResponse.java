package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ReportResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.medagent.report.identify response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-10 16:35:09
 */
public class AlipayCommerceMedicalMedagentReportIdentifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3642319828265482982L;

	/** 
	 * 报告识别结果
	 */
	@ApiField("data")
	private ReportResult data;

	public void setData(ReportResult data) {
		this.data = data;
	}
	public ReportResult getData( ) {
		return this.data;
	}

}
