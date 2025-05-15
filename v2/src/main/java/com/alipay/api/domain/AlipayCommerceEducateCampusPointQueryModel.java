package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询指定城市的所有高校点位
 *
 * @author auto create
 * @since 1.0, 2025-04-24 10:58:34
 */
public class AlipayCommerceEducateCampusPointQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3263597117321415586L;

	/**
	 * 城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 校区名称模糊搜索关键字
	 */
	@ApiField("key_word")
	private String keyWord;

	/**
	 * 纬度 Latitude , 相当于 垂直 y 轴 的坐标 , 纬度的取值范围 -90 度 ~ + 90 度 ;
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 经度 Longitude , 本初子午线 位置 为 0 度经线 , 相当于水平 x 轴 的坐标 , 经度的取值范围 -180 度 ~ +180 度 ;
	 */
	@ApiField("longitude")
	private String longitude;

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getKeyWord() {
		return this.keyWord;
	}
	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
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

}
