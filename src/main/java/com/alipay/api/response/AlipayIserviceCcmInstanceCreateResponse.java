package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.ccm.instance.create response.
 * 
 * @author auto create
 * @since 1.0, 2020-12-10 18:00:14
 */
public class AlipayIserviceCcmInstanceCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7832158476195675837L;

	/** 
	 * 租户实例（数据权限）ID
	 */
	@ApiField("id")
	private String id;

	public void setId(String id) {
		this.id = id;
	}
	public String getId( ) {
		return this.id;
	}

}
