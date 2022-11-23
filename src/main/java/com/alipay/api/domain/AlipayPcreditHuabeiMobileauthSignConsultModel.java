package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻GO签约咨询服务
 *
 * @author auto create
 * @since 1.0, 2022-11-14 16:35:18
 */
public class AlipayPcreditHuabeiMobileauthSignConsultModel extends AlipayObject {

	private static final long serialVersionUID = 4298569232391538129L;

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
