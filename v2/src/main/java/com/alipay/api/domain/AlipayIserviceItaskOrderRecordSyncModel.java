package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 三方应用调智能助理
 *
 * @author auto create
 * @since 1.0, 2023-10-09 14:11:34
 */
public class AlipayIserviceItaskOrderRecordSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8888747124471536536L;

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
