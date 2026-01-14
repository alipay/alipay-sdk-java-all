package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 酒店最小价接口，房型详细信息
 *
 * @author auto create
 * @since 1.0, 2025-11-13 13:57:33
 */
public class RoomDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 4772219296417174635L;

	/**
	 * 房间面积，单位为平方米
	 */
	@ApiField("area")
	private String area;

	/**
	 * 床型描述
	 */
	@ApiField("bed_desc")
	private String bedDesc;

	/**
	 * 房间能够入住的最大人数，有效正整数
	 */
	@ApiField("capacity")
	private String capacity;

	/**
	 * 房间楼层信息
	 */
	@ApiField("floor")
	private String floor;

	public String getArea() {
		return this.area;
	}
	public void setArea(String area) {
		this.area = area;
	}

	public String getBedDesc() {
		return this.bedDesc;
	}
	public void setBedDesc(String bedDesc) {
		this.bedDesc = bedDesc;
	}

	public String getCapacity() {
		return this.capacity;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public String getFloor() {
		return this.floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}

}
