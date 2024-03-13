package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小区大楼信息同步
 *
 * @author auto create
 * @since 1.0, 2018-06-25 14:53:23
 */
public class AlipayEcoRenthouseCommunityBaseinfoSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1323984241963646257L;

	/**
	 * 商圈编码
	 */
	@ApiField("bus_code")
	private String busCode;

	/**
	 * 商圈所在纬度
	 */
	@ApiField("bus_lat")
	private String busLat;

	/**
	 * 商圈所在经度
	 */
	@ApiField("bus_lng")
	private String busLng;

	/**
	 * 商圈名称
	 */
	@ApiField("bus_name")
	private String busName;

	/**
	 * 商圈覆盖半径(单位:米)
	 */
	@ApiField("bus_radius")
	private Long busRadius;

	/**
	 * 城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 城市所在纬度
	 */
	@ApiField("city_lat")
	private String cityLat;

	/**
	 * 城市所在经度
	 */
	@ApiField("city_lng")
	private String cityLng;

	/**
	 * 城市名称
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 小区/大楼编码
	 */
	@ApiField("community_code")
	private String communityCode;

	/**
	 * 小区/大楼所在纬度
	 */
	@ApiField("community_lat")
	private String communityLat;

	/**
	 * 小区/大楼所在经度
	 */
	@ApiField("community_lng")
	private String communityLng;

	/**
	 * 小区/大楼名称
	 */
	@ApiField("community_name")
	private String communityName;

	/**
	 * 小区/大楼弄号
	 */
	@ApiField("community_nong")
	private String communityNong;

	/**
	 * 小区/大楼街道
	 */
	@ApiField("community_street")
	private String communityStreet;

	/**
	 * 小区/大楼标识类型 1：小区  2:大楼
	 */
	@ApiField("community_tag")
	private String communityTag;

	/**
	 * 行政区域编码
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 行政区域所在纬度
	 */
	@ApiField("district_lat")
	private String districtLat;

	/**
	 * 行政区域所在经度
	 */
	@ApiField("district_lng")
	private String districtLng;

	/**
	 * 行政区域名称
	 */
	@ApiField("district_name")
	private String districtName;

	/**
	 * 地铁线地铁站关系
	 */
	@ApiListField("subway_stations")
	@ApiField("string")
	private List<String> subwayStations;

	public String getBusCode() {
		return this.busCode;
	}
	public void setBusCode(String busCode) {
		this.busCode = busCode;
	}

	public String getBusLat() {
		return this.busLat;
	}
	public void setBusLat(String busLat) {
		this.busLat = busLat;
	}

	public String getBusLng() {
		return this.busLng;
	}
	public void setBusLng(String busLng) {
		this.busLng = busLng;
	}

	public String getBusName() {
		return this.busName;
	}
	public void setBusName(String busName) {
		this.busName = busName;
	}

	public Long getBusRadius() {
		return this.busRadius;
	}
	public void setBusRadius(Long busRadius) {
		this.busRadius = busRadius;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCityLat() {
		return this.cityLat;
	}
	public void setCityLat(String cityLat) {
		this.cityLat = cityLat;
	}

	public String getCityLng() {
		return this.cityLng;
	}
	public void setCityLng(String cityLng) {
		this.cityLng = cityLng;
	}

	public String getCityName() {
		return this.cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCommunityCode() {
		return this.communityCode;
	}
	public void setCommunityCode(String communityCode) {
		this.communityCode = communityCode;
	}

	public String getCommunityLat() {
		return this.communityLat;
	}
	public void setCommunityLat(String communityLat) {
		this.communityLat = communityLat;
	}

	public String getCommunityLng() {
		return this.communityLng;
	}
	public void setCommunityLng(String communityLng) {
		this.communityLng = communityLng;
	}

	public String getCommunityName() {
		return this.communityName;
	}
	public void setCommunityName(String communityName) {
		this.communityName = communityName;
	}

	public String getCommunityNong() {
		return this.communityNong;
	}
	public void setCommunityNong(String communityNong) {
		this.communityNong = communityNong;
	}

	public String getCommunityStreet() {
		return this.communityStreet;
	}
	public void setCommunityStreet(String communityStreet) {
		this.communityStreet = communityStreet;
	}

	public String getCommunityTag() {
		return this.communityTag;
	}
	public void setCommunityTag(String communityTag) {
		this.communityTag = communityTag;
	}

	public String getDistrictCode() {
		return this.districtCode;
	}
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public String getDistrictLat() {
		return this.districtLat;
	}
	public void setDistrictLat(String districtLat) {
		this.districtLat = districtLat;
	}

	public String getDistrictLng() {
		return this.districtLng;
	}
	public void setDistrictLng(String districtLng) {
		this.districtLng = districtLng;
	}

	public String getDistrictName() {
		return this.districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public List<String> getSubwayStations() {
		return this.subwayStations;
	}
	public void setSubwayStations(List<String> subwayStations) {
		this.subwayStations = subwayStations;
	}

}
