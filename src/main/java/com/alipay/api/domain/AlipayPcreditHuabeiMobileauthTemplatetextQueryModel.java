package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询芝麻GO模板信息（带协议信息）
 *
 * @author auto create
 * @since 1.0, 2021-11-19 14:43:52
 */
public class AlipayPcreditHuabeiMobileauthTemplatetextQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1842311936816925474L;

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
