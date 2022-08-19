package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 车主搜索项
 *
 * @author auto create
 * @since 1.0, 2021-12-03 20:00:04
 */
public class VehSearchItem extends AlipayObject {

	private static final long serialVersionUID = 3283899235988388719L;

	/**
	 * 地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 业务id
例:biz_scene为PARKING_SERVICE时,biz_id为支付宝唯一车场id
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 业务场景
暂只支持PARKING_SERVICE(附近停车场)
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 距离，单位为米
	 */
	@ApiField("distance")
	private String distance;

	/**
	 * 纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 高德地图的poiid
	 */
	@ApiField("poi_id")
	private String poiId;

	/**
	 * 支持服务列表
	 */
	@ApiListField("support_service_list")
	@ApiField("veh_service_item")
	private List<VehServiceItem> supportServiceList;

	/**
	 * 剩余停车位。
业务场景为PARKING_SERVICE时才可能有值。
	 */
	@ApiField("surplus_parking_space")
	private String surplusParkingSpace;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getDistance() {
		return this.distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
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

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPoiId() {
		return this.poiId;
	}
	public void setPoiId(String poiId) {
		this.poiId = poiId;
	}

	public List<VehServiceItem> getSupportServiceList() {
		return this.supportServiceList;
	}
	public void setSupportServiceList(List<VehServiceItem> supportServiceList) {
		this.supportServiceList = supportServiceList;
	}

	public String getSurplusParkingSpace() {
		return this.surplusParkingSpace;
	}
	public void setSurplusParkingSpace(String surplusParkingSpace) {
		this.surplusParkingSpace = surplusParkingSpace;
	}

}
