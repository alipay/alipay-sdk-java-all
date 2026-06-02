package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝会员等级权益通用查询(需授权）
 *
 * @author auto create
 * @since 1.0, 2026-03-23 20:12:10
 */
public class AlipayUserPrivilegeSkillQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4342942523462734164L;

	/**
	 * 支付宝用户的地理位置信息
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 用户经纬度信息之精度信息
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 用户lbs信息之维度信息
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 未来用于兼容获取特权摘要信息与详情信息
	 */
	@ApiField("mode")
	private String mode;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return this.longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getMode() {
		return this.mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
