package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AddTagResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.scode.elede.sign response.
 * 
 * @author auto create
 * @since 1.0, 2020-06-15 10:49:23
 */
public class AntMerchantExpandScodeEledeSignResponse extends AlipayResponse {

	private static final long serialVersionUID = 7593346675478579615L;

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
