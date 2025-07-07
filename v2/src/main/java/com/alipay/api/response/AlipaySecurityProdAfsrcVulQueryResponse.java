package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.VulInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.afsrc.vul.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-27 14:51:08
 */
public class AlipaySecurityProdAfsrcVulQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4827548154475974891L;

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
