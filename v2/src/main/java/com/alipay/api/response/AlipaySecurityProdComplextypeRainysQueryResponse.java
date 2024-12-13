package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RainyComplexTypesTheSecond;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.complextype.rainys.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:21:19
 */
public class AlipaySecurityProdComplextypeRainysQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6558324193955146893L;

	/** 
	 * 引用同迭代的复杂类型
	 */
	@ApiField("references_test_a")
	private RainyComplexTypesTheSecond referencesTestA;

	public void setReferencesTestA(RainyComplexTypesTheSecond referencesTestA) {
		this.referencesTestA = referencesTestA;
	}
	public RainyComplexTypesTheSecond getReferencesTestA( ) {
		return this.referencesTestA;
	}

}
