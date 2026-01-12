package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.hm.tokencheck.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-28 10:57:41
 */
public class AlipayCommerceMedicalHmTokencheckQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6549883971485919785L;

	/** 
	 * 健管人员id, token有效的场景才会返回
	 */
	@ApiField("hmuid")
	private String hmuid;

	public void setHmuid(String hmuid) {
		this.hmuid = hmuid;
	}
	public String getHmuid( ) {
		return this.hmuid;
	}

}
