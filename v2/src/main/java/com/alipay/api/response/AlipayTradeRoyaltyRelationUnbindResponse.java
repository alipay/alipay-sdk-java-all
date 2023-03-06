package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.royalty.relation.unbind response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-13 16:24:19
 */
public class AlipayTradeRoyaltyRelationUnbindResponse extends AlipayResponse {

	private static final long serialVersionUID = 2889634147291871717L;

	/** 
	 * 业务结果码。SUCCESS：分账关系解绑成功；
FAIL：分账关系解绑失败。
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
