package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.chat.gname.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 04:55:28
 */
public class AlipaySocialBaseChatGnameModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8153136619945187599L;

	/** 
	 * 修改结果
	 */
	@ApiField("result_modify")
	private Boolean resultModify;

	public void setResultModify(Boolean resultModify) {
		this.resultModify = resultModify;
	}
	public Boolean getResultModify( ) {
		return this.resultModify;
	}

}
