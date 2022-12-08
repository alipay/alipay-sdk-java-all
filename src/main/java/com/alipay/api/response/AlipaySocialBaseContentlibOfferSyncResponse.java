package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.contentlib.offer.sync response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 04:11:58
 */
public class AlipaySocialBaseContentlibOfferSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6385845745128853367L;

	/** 
	 * 返回数据放在这里，使用json
	 */
	@ApiField("content")
	private String content;

	/** 
	 * 是否成功
	 */
	@ApiField("success")
	private Boolean success;

	public void setContent(String content) {
		this.content = content;
	}
	public String getContent( ) {
		return this.content;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
