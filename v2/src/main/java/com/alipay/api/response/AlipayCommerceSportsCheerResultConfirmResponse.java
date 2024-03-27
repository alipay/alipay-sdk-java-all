package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.sports.cheer.result.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-27 10:26:03
 */
public class AlipayCommerceSportsCheerResultConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 8395493656937413843L;

	/** 
	 * 用户流水号
	 */
	@ApiField("game_serial_number")
	private String gameSerialNumber;

	public void setGameSerialNumber(String gameSerialNumber) {
		this.gameSerialNumber = gameSerialNumber;
	}
	public String getGameSerialNumber( ) {
		return this.gameSerialNumber;
	}

}
