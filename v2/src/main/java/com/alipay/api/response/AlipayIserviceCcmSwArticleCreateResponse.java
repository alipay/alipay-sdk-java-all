package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.ccm.sw.article.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-15 17:34:06
 */
public class AlipayIserviceCcmSwArticleCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5865689174855352418L;

	/** 
	 * 文章ID
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
