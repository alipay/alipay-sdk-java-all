package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻GO签约核身安全服务化
 *
 * @author auto create
 * @since 1.0, 2020-06-12 14:47:25
 */
public class AlipayPcreditHuabeiMobileauthSignVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 3142859465457851424L;

	/**
	 * 请求参数
	 */
	@ApiField("request")
	private String request;

	public String getRequest() {
		return this.request;
	}
	public void setRequest(String request) {
		this.request = request;
	}

}
