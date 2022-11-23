package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻GO签约确认服务
 *
 * @author auto create
 * @since 1.0, 2022-11-14 16:35:33
 */
public class AlipayPcreditHuabeiMobileauthSignConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 4184866969194344643L;

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
