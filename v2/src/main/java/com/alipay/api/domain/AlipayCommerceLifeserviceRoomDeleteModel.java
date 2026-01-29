package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场地删除
 *
 * @author auto create
 * @since 1.0, 2026-01-26 16:02:42
 */
public class AlipayCommerceLifeserviceRoomDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 4481162835667998911L;

	/**
	 * 三方场地id【需保证唯一性】
	 */
	@ApiField("out_room_id")
	private String outRoomId;

	/**
	 * 场地id【和out_room_id二选一】
	 */
	@ApiField("room_id")
	private String roomId;

	/**
	 * 蚂蚁门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getOutRoomId() {
		return this.outRoomId;
	}
	public void setOutRoomId(String outRoomId) {
		this.outRoomId = outRoomId;
	}

	public String getRoomId() {
		return this.roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
