package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.prod.antlegalchain.ndapress.urge response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-18 15:03:02
 */
public class AlipayBossProdAntlegalchainNdapressUrgeResponse extends AlipayResponse {

	private static final long serialVersionUID = 7424662367313141883L;

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
