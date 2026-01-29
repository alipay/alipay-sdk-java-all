package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.lifeservice.room.delete response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-26 16:02:42
 */
public class AlipayCommerceLifeserviceRoomDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 5896783377989613834L;

	/** 
	 * 场地id
	 */
	@ApiField("room_id")
	private String roomId;

	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}
	public String getRoomId( ) {
		return this.roomId;
	}

}
