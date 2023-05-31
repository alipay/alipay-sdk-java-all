package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AddTagResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.scode.elede.sign response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 07:07:18
 */
public class AntMerchantExpandScodeEledeSignResponse extends AlipayResponse {

	private static final long serialVersionUID = 7586538554251671685L;

	/** 
	 * 打标接口返回结果
	 */
	@ApiField("add_tag_response")
	private AddTagResponse addTagResponse;

	public void setAddTagResponse(AddTagResponse addTagResponse) {
		this.addTagResponse = addTagResponse;
	}
	public AddTagResponse getAddTagResponse( ) {
		return this.addTagResponse;
	}

}
