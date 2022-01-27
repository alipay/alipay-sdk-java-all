package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻GO签约确认服务
 *
 * @author auto create
 * @since 1.0, 2021-10-26 22:26:15
 */
public class AlipayPcreditHuabeiMobileauthSignConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 4781683993219146323L;

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
