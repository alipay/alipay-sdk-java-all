package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ZmepAnnualReportDataInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.annualreport.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-16 13:52:41
 */
public class ZhimaCreditEpDossierAnnualreportQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3197693259968275586L;

	/** 
	 * 数据结果
	 */
	@ApiField("data")
	private ZmepAnnualReportDataInfo data;

	/** 
	 * 查得标记
	 */
	@ApiField("data_found")
	private Boolean dataFound;

	public void setData(ZmepAnnualReportDataInfo data) {
		this.data = data;
	}
	public ZmepAnnualReportDataInfo getData( ) {
		return this.data;
	}

	public void setDataFound(Boolean dataFound) {
		this.dataFound = dataFound;
	}
	public Boolean getDataFound( ) {
		return this.dataFound;
	}

}
