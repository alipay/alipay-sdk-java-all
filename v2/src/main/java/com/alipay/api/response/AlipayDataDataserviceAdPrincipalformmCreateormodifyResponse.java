package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.ad.principalformm.createormodify response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-14 10:07:25
 */
public class AlipayDataDataserviceAdPrincipalformmCreateormodifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4217716429557454849L;

	/** 
	 * 灯火商家信息唯一键id
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
