package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.ccm.sw.library.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-19 15:46:41
 */
public class AlipayIserviceCcmSwLibraryCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4183681781521778966L;

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
