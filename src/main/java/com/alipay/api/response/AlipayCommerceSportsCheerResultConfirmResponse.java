package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.sports.cheer.result.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2021-05-14 13:40:20
 */
public class AlipayCommerceSportsCheerResultConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 6877193944665535317L;

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
