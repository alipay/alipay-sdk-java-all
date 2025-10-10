package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.parking.fee.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-21 10:22:36
 */
public class AlipayCommerceTransportParkingFeeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7251272488347979575L;

	/** 
	 * 停车场收费规则图片
	 */
	@ApiField("charging_rule_img_url")
	private String chargingRuleImgUrl;

	/** 
	 * 停车场收费规则
	 */
	@ApiField("charging_rule_text")
	private String chargingRuleText;

	/** 
	 * 停车费优惠信息
	 */
	@ApiField("discount_info")
	private String discountInfo;

	/** 
	 * 高德地图POI
	 */
	@ApiField("gaode_map_poi")
	private String gaodeMapPoi;

	/** 
	 * 停车场经纬度
	 */
	@ApiField("gaode_map_poi_latitude")
	private String gaodeMapPoiLatitude;

	/** 
	 * 停车场经纬度
	 */
	@ApiField("gaode_map_poi_longitude")
	private String gaodeMapPoiLongitude;

	/** 
	 * 入场时间，标准时间格式
	 */
	@ApiField("in_place_time")
	private Date inPlaceTime;

	/** 
	 * 停车时长，单位会自动转换成x小时x分钟
	 */
	@ApiField("park_duration_time")
	private String parkDurationTime;

	/** 
	 * 停车场地址
	 */
	@ApiField("parking_lot_address")
	private String parkingLotAddress;

	/** 
	 * 停车场名称
	 */
	@ApiField("parking_lot_name")
	private String parkingLotName;

	/** 
	 * 缴费链接
	 */
	@ApiField("pay_url")
	private String payUrl;

	/** 
	 * 停车费金额
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public void setChargingRuleImgUrl(String chargingRuleImgUrl) {
		this.chargingRuleImgUrl = chargingRuleImgUrl;
	}
	public String getChargingRuleImgUrl( ) {
		return this.chargingRuleImgUrl;
	}

	public void setChargingRuleText(String chargingRuleText) {
		this.chargingRuleText = chargingRuleText;
	}
	public String getChargingRuleText( ) {
		return this.chargingRuleText;
	}

	public void setDiscountInfo(String discountInfo) {
		this.discountInfo = discountInfo;
	}
	public String getDiscountInfo( ) {
		return this.discountInfo;
	}

	public void setGaodeMapPoi(String gaodeMapPoi) {
		this.gaodeMapPoi = gaodeMapPoi;
	}
	public String getGaodeMapPoi( ) {
		return this.gaodeMapPoi;
	}

	public void setGaodeMapPoiLatitude(String gaodeMapPoiLatitude) {
		this.gaodeMapPoiLatitude = gaodeMapPoiLatitude;
	}
	public String getGaodeMapPoiLatitude( ) {
		return this.gaodeMapPoiLatitude;
	}

	public void setGaodeMapPoiLongitude(String gaodeMapPoiLongitude) {
		this.gaodeMapPoiLongitude = gaodeMapPoiLongitude;
	}
	public String getGaodeMapPoiLongitude( ) {
		return this.gaodeMapPoiLongitude;
	}

	public void setInPlaceTime(Date inPlaceTime) {
		this.inPlaceTime = inPlaceTime;
	}
	public Date getInPlaceTime( ) {
		return this.inPlaceTime;
	}

	public void setParkDurationTime(String parkDurationTime) {
		this.parkDurationTime = parkDurationTime;
	}
	public String getParkDurationTime( ) {
		return this.parkDurationTime;
	}

	public void setParkingLotAddress(String parkingLotAddress) {
		this.parkingLotAddress = parkingLotAddress;
	}
	public String getParkingLotAddress( ) {
		return this.parkingLotAddress;
	}

	public void setParkingLotName(String parkingLotName) {
		this.parkingLotName = parkingLotName;
	}
	public String getParkingLotName( ) {
		return this.parkingLotName;
	}

	public void setPayUrl(String payUrl) {
		this.payUrl = payUrl;
	}
	public String getPayUrl( ) {
		return this.payUrl;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getTotalAmount( ) {
		return this.totalAmount;
	}

}
