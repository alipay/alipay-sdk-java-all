package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 三方应用调智能助理
 *
 * @author auto create
 * @since 1.0, 2022-10-11 16:20:02
 */
public class AlipayIserviceItaskOrderRecordSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8612155312541659315L;

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
