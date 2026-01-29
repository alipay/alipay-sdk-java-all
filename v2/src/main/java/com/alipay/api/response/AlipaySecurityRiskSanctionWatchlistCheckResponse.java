package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PBCScanResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.sanction.watchlist.check response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-15 15:12:41
 */
public class AlipaySecurityRiskSanctionWatchlistCheckResponse extends AlipayResponse {

	private static final long serialVersionUID = 1393153527147967999L;

	/** 
	 * 人行制裁扫描返回结果
	 */
	@ApiField("pbc_scan_result")
	private PBCScanResult pbcScanResult;

	public void setPbcScanResult(PBCScanResult pbcScanResult) {
		this.pbcScanResult = pbcScanResult;
	}
	public PBCScanResult getPbcScanResult( ) {
		return this.pbcScanResult;
	}

}
