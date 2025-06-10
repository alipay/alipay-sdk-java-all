package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.WhitehatInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.afsrc.whitehatinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:33
 */
public class AlipaySecurityProdAfsrcWhitehatinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6782841411742463823L;

	/** 
	 * 白帽子信息
	 */
	@ApiField("data")
	private WhitehatInfo data;

	public void setData(WhitehatInfo data) {
		this.data = data;
	}
	public WhitehatInfo getData( ) {
		return this.data;
	}

}
