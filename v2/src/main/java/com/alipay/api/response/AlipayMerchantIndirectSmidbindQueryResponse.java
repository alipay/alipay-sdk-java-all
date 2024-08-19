package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.indirect.smidbind.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-10 14:05:36
 */
public class AlipayMerchantIndirectSmidbindQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1556672131636753948L;

	/** 
	 * 确认状态，枚举：已完成确认（AUTHORIZED）/未完成确认（UNAUTHORIZED）/已销户（CLOSED）/sub_merchant_id不存在（SMID_NOT_EXIST）
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
