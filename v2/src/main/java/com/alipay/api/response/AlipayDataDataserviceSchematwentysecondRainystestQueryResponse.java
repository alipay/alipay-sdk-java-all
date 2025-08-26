package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RainyComplexTypesTheFourth;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.schematwentysecond.rainystest.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-18 23:02:19
 */
public class AlipayDataDataserviceSchematwentysecondRainystestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3768775345724937579L;

	/** 
	 * 测试数据
	 */
	@ApiField("demo_case")
	private String demoCase;

	/** 
	 * 出参测试数据
	 */
	@ApiField("firstlevel_ref")
	private RainyComplexTypesTheFourth firstlevelRef;

	/** 
	 * 测试数据，第一层的N选一
	 */
	@ApiField("firstlevel_string_1")
	private String firstlevelString1;

	/** 
	 * 测试数据，第一层的N选一
	 */
	@ApiField("firstlevel_string_2")
	private String firstlevelString2;

	public void setDemoCase(String demoCase) {
		this.demoCase = demoCase;
	}
	public String getDemoCase( ) {
		return this.demoCase;
	}

	public void setFirstlevelRef(RainyComplexTypesTheFourth firstlevelRef) {
		this.firstlevelRef = firstlevelRef;
	}
	public RainyComplexTypesTheFourth getFirstlevelRef( ) {
		return this.firstlevelRef;
	}

	public void setFirstlevelString1(String firstlevelString1) {
		this.firstlevelString1 = firstlevelString1;
	}
	public String getFirstlevelString1( ) {
		return this.firstlevelString1;
	}

	public void setFirstlevelString2(String firstlevelString2) {
		this.firstlevelString2 = firstlevelString2;
	}
	public String getFirstlevelString2( ) {
		return this.firstlevelString2;
	}

}
