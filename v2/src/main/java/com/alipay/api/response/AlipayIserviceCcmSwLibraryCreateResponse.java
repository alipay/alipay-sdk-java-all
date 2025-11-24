package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.ccm.sw.library.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-14 12:02:38
 */
public class AlipayIserviceCcmSwLibraryCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3486397827634264675L;

	/** 
	 * 知识库Id
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
