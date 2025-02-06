package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询芝麻GO模板信息
 *
 * @author auto create
 * @since 1.0, 2024-10-16 11:34:08
 */
public class AlipayPcreditHuabeiMobileauthTemplateQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5245197917744124429L;

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
