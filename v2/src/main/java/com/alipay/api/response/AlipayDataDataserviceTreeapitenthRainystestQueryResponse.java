package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.treeapitenth.rainystest.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-18 23:02:10
 */
public class AlipayDataDataserviceTreeapitenthRainystestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5492695332157346246L;

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
