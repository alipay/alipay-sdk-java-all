package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询芝麻GO模板信息
 *
 * @author auto create
 * @since 1.0, 2020-06-12 14:48:23
 */
public class AlipayPcreditHuabeiMobileauthTemplateQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2657244862945289449L;

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
