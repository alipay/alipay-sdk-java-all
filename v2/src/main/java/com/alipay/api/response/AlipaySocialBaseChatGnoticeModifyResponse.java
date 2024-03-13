package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.chat.gnotice.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 01:42:27
 */
public class AlipaySocialBaseChatGnoticeModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3156368321714312313L;

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
