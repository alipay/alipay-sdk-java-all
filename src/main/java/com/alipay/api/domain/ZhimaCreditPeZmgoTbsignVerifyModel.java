package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻GO签约核身pcap服务
 *
 * @author auto create
 * @since 1.0, 2021-05-11 20:29:33
 */
public class ZhimaCreditPeZmgoTbsignVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 2289727555585859258L;

	/**
	 * 请求参数，其中paramContent是base64编码串
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
