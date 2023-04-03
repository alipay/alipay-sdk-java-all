package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RemoveTagResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.scode.elede.unsign response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 00:26:46
 */
public class AntMerchantExpandScodeEledeUnsignResponse extends AlipayResponse {

	private static final long serialVersionUID = 2222657412324911817L;

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
