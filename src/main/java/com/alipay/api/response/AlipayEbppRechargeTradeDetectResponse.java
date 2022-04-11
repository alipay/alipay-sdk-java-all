package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.recharge.trade.detect response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 10:12:31
 */
public class AlipayEbppRechargeTradeDetectResponse extends AlipayResponse {

	private static final long serialVersionUID = 7229143685516133883L;

	/** 
	 * 手机号绑定的userId是否有充值记录。
	 */
	@ApiField("check_result")
	private Boolean checkResult;

	public void setCheckResult(Boolean checkResult) {
		this.checkResult = checkResult;
	}
	public Boolean getCheckResult( ) {
		return this.checkResult;
	}

}
