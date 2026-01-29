package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.finance.precreate response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-28 11:12:42
 */
public class AlipayTradeFinancePrecreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7356628756582358593L;

	/** 
	 * SUCCESS 成功
ACCEPT_SUCCESS 受理成功
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 支付宝快收单号
	 */
	@ApiField("settlement_no")
	private String settlementNo;

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setSettlementNo(String settlementNo) {
		this.settlementNo = settlementNo;
	}
	public String getSettlementNo( ) {
		return this.settlementNo;
	}

}
