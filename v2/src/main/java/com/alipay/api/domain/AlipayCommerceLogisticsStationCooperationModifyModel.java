package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 驿站取消小件员的驿站门店合作关系
 *
 * @author auto create
 * @since 1.0, 2024-01-26 10:15:40
 */
public class AlipayCommerceLogisticsStationCooperationModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5114268379574293999L;

	/**
	 * 事件类型
	 */
	@ApiField("event_type")
	private String eventType;

	/**
	 * open_id是用户（UserId）在应用（AppId）下的唯一用户标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 驿站品牌标识
	 */
	@ApiField("station_brand_id")
	private String stationBrandId;

	/**
	 * 驿站平台侧门店id
	 */
	@ApiField("station_shop_id")
	private String stationShopId;

	/**
	 * 驿站平台侧用户id
	 */
	@ApiField("station_user_id")
	private String stationUserId;

	/**
	 * 用户支付宝uid
	 */
	@ApiField("user_id")
	private String userId;

	public String getEventType() {
		return this.eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getStationBrandId() {
		return this.stationBrandId;
	}
	public void setStationBrandId(String stationBrandId) {
		this.stationBrandId = stationBrandId;
	}

	public String getStationShopId() {
		return this.stationShopId;
	}
	public void setStationShopId(String stationShopId) {
		this.stationShopId = stationShopId;
	}

	public String getStationUserId() {
		return this.stationUserId;
	}
	public void setStationUserId(String stationUserId) {
		this.stationUserId = stationUserId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
