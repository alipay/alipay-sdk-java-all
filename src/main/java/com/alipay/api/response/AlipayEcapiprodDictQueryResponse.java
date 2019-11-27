package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ecapiprod.dict.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayEcapiprodDictQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4517362278265596745L;

	/** 
	 * 常量具体数据
	 */
	@ApiField("categorys")
	private String categorys;

	public void setCategorys(String categorys) {
		this.categorys = categorys;
	}
	public String getCategorys( ) {
		return this.categorys;
	}

}
