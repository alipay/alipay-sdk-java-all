package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询芝麻GO模板信息（带协议信息）
 *
 * @author auto create
 * @since 1.0, 2021-09-29 17:26:03
 */
public class AlipayPcreditHuabeiMobileauthTemplatetextQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1593175939274918687L;

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
