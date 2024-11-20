package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.contentlib.offer.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-12 16:07:21
 */
public class AlipaySocialBaseContentlibOfferSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 7164954852573578273L;

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
