package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MinRate;
import com.alipay.api.domain.RoomInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.hotel.minprice.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-13 14:02:41
 */
public class AlipayCommerceTransportHotelMinpriceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3138476685596922666L;

	/** 
	 * 支付宝聚合酒店id
	 */
	@ApiField("hotel_id")
	private String hotelId;

	/** 
	 * null
	 */
	@ApiListField("min_rates")
	@ApiField("min_rate")
	private List<MinRate> minRates;

	/** 
	 * null
	 */
	@ApiListField("room_infos")
	@ApiField("room_info")
	private List<RoomInfo> roomInfos;

	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}
	public String getHotelId( ) {
		return this.hotelId;
	}

	public void setMinRates(List<MinRate> minRates) {
		this.minRates = minRates;
	}
	public List<MinRate> getMinRates( ) {
		return this.minRates;
	}

	public void setRoomInfos(List<RoomInfo> roomInfos) {
		this.roomInfos = roomInfos;
	}
	public List<RoomInfo> getRoomInfos( ) {
		return this.roomInfos;
	}

}
