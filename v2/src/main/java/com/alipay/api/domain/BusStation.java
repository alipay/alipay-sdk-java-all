package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 汽车票站点
 *
 * @author auto create
 * @since 1.0, 2025-01-13 14:46:19
 */
public class BusStation extends AlipayObject {

	private static final long serialVersionUID = 3227386587748412728L;

	/**
	 * 站点地址，参考高德地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 需要按照民政部标准：
<a href='https://www.mca.gov.cn/mzsj/xzqh/2023/202301xzqh.html'>民政部城市区县编码</a>
例如:110000（北京市）
	 */
	@ApiField("city_id")
	private Long cityId;

	/**
	 * 城市中文名称
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 需要按照民政部标准：
<a href='https://www.mca.gov.cn/mzsj/xzqh/2023/202301xzqh.html'>民政部城市区县编码</a>
例如杭州市部分区县：
区县id  名称							
330102	   上城区							
330105	   拱墅区							
330106	   西湖区							
330108	   滨江区							
330109	   萧山区
	 */
	@ApiField("county_id")
	private Long countyId;

	/**
	 * 区县中文名称
	 */
	@ApiField("county_name")
	private String countyName;

	/**
	 * 高德地图poiID, 需要渠道保证准确性。缺失poiID会影响渠道资源的匹配率。
缺失poiID，平台默认使用经纬度距离200米以内+同名的规则进行匹配。
	 */
	@ApiField("gaode_poiid")
	private String gaodePoiid;

	/**
	 * 站点纬度，统一用火星坐标系（参考高德）
需满足正则表达式：
^[+-]?([0-8]?\d(\.\d+)?|90(\.0+)?)$
	 */
	@ApiField("lat")
	private String lat;

	/**
	 * 站点经度，统一用火星坐标系（参考高德）
需满足正则表达式：
^[+-]?((180(\.0+)?|1[0-7]\d(\.\d+)?|[1-9]\d(\.\d+)?|\d(\.\d+)?))$
	 */
	@ApiField("lng")
	private String lng;

	/**
	 * 汽车站站点名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 渠道内部站点id，可用于汽车班次查询
	 */
	@ApiField("station_id")
	private String stationId;

	/**
	 * 站点类型
0:汽车站
1:普通站点
	 */
	@ApiField("station_type")
	private Long stationType;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public Long getCityId() {
		return this.cityId;
	}
	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return this.cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public Long getCountyId() {
		return this.countyId;
	}
	public void setCountyId(Long countyId) {
		this.countyId = countyId;
	}

	public String getCountyName() {
		return this.countyName;
	}
	public void setCountyName(String countyName) {
		this.countyName = countyName;
	}

	public String getGaodePoiid() {
		return this.gaodePoiid;
	}
	public void setGaodePoiid(String gaodePoiid) {
		this.gaodePoiid = gaodePoiid;
	}

	public String getLat() {
		return this.lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLng() {
		return this.lng;
	}
	public void setLng(String lng) {
		this.lng = lng;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getStationId() {
		return this.stationId;
	}
	public void setStationId(String stationId) {
		this.stationId = stationId;
	}

	public Long getStationType() {
		return this.stationType;
	}
	public void setStationType(Long stationType) {
		this.stationType = stationType;
	}

}
