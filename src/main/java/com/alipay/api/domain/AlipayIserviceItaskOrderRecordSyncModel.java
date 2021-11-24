package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 三方应用调智能助理
 *
 * @author auto create
 * @since 1.0, 2021-11-03 14:50:16
 */
public class AlipayIserviceItaskOrderRecordSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7521662875688483338L;

	/**
	 * 首页助理openapi请求入参
	 */
	@ApiField("home_api_request")
	private HomeApiRequest homeApiRequest;

	public HomeApiRequest getHomeApiRequest() {
		return this.homeApiRequest;
	}
	public void setHomeApiRequest(HomeApiRequest homeApiRequest) {
		this.homeApiRequest = homeApiRequest;
	}

}
