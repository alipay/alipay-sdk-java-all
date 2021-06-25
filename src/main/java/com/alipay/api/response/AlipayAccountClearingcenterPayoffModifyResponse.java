package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ClearingCommonResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.account.clearingcenter.payoff.modify response.
 * 
 * @author auto create
 * @since 1.0, 2020-06-28 09:59:12
 */
public class AlipayAccountClearingcenterPayoffModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6518452638966843779L;

	/** 
	 * 返回结果
	 */
	@ApiField("result")
	private ClearingCommonResult result;

	public void setResult(ClearingCommonResult result) {
		this.result = result;
	}
	public ClearingCommonResult getResult( ) {
		return this.result;
	}

}
