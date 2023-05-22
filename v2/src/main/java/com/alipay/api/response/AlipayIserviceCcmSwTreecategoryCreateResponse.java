package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.ccm.sw.treecategory.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 19:11:51
 */
public class AlipayIserviceCcmSwTreecategoryCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2879436316889636243L;

	/** 
	 * 节点ID
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
