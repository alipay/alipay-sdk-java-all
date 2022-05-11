package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RemoveTagResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.scode.elede.unsign response.
 * 
 * @author auto create
 * @since 1.0, 2020-06-15 10:49:33
 */
public class AntMerchantExpandScodeEledeUnsignResponse extends AlipayResponse {

	private static final long serialVersionUID = 5624854427923423412L;

	/** 
	 * 去标返回结果
	 */
	@ApiField("remove_tag_response")
	private RemoveTagResponse removeTagResponse;

	public void setRemoveTagResponse(RemoveTagResponse removeTagResponse) {
		this.removeTagResponse = removeTagResponse;
	}
	public RemoveTagResponse getRemoveTagResponse( ) {
		return this.removeTagResponse;
	}

}
