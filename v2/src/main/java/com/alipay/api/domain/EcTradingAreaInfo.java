package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业码门店的商圈信息
 *
 * @author auto create
 * @since 1.0, 2024-07-11 10:34:30
 */
public class EcTradingAreaInfo extends AlipayObject {

	private static final long serialVersionUID = 5513323293432894397L;

	/**
	 * 商圈的地理位置信息
	 */
	@ApiField("location_info")
	private EcLocationInfo locationInfo;

	/**
	 * 商圈信息的唯一标识
	 */
	@ApiField("trading_area_id")
	private String tradingAreaId;

	/**
	 * 商圈名称信息
	 */
	@ApiField("trading_area_name")
	private String tradingAreaName;

	public EcLocationInfo getLocationInfo() {
		return this.locationInfo;
	}
	public void setLocationInfo(EcLocationInfo locationInfo) {
		this.locationInfo = locationInfo;
	}

	public String getTradingAreaId() {
		return this.tradingAreaId;
	}
	public void setTradingAreaId(String tradingAreaId) {
		this.tradingAreaId = tradingAreaId;
	}

	public String getTradingAreaName() {
		return this.tradingAreaName;
	}
	public void setTradingAreaName(String tradingAreaName) {
		this.tradingAreaName = tradingAreaName;
	}

}
