package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.account.device.info.upload response.
 * 
 * @author auto create
 * @since 1.0, 2021-08-30 15:44:19
 */
public class AlipayUserAccountDeviceInfoUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 3219342494364736456L;

	/** 
	 * 结果码
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
