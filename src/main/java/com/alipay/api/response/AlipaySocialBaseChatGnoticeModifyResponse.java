package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.chat.gnotice.modify response.
 * 
 * @author auto create
 * @since 1.0, 2021-12-22 00:06:09
 */
public class AlipaySocialBaseChatGnoticeModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7473298895815732915L;

	/** 
	 * 修改结果
	 */
	@ApiField("result_modify")
	private String resultModify;

	public void setResultModify(String resultModify) {
		this.resultModify = resultModify;
	}
	public String getResultModify( ) {
		return this.resultModify;
	}

}
