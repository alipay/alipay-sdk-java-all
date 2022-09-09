package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.indirect.smidbind.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-09-05 14:21:44
 */
public class AlipayMerchantIndirectSmidbindQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3373487545824128464L;

	/** 
	 * 确认状态，枚举：已确认（AUTHORIZED）/未确认（UNAUTHORIZED）/已销户（CLOSED）/smid不存在（SMID_NOT_EXIST）
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
