package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.ccm.sw.treecategory.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-11 16:13:23
 */
public class AlipayIserviceCcmSwTreecategoryCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5363237945899711686L;

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
