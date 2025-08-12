package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataexchange.schemaapithirtyfouth.rainstest.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-10 17:47:30
 */
public class AlipayDataDataexchangeSchemaapithirtyfouthRainstestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7837152157436894148L;

	/** 
	 * 测试数据无需关注
	 */
	@ApiField("demo")
	private String demo;

	/** 
	 * 测试数据无需关注
	 */
	@ApiField("open_id")
	private String openId;

	public void setDemo(String demo) {
		this.demo = demo;
	}
	public String getDemo( ) {
		return this.demo;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

}
