package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻GO签约咨询pcap服务
 *
 * @author auto create
 * @since 1.0, 2022-11-14 15:40:15
 */
public class ZhimaCreditPeZmgoTbsignConsultModel extends AlipayObject {

	private static final long serialVersionUID = 6137176126198653959L;

	/**
	 * 请求参数，其中paramContent的值为base64编码串
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
