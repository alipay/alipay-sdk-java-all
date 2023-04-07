package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.prod.antlegalchain.ndapress.urge response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 08:16:44
 */
public class AlipayBossProdAntlegalchainNdapressUrgeResponse extends AlipayResponse {

	private static final long serialVersionUID = 1519191288197338173L;

	/** 
	 * 催签结果，true表示催签成功，异常表示催签失败
	 */
	@ApiField("press_status")
	private Boolean pressStatus;

	public void setPressStatus(Boolean pressStatus) {
		this.pressStatus = pressStatus;
	}
	public Boolean getPressStatus( ) {
		return this.pressStatus;
	}

}
