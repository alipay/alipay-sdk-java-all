package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RainyComplexTypesRefWeakFirst;
import com.alipay.api.domain.RainyComplexTypesTheFirst;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataexchange.complextypefirst.rainystest.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-02 20:52:19
 */
public class AlipayDataDataexchangeComplextypefirstRainystestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5368373276964472135L;

	/** 
	 * 新创建的
	 */
	@ApiField("schema_response_01")
	private RainyComplexTypesRefWeakFirst schemaResponse01;

	/** 
	 * 引用已有的复杂类型
	 */
	@ApiField("schema_response_02")
	private RainyComplexTypesTheFirst schemaResponse02;

	public void setSchemaResponse01(RainyComplexTypesRefWeakFirst schemaResponse01) {
		this.schemaResponse01 = schemaResponse01;
	}
	public RainyComplexTypesRefWeakFirst getSchemaResponse01( ) {
		return this.schemaResponse01;
	}

	public void setSchemaResponse02(RainyComplexTypesTheFirst schemaResponse02) {
		this.schemaResponse02 = schemaResponse02;
	}
	public RainyComplexTypesTheFirst getSchemaResponse02( ) {
		return this.schemaResponse02;
	}

}
