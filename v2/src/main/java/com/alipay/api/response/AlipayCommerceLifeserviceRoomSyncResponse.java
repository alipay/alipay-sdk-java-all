package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.lifeservice.room.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-15 19:27:45
 */
public class AlipayCommerceLifeserviceRoomSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 1387151946497238878L;

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
