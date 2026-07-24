package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 公交地铁乘车卡查询接口
 *
 * @author auto create
 * @since 1.0, 2026-03-16 19:37:43
 */
public class AlipayCommerceTransportTrafficcardsCardQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1254437831454527397L;

	/**
	 * 需要查询乘车码的城市编码，参考中华人民共和国行政区划编码，仅支持市级维度
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 需要查询乘车码的城市名称，支持模糊匹配，是否以市结尾均可
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 用户当前纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 用户当前经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 支付宝用户id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 用户当前提问文本
	 */
	@ApiField("query")
	private String query;

	/**
	 * 乘车卡场景，BUS代表只查询公交，METRO代表只查询地铁，空则默认查询所有场景
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 字符串类型，标识请求来源，固定大写例如千问：QWEN
	 */
	@ApiField("source")
	private String source;

	/**
	 * 支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCityName() {
		return this.cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
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

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getQuery() {
		return this.query;
	}
	public void setQuery(String query) {
		this.query = query;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
