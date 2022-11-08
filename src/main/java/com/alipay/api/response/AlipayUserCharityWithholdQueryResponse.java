package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.charity.withhold.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-10-24 15:41:49
 */
public class AlipayUserCharityWithholdQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3144128796969148823L;

	/** 
	 * 代扣结果 WITHHOLD_INPROCESS 代扣中 WITHHOLD_SUCCESS 代扣成功 WITHHOLD_FAIL 代扣失败
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 爱心捐赠的交易流水号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
