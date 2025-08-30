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
 * @since 1.0, 2024-07-04 15:51:36
 */
public class AlipayInsUnderwriteClaimReportQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2276886476356444596L;

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
