package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 预定信息
 *
 * @author auto create
 * @since 1.0, 2026-01-23 14:41:45
 */
public class LifeServiceBookInfo extends AlipayObject {

	private static final long serialVersionUID = 1147339897515836583L;

	/**
	 * 预定id
	 */
	@ApiField("book_id")
	private String bookId;

	/**
	 * 预定的包厢信息
	 */
	@ApiListField("room_infos")
	@ApiField("life_service_room_info")
	private List<LifeServiceRoomInfo> roomInfos;

	/**
	 * 预定的门店信息
	 */
	@ApiField("shop_info")
	private LifeServiceShopInfo shopInfo;

	public String getBookId() {
		return this.bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public List<LifeServiceRoomInfo> getRoomInfos() {
		return this.roomInfos;
	}
	public void setRoomInfos(List<LifeServiceRoomInfo> roomInfos) {
		this.roomInfos = roomInfos;
	}

	public LifeServiceShopInfo getShopInfo() {
		return this.shopInfo;
	}
	public void setShopInfo(LifeServiceShopInfo shopInfo) {
		this.shopInfo = shopInfo;
	}

}
