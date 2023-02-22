package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.chat.ginv.send response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-05 10:25:42
 */
public class AlipaySocialBaseChatGinvSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 3729834315326688223L;

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
