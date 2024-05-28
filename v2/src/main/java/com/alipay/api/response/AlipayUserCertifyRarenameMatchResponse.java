package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.certify.rarename.match response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:27:41
 */
public class AlipayUserCertifyRarenameMatchResponse extends AlipayResponse {

	private static final long serialVersionUID = 3896998371763848579L;

	/** 
	 * 业务结果码，取值: IS_SAME_RARE_NAME(姓名相同), NOT_SAME_RARE_NAME(姓名不相同), POSSIBLE_SAME_RARE_NAME(可能相同)
	 */
	@ApiField("ret_code")
	private String retCode;

	public void setRetCode(String retCode) {
		this.retCode = retCode;
	}
	public String getRetCode( ) {
		return this.retCode;
	}

}
