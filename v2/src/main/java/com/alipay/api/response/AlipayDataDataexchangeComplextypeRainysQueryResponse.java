package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RainyComplexTypesTheSecond;
import com.alipay.api.domain.RainyComplexTypesTheFirst;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataexchange.complextype.rainys.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-25 15:12:03
 */
public class AlipayDataDataexchangeComplextypeRainysQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5399188139592472669L;

	/** 
	 * 12
	 */
	@ApiField("references_test_a")
	private RainyComplexTypesTheSecond referencesTestA;

	/** 
	 * 引用同迭代的复杂类型
	 */
	@ApiField("references_test_b")
	private RainyComplexTypesTheFirst referencesTestB;

	public void setReferencesTestA(RainyComplexTypesTheSecond referencesTestA) {
		this.referencesTestA = referencesTestA;
	}
	public RainyComplexTypesTheSecond getReferencesTestA( ) {
		return this.referencesTestA;
	}

	public void setReferencesTestB(RainyComplexTypesTheFirst referencesTestB) {
		this.referencesTestB = referencesTestB;
	}
	public RainyComplexTypesTheFirst getReferencesTestB( ) {
		return this.referencesTestB;
	}

}
