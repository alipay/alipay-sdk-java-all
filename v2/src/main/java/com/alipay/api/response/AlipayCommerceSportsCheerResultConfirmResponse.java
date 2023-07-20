package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.sports.cheer.result.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 01:58:28
 */
public class AlipayCommerceSportsCheerResultConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 6165351866541333438L;

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
