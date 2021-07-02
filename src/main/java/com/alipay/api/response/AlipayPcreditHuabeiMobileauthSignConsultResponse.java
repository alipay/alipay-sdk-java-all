package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.mobileauth.sign.consult response.
 * 
 * @author auto create
 * @since 1.0, 2021-04-13 15:40:01
 */
public class AlipayPcreditHuabeiMobileauthSignConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 3829877528254252417L;

	/** 
	 * 模板查询返回JSON信息，参考 PcreditAuthSignApplyResult
	 */
	@ApiField("result")
	private String result;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
