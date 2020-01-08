package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.contentlib.offer.sync response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-31 14:21:37
 */
public class AlipaySocialBaseContentlibOfferSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2618587364126722234L;

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
