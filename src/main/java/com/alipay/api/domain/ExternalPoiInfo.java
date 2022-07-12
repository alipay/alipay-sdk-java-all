package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外部POI信息
 *
 * @author auto create
 * @since 1.0, 2020-11-12 19:50:21
 */
public class ExternalPoiInfo extends AlipayObject {

	private static final long serialVersionUID = 6644946757854328139L;

	/**
	 * 地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 实例对应的ID
	 */
	@ApiField("entity_id")
	private String entityId;

	/**
	 * 实体对应的类型
	 */
	@ApiField("entity_type")
	private String entityType;

	/**
	 * 数据库主键
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 维度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 地理地址的备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 高德地图Point of Interest
	 */
	@ApiField("poi")
	private String poi;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getEntityId() {
		return this.entityId;
	}
	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}

	public String getEntityType() {
		return this.entityType;
	}
	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
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

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getPoi() {
		return this.poi;
	}
	public void setPoi(String poi) {
		this.poi = poi;
	}

}
