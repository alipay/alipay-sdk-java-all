package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.antest.appversion.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 23:44:43
 */
public class AlipayCommerceAntestAppversionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8593325921837171196L;

	/** 
	 * 版本号
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
