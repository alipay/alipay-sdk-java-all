package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.logistics.station.cooperation.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-20 13:42:54
 */
public class AlipayCommerceLogisticsStationCooperationModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4368568985513528545L;

	/** 
	 * 事件类型
	 */
	@ApiField("event_type")
	private String eventType;

	/** 
	 * 驿站品牌标识
	 */
	@ApiField("station_brand_id")
	private String stationBrandId;

	/** 
	 * 驿站平台侧门店id, 对应入参
	 */
	@ApiField("station_shop_id")
	private String stationShopId;

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}
	public String getEventType( ) {
		return this.eventType;
	}

	public void setStationBrandId(String stationBrandId) {
		this.stationBrandId = stationBrandId;
	}
	public String getStationBrandId( ) {
		return this.stationBrandId;
	}

	public void setStationShopId(String stationShopId) {
		this.stationShopId = stationShopId;
	}
	public String getStationShopId( ) {
		return this.stationShopId;
	}

}
