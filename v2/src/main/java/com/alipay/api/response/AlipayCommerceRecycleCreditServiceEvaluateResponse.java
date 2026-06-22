package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.recycle.credit.service.evaluate response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-30 10:37:43
 */
public class AlipayCommerceRecycleCreditServiceEvaluateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5453962634637341865L;

	/** 
	 * 是否准入（true 表示准入，false 表示不准入）
	 */
	@ApiField("permit")
	private Boolean permit;

	/** 
	 * 预授权金额比例（如 "30" 表示 30%，通常以字符串形式表示百分比数值）
	 */
	@ApiField("pre_settlement_ratio")
	private String preSettlementRatio;

	/** 
	 * 信用取评估单号
	 */
	@ApiField("risk_order_no")
	private String riskOrderNo;

	public void setPermit(Boolean permit) {
		this.permit = permit;
	}
	public Boolean getPermit( ) {
		return this.permit;
	}

	public void setPreSettlementRatio(String preSettlementRatio) {
		this.preSettlementRatio = preSettlementRatio;
	}
	public String getPreSettlementRatio( ) {
		return this.preSettlementRatio;
	}

	public void setRiskOrderNo(String riskOrderNo) {
		this.riskOrderNo = riskOrderNo;
	}
	public String getRiskOrderNo( ) {
		return this.riskOrderNo;
	}

}
