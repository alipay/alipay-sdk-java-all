package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: aft.aifin.fireeye.mytest.image.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-11 15:11:06
 */
public class AftAifinFireeyeMytestImageQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8711222928229843241L;

	/** 
	 * 识别结果
	 */
	@ApiField("content")
	private String content;

	/** 
	 * 识别成功or失败
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
