package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.HomeApiResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.itask.order.record.sync response.
 * 
 * @author auto create
 * @since 1.0, 2020-09-04 19:10:11
 */
public class AlipayIserviceItaskOrderRecordSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 1281728324159339284L;

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
