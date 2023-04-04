package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.WhitehatInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.afsrc.whitehatinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-09-29 11:44:02
 */
public class AlipaySecurityProdAfsrcWhitehatinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5754123852726935545L;

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
