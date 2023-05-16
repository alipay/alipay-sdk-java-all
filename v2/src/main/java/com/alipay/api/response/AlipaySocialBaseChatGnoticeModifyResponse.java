package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.chat.gnotice.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 00:27:25
 */
public class AlipaySocialBaseChatGnoticeModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6132182915932644116L;

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
