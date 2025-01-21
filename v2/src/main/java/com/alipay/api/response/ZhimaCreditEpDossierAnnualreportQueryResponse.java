package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ZmepAnnualReportDataInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.annualreport.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-20 16:32:25
 */
public class ZhimaCreditEpDossierAnnualreportQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3455786271985992936L;

	/** 
	 * 数据结果
	 */
	@ApiField("data")
	private ZmepAnnualReportDataInfo data;

	public void setData(ZmepAnnualReportDataInfo data) {
		this.data = data;
	}
	public ZmepAnnualReportDataInfo getData( ) {
		return this.data;
	}

}
