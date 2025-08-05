package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.ccm.sw.tree.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 14:10:04
 */
public class AlipayIserviceCcmSwTreeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3571257355368533866L;

	/** 
	 * 类目ID
	 */
	@ApiField("id")
	private Long id;

	public void setId(Long id) {
		this.id = id;
	}
	public Long getId( ) {
		return this.id;
	}

}
