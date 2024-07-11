package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询芝麻GO模板信息
 *
 * @author auto create
 * @since 1.0, 2024-03-20 16:30:34
 */
public class AlipayPcreditHuabeiMobileauthTemplateQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5436196927829886196L;

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
