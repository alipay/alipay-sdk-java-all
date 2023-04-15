package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.antest.alipayversion.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 03:00:43
 */
public class AlipayCommerceAntestAlipayversionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2745162143473543266L;

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
