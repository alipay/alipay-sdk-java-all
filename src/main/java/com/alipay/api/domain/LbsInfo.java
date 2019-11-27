package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * lbs信息
 *
 * @author auto create
 * @since 1.0, 2017-04-06 20:41:37
 */
public class LbsInfo extends AlipayObject {

	private static final long serialVersionUID = 5893238499591793886L;

	/**
	 * 精度
以保留小数点后两位
	 */
	@ApiField("accuracy")
	private String accuracy;

	/**
	 * 海拔
保留小数点后两位
	 */
	@ApiField("altitude")
	private String altitude;

	/**
	 * 经度；最长15位字符（包括小数点）， 注：高德坐标系。录入时请确保经纬度参数准确。高德经纬度查询：http://lbs.amap.com/console/show/picker
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 纬度；最长15位字符（包括小数点）， 注：高德坐标系。录入时请确保经纬度参数准确。高德经纬度查询：http://lbs.amap.com/console/show/picker
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 时间函数,从1970年1月1日开始计算,单位为秒
	 */
	@ApiField("time")
	private String time;

	public String getAccuracy() {
		return this.accuracy;
	}
	public void setAccuracy(String accuracy) {
		this.accuracy = accuracy;
	}

	public String getAltitude() {
		return this.altitude;
	}
	public void setAltitude(String altitude) {
		this.altitude = altitude;
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

	public String getTime() {
		return this.time;
	}
	public void setTime(String time) {
		this.time = time;
	}

}
