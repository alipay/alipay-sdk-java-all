package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.treeapitenth.rainystest.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-02-27 14:42:24
 */
public class AlipayDataDataserviceTreeapitenthRainystestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1655922115631166796L;

	/** 
	 * 测试数据
	 */
	@ApiField("demo_case")
	private String demoCase;

	public void setDemoCase(String demoCase) {
		this.demoCase = demoCase;
	}
	public String getDemoCase( ) {
		return this.demoCase;
	}

}
