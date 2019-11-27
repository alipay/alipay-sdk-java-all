package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.certify.indentity.verify.consult response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayUserCertifyIndentityVerifyConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 6731924419327352674L;

	/** 
	 * * 00  公民身份号码与姓名一致，且存在照片，返回匹配
* 01  公民身份号码与姓名一致，但不存在照片，返回匹配
* 02  公民身份号码存在，但与姓名不匹配，返回不匹配
* 03  公民身份号码不存在，返回没有此人
* 04  其他错误，返回第三方错误，比如公安网系统异常等错误
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
