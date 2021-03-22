package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.ccm.sw.knowledge.modify response.
 * 
 * @author auto create
 * @since 1.0, 2020-11-20 15:26:18
 */
public class AlipayIserviceCcmSwKnowledgeModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2183328933821682176L;

	/** 
	 * 知识点ID
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
