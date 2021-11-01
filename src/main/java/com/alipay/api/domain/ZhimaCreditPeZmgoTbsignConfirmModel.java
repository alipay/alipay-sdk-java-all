package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻GO签约确认pacp服务
 *
 * @author auto create
 * @since 1.0, 2021-05-11 20:28:50
 */
public class ZhimaCreditPeZmgoTbsignConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 3869889826672572595L;

	/**
	 * 请求参数，其中paramContent为base64编码串
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
