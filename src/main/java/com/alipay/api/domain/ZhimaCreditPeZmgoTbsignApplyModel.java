package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻GO签约申请pcap服务
 *
 * @author auto create
 * @since 1.0, 2021-05-11 20:29:05
 */
public class ZhimaCreditPeZmgoTbsignApplyModel extends AlipayObject {

	private static final long serialVersionUID = 1757668555229621789L;

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
