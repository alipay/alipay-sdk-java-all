package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.ccm.sw.tree.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-10-26 15:11:54
 */
public class AlipayIserviceCcmSwTreeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3898195431548514124L;

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
