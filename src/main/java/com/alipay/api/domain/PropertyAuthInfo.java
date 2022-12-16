package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小区物业用户认证信息
 *
 * @author auto create
 * @since 1.0, 2019-03-20 15:17:55
 */
public class PropertyAuthInfo extends AlipayObject {

	private static final long serialVersionUID = 7125268222394951364L;

	/**
	 * 小区所在区县
	 */
	@ApiField("area")
	private String area;

	/**
	 * 小区所在城市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 小区名称
	 */
	@ApiField("community")
	private String community;

	/**
	 * 认证信息ID（ISV提供，作为修改、删除唯一标识）
	 */
	@ApiField("data_id")
	private String dataId;

	/**
	 * 小区纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 小区经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 物业公司
	 */
	@ApiField("property")
	private String property;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("uid")
	private String uid;

	public String getArea() {
		return this.area;
	}
	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getCommunity() {
		return this.community;
	}
	public void setCommunity(String community) {
		this.community = community;
	}

	public String getDataId() {
		return this.dataId;
	}
	public void setDataId(String dataId) {
		this.dataId = dataId;
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

	public String getProperty() {
		return this.property;
	}
	public void setProperty(String property) {
		this.property = property;
	}

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

}
