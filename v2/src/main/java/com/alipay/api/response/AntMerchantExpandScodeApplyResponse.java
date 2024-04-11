package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ApplyCodeResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.scode.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 00:33:21
 */
public class AntMerchantExpandScodeApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3571556263583285584L;

	/** 
	 * apply_code_response, S码申请的结果对象
	 */
	@ApiField("apply_code_response")
	private ApplyCodeResponse applyCodeResponse;

	public void setApplyCodeResponse(ApplyCodeResponse applyCodeResponse) {
		this.applyCodeResponse = applyCodeResponse;
	}
	public ApplyCodeResponse getApplyCodeResponse( ) {
		return this.applyCodeResponse;
	}

}
