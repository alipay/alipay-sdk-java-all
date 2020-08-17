package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻GO签约确认服务
 *
 * @author auto create
 * @since 1.0, 2020-06-12 14:47:06
 */
public class AlipayPcreditHuabeiMobileauthSignConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 3212746765998116943L;

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
