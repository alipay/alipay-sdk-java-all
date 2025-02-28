package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 非标准输入输出openid接口
 *
 * @author auto create
 * @since 1.0, 2020-08-03 20:34:10
 */
public class AlipayOpenAppOpenbizmockOpenidnonstandQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8179216689861442331L;

	/**
	 * 请求
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
