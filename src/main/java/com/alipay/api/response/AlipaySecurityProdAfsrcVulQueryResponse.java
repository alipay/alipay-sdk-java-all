package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.VulInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.afsrc.vul.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 02:29:32
 */
public class AlipaySecurityProdAfsrcVulQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1284331819413596817L;

	/** 
	 * 漏洞信息
	 */
	@ApiField("data")
	private VulInfo data;

	public void setData(VulInfo data) {
		this.data = data;
	}
	public VulInfo getData( ) {
		return this.data;
	}

}
