package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.royalty.relation.bind response.
 * 
 * @author auto create
 * @since 1.0, 2021-09-18 09:48:42
 */
public class AlipayTradeRoyaltyRelationBindResponse extends AlipayResponse {

	private static final long serialVersionUID = 5343514711413998443L;

	/** 
	 * SUCCESS：分账关系绑定成功；
FAIL：分账关系绑定失败。
	 */
	@ApiField("result_code")
	private String resultCode;

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

}
