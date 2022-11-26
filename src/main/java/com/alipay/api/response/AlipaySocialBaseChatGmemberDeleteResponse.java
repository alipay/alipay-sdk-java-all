package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.chat.gmember.delete response.
 * 
 * @author auto create
 * @since 1.0, 2021-12-22 00:05:19
 */
public class AlipaySocialBaseChatGmemberDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 6698211984581546767L;

	/** 
	 * 删除结果
	 */
	@ApiField("result_delete")
	private Boolean resultDelete;

	public void setResultDelete(Boolean resultDelete) {
		this.resultDelete = resultDelete;
	}
	public Boolean getResultDelete( ) {
		return this.resultDelete;
	}

}
