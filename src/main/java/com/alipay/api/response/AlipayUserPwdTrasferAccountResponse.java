package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.pwd.trasfer.account response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayUserPwdTrasferAccountResponse extends AlipayResponse {

	private static final long serialVersionUID = 2658212562488412734L;

	/** 
	 * 12
	 */
	@ApiField("accorder")
	private String accorder;

	public void setAccorder(String accorder) {
		this.accorder = accorder;
	}
	public String getAccorder( ) {
		return this.accorder;
	}

}
