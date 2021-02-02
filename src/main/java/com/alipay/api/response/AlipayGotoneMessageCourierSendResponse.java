package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.gotone.message.courier.send response.
 * 
 * @author auto create
 * @since 1.0, 2020-11-17 10:45:01
 */
public class AlipayGotoneMessageCourierSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 1838133166428149556L;

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
