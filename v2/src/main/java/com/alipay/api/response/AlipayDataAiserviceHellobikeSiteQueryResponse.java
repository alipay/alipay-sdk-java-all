package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.SiteResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.aiservice.hellobike.site.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:49
 */
public class AlipayDataAiserviceHellobikeSiteQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6667265781926221836L;

	/** 
	 * 结果
	 */
	@ApiField("result")
	private SiteResult result;

	public void setResult(SiteResult result) {
		this.result = result;
	}
	public SiteResult getResult( ) {
		return this.result;
	}

}
