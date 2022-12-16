package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.UpdateCodeResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.scode.modify response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 10:43:15
 */
public class AntMerchantExpandScodeModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6286543881913847543L;

	/** 
	 * 更新码值返回结果
	 */
	@ApiField("update_code_response")
	private UpdateCodeResponse updateCodeResponse;

	public void setUpdateCodeResponse(UpdateCodeResponse updateCodeResponse) {
		this.updateCodeResponse = updateCodeResponse;
	}
	public UpdateCodeResponse getUpdateCodeResponse( ) {
		return this.updateCodeResponse;
	}

}
