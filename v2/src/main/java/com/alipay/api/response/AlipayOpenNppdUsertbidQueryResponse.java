package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.nppd.usertbid.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-27 13:57:40
 */
public class AlipayOpenNppdUsertbidQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3624171629592413917L;

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
