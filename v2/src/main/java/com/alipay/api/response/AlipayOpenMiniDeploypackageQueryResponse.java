package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.deploypackage.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 09:51:53
 */
public class AlipayOpenMiniDeploypackageQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3227634181854392872L;

	/** 
	 * 包数据
	 */
	@ApiField("pack_json")
	private String packJson;

	public void setPackJson(String packJson) {
		this.packJson = packJson;
	}
	public String getPackJson( ) {
		return this.packJson;
	}

}
