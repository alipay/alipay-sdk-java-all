package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.equity.instpoint.prizeexchange.use response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:29:04
 */
public class AntfortuneEquityInstpointPrizeexchangeUseResponse extends AlipayResponse {

	private static final long serialVersionUID = 2578336831263321811L;

	/** 
	 * 积分兑换奖品结果。
INIT:  申请中，可能成功，可能失败。需要使用相同的out_biz_no重试判定结果，一般2分钟内会判定处理结果
FAIL:  兑换失败
SUCCESS：兑换成功
	 */
	@ApiField("exchange_result")
	private String exchangeResult;

	/** 
	 * 积分兑换奖品流水。幂等返回结果时，流水号相同
	 */
	@ApiField("exchange_trans_no")
	private String exchangeTransNo;

	public void setExchangeResult(String exchangeResult) {
		this.exchangeResult = exchangeResult;
	}
	public String getExchangeResult( ) {
		return this.exchangeResult;
	}

	public void setExchangeTransNo(String exchangeTransNo) {
		this.exchangeTransNo = exchangeTransNo;
	}
	public String getExchangeTransNo( ) {
		return this.exchangeTransNo;
	}

}
