package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.mobileauth.sign.apply response.
 * 
 * @author auto create
 * @since 1.0, 2021-10-26 22:26:36
 */
public class AlipayPcreditHuabeiMobileauthSignApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4482158556551599437L;

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
