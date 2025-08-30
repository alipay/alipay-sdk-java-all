package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RainyComplexTypesTheThirteen;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.schemthirtyfifth.rainystest.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-20 16:47:28
 */
public class AlipayDataDataserviceSchemthirtyfifthRainystestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3235832936951669791L;

	/** 
	 * 测试数据
	 */
	@ApiField("demo_ref")
	private RainyComplexTypesTheThirteen demoRef;

	/** 
	 * 测试数据，无需关注；
	 */
	@ApiField("demo_str_1")
	private String demoStr1;

	/** 
	 * 测试数据，无需关注；
	 */
	@ApiField("demo_str_2")
	private String demoStr2;

	public void setDemoRef(RainyComplexTypesTheThirteen demoRef) {
		this.demoRef = demoRef;
	}
	public RainyComplexTypesTheThirteen getDemoRef( ) {
		return this.demoRef;
	}

	public void setDemoStr1(String demoStr1) {
		this.demoStr1 = demoStr1;
	}
	public String getDemoStr1( ) {
		return this.demoStr1;
	}

	public void setDemoStr2(String demoStr2) {
		this.demoStr2 = demoStr2;
	}
	public String getDemoStr2( ) {
		return this.demoStr2;
	}

}
