package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.ad.principal.createormodify response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 02:11:06
 */
public class AlipayDataDataserviceAdPrincipalCreateormodifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7833344392997997252L;

	/** 
	 * 商家id
	 */
	@ApiField("principal_id")
	private Long principalId;

	public void setPrincipalId(Long principalId) {
		this.principalId = principalId;
	}
	public Long getPrincipalId( ) {
		return this.principalId;
	}

}
