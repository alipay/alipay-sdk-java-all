package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.chat.ginv.send response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 06:02:56
 */
public class AlipaySocialBaseChatGinvSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 8384499814798598892L;

	/** 
	 * 结果提示信息
	 */
	@ApiField("result_tip")
	private String resultTip;

	public void setResultTip(String resultTip) {
		this.resultTip = resultTip;
	}
	public String getResultTip( ) {
		return this.resultTip;
	}

}
