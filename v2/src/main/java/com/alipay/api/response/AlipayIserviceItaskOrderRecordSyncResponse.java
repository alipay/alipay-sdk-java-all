package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.HomeApiResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.itask.order.record.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 19:34:30
 */
public class AlipayIserviceItaskOrderRecordSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4633779554597345595L;

	/** 
	 * 返回结果
	 */
	@ApiField("home_api_response")
	private HomeApiResponse homeApiResponse;

	public void setHomeApiResponse(HomeApiResponse homeApiResponse) {
		this.homeApiResponse = homeApiResponse;
	}
	public HomeApiResponse getHomeApiResponse( ) {
		return this.homeApiResponse;
	}

}
