package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.recruit.settlement.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-17 16:17:23
 */
public class AlipayEbppIndustryRecruitSettlementSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 7479493996437165355L;

	/** 
	 * 支付宝结算id
	 */
	@ApiField("settlement_id")
	private String settlementId;

	public void setSettlementId(String settlementId) {
		this.settlementId = settlementId;
	}
	public String getSettlementId( ) {
		return this.settlementId;
	}

}
