package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.account.negativecard.send response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:38:00
 */
public class AlipayUserAccountNegativecardSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 6155878463877237975L;

	/** 
	 * 结果码。SUCCESS：发送成功。
	 */
	@ApiField("result_code")
	private String resultCode;

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

}
