package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BrandAuthQueryOpenApiResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.brand.auth.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-16 14:27:42
 */
public class AlipayOpenBrandAuthQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7761737526414358653L;

	/** 
	 * null
	 */
	@ApiListField("result")
	@ApiField("brand_auth_query_open_api_result")
	private List<BrandAuthQueryOpenApiResult> result;

	public void setResult(List<BrandAuthQueryOpenApiResult> result) {
		this.result = result;
	}
	public List<BrandAuthQueryOpenApiResult> getResult( ) {
		return this.result;
	}

}
