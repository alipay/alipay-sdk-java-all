package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InsClaimReport;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.underwrite.claim.report.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-03-13 17:30:37
 */
public class AlipayInsUnderwriteClaimReportQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8531373786194585488L;

	/** 
	 * 案件信息
	 */
	@ApiListField("reports")
	@ApiField("ins_claim_report")
	private List<InsClaimReport> reports;

	public void setReports(List<InsClaimReport> reports) {
		this.reports = reports;
	}
	public List<InsClaimReport> getReports( ) {
		return this.reports;
	}

}
