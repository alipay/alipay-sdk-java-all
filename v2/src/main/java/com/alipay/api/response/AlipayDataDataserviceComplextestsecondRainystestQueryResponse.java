package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RainyComplexTypesTheFourth;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.complextestsecond.rainystest.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-02-14 15:12:23
 */
public class AlipayDataDataserviceComplextestsecondRainystestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6268512538752975984L;

	/** 
	 * 测试数据
	 */
	@ApiField("response_case")
	private RainyComplexTypesTheFourth responseCase;

	public void setResponseCase(RainyComplexTypesTheFourth responseCase) {
		this.responseCase = responseCase;
	}
	public RainyComplexTypesTheFourth getResponseCase( ) {
		return this.responseCase;
	}

}
