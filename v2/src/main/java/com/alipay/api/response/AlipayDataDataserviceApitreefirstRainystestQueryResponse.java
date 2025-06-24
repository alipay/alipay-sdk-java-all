package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RainyComplexTypesTheFifteen;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.apitreefirst.rainystest.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-22 15:27:23
 */
public class AlipayDataDataserviceApitreefirstRainystestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8798753117178843836L;

	/** 
	 * 复杂类型无参数
	 */
	@ApiField("demo_response")
	private RainyComplexTypesTheFifteen demoResponse;

	public void setDemoResponse(RainyComplexTypesTheFifteen demoResponse) {
		this.demoResponse = demoResponse;
	}
	public RainyComplexTypesTheFifteen getDemoResponse( ) {
		return this.demoResponse;
	}

}
