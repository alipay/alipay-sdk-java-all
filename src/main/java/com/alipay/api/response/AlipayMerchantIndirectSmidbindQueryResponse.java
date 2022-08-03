package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.indirect.smidbind.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-07-13 19:26:45
 */
public class AlipayMerchantIndirectSmidbindQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1455388253415468481L;

	/** 
	 * 确认状态，枚举：已确认（AUTHORIZED）/未确认（UNAUTHORIZED）/已销户（CLOSED）
	 */
	@ApiField("check_result")
	private String checkResult;

	public void setCheckResult(String checkResult) {
		this.checkResult = checkResult;
	}
	public String getCheckResult( ) {
		return this.checkResult;
	}

}
