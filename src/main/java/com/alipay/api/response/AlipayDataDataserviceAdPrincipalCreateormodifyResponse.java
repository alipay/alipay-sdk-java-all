package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.ad.principal.createormodify response.
 * 
 * @author auto create
 * @since 1.0, 2021-09-27 14:23:22
 */
public class AlipayDataDataserviceAdPrincipalCreateormodifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1416765315734329795L;

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
