package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.nppd.usertbid.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-31 10:22:23
 */
public class AlipayOpenNppdUsertbidQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6491159152721822256L;

	/** 
	 * 淘宝ID
	 */
	@ApiField("tb_id")
	private String tbId;

	public void setTbId(String tbId) {
		this.tbId = tbId;
	}
	public String getTbId( ) {
		return this.tbId;
	}

}
