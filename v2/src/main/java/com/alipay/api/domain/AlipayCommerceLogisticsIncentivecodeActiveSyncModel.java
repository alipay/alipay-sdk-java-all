package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 寄件激励码绑码激活信息同步
 *
 * @author auto create
 * @since 1.0, 2025-06-25 20:47:42
 */
public class AlipayCommerceLogisticsIncentivecodeActiveSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8497177533792476294L;

	/**
	 * 码值绑定时位置的区
	 */
	@ApiField("active_area")
	private String activeArea;

	/**
	 * 码值绑定时位置的城市
	 */
	@ApiField("active_city")
	private String activeCity;

	/**
	 * 码值绑定主体对应的支付宝用户id
	 */
	@ApiField("active_code_open_id")
	private String activeCodeOpenId;

	/**
	 * 码值绑定主体对应的支付宝用户id
	 */
	@ApiField("active_code_user_id")
	private String activeCodeUserId;

	/**
	 * 码值绑定时位置的详细地址
	 */
	@ApiField("active_detail_address")
	private String activeDetailAddress;

	/**
	 * 码值绑定时位置的纬度，单位：度
	 */
	@ApiField("active_latitude")
	private String activeLatitude;

	/**
	 * 码值绑定时位置的经度，单位：度
	 */
	@ApiField("active_longitude")
	private String activeLongitude;

	/**
	 * 码值绑定时位置的省份
	 */
	@ApiField("active_province")
	private String activeProvince;

	/**
	 * 码值绑定时位置的街道
	 */
	@ApiField("active_street")
	private String activeStreet;

	/**
	 * 用于传入的时间，标准时间格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("active_time")
	private Date activeTime;

	/**
	 * EXPRESSMAN 代表快递员
STATION 代表驿站
	 */
	@ApiField("active_type")
	private String activeType;

	/**
	 * 用于标识激励码
	 */
	@ApiField("incentive_code")
	private String incentiveCode;

	/**
	 * 商户标识（接口调用方的渠道编码，由支付宝分配）
	 */
	@ApiField("logistics_code")
	private String logisticsCode;

	public String getActiveArea() {
		return this.activeArea;
	}
	public void setActiveArea(String activeArea) {
		this.activeArea = activeArea;
	}

	public String getActiveCity() {
		return this.activeCity;
	}
	public void setActiveCity(String activeCity) {
		this.activeCity = activeCity;
	}

	public String getActiveCodeOpenId() {
		return this.activeCodeOpenId;
	}
	public void setActiveCodeOpenId(String activeCodeOpenId) {
		this.activeCodeOpenId = activeCodeOpenId;
	}

	public String getActiveCodeUserId() {
		return this.activeCodeUserId;
	}
	public void setActiveCodeUserId(String activeCodeUserId) {
		this.activeCodeUserId = activeCodeUserId;
	}

	public String getActiveDetailAddress() {
		return this.activeDetailAddress;
	}
	public void setActiveDetailAddress(String activeDetailAddress) {
		this.activeDetailAddress = activeDetailAddress;
	}

	public String getActiveLatitude() {
		return this.activeLatitude;
	}
	public void setActiveLatitude(String activeLatitude) {
		this.activeLatitude = activeLatitude;
	}

	public String getActiveLongitude() {
		return this.activeLongitude;
	}
	public void setActiveLongitude(String activeLongitude) {
		this.activeLongitude = activeLongitude;
	}

	public String getActiveProvince() {
		return this.activeProvince;
	}
	public void setActiveProvince(String activeProvince) {
		this.activeProvince = activeProvince;
	}

	public String getActiveStreet() {
		return this.activeStreet;
	}
	public void setActiveStreet(String activeStreet) {
		this.activeStreet = activeStreet;
	}

	public Date getActiveTime() {
		return this.activeTime;
	}
	public void setActiveTime(Date activeTime) {
		this.activeTime = activeTime;
	}

	public String getActiveType() {
		return this.activeType;
	}
	public void setActiveType(String activeType) {
		this.activeType = activeType;
	}

	public String getIncentiveCode() {
		return this.incentiveCode;
	}
	public void setIncentiveCode(String incentiveCode) {
		this.incentiveCode = incentiveCode;
	}

	public String getLogisticsCode() {
		return this.logisticsCode;
	}
	public void setLogisticsCode(String logisticsCode) {
		this.logisticsCode = logisticsCode;
	}

}
