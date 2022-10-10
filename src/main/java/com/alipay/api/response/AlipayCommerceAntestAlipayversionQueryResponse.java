package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.antest.alipayversion.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-12-08 21:28:56
 */
public class AlipayCommerceAntestAlipayversionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5297111567215361558L;

	/** 
	 * 支付宝版本
	 */
	@ApiListField("data")
	@ApiField("string")
	private List<String> data;

	public void setData(List<String> data) {
		this.data = data;
	}
	public List<String> getData( ) {
		return this.data;
	}

}
