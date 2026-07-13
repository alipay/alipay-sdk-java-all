package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PBCScanResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.sanction.watchlist.check response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-14 19:12:45
 */
public class AlipaySecurityRiskSanctionWatchlistCheckResponse extends AlipayResponse {

	private static final long serialVersionUID = 5517258657413749222L;

	/** 
	 * 可追溯响应ID
	 */
	@ApiField("open_trace_id")
	private String openTraceId;

	/** 
	 * 人行制裁扫描返回结果
	 */
	@ApiField("pbc_scan_result")
	private PBCScanResult pbcScanResult;

	public void setOpenTraceId(String openTraceId) {
		this.openTraceId = openTraceId;
	}
	public String getOpenTraceId( ) {
		return this.openTraceId;
	}

	public void setPbcScanResult(PBCScanResult pbcScanResult) {
		this.pbcScanResult = pbcScanResult;
	}
	public PBCScanResult getPbcScanResult( ) {
		return this.pbcScanResult;
	}

}
