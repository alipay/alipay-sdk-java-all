package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 零工保打卡配置
 *
 * @author auto create
 * @since 1.0, 2023-11-17 15:43:52
 */
public class InsureAttendDTO extends AlipayObject {

	private static final long serialVersionUID = 2414894962346861465L;

	/**
	 * 打卡时间区间代表该时间段内都可以扫码打卡，时间格式强校验，严格按照示例格式传值，中间是 符号是 -
	 */
	@ApiField("attend_time")
	private String attendTime;

	/**
	 * 打卡时间区间类型
	 */
	@ApiField("attend_type")
	private String attendType;

	/**
	 * 扫码打卡后的回调地址
	 */
	@ApiField("back_url")
	private String backUrl;

	/**
	 * 打卡的经纬度，坐标体系采用GCJ-02 - 国测局坐标，用;作为经度和纬度分割
	 */
	@ApiField("coordinates")
	private String coordinates;

	/**
	 * 打卡半径，单位m
	 */
	@ApiField("distance")
	private String distance;

	public String getAttendTime() {
		return this.attendTime;
	}
	public void setAttendTime(String attendTime) {
		this.attendTime = attendTime;
	}

	public String getAttendType() {
		return this.attendType;
	}
	public void setAttendType(String attendType) {
		this.attendType = attendType;
	}

	public String getBackUrl() {
		return this.backUrl;
	}
	public void setBackUrl(String backUrl) {
		this.backUrl = backUrl;
	}

	public String getCoordinates() {
		return this.coordinates;
	}
	public void setCoordinates(String coordinates) {
		this.coordinates = coordinates;
	}

	public String getDistance() {
		return this.distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}

}
