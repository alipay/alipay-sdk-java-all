package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 景区数据
 *
 * @author auto create
 * @since 1.0, 2026-01-09 13:57:44
 */
public class LocationData extends AlipayObject {

	private static final long serialVersionUID = 6648325452227357554L;

	/**
	 * 0-宽松，1-较拥挤，2-非常拥挤，3-不宜进入
	 */
	@ApiField("crowding_level")
	private Long crowdingLevel;

	/**
	 * 子景点ID
	 */
	@ApiField("location_id")
	private String locationId;

	/**
	 * 子景点名称
	 */
	@ApiField("location_name")
	private String locationName;

	/**
	 * 地点类型
	 */
	@ApiField("location_type")
	private String locationType;

	/**
	 * 当日累计访问人数
	 */
	@ApiField("max_capacity")
	private Long maxCapacity;

	/**
	 * 当日累计访问人数
	 */
	@ApiField("visitor_day_count")
	private Long visitorDayCount;

	/**
	 * 访客实时人数
	 */
	@ApiField("visitor_real_count")
	private Long visitorRealCount;

	/**
	 * 访客实时时间数据
	 */
	@ApiField("visitor_real_time")
	private Date visitorRealTime;

	public Long getCrowdingLevel() {
		return this.crowdingLevel;
	}
	public void setCrowdingLevel(Long crowdingLevel) {
		this.crowdingLevel = crowdingLevel;
	}

	public String getLocationId() {
		return this.locationId;
	}
	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}

	public String getLocationName() {
		return this.locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public String getLocationType() {
		return this.locationType;
	}
	public void setLocationType(String locationType) {
		this.locationType = locationType;
	}

	public Long getMaxCapacity() {
		return this.maxCapacity;
	}
	public void setMaxCapacity(Long maxCapacity) {
		this.maxCapacity = maxCapacity;
	}

	public Long getVisitorDayCount() {
		return this.visitorDayCount;
	}
	public void setVisitorDayCount(Long visitorDayCount) {
		this.visitorDayCount = visitorDayCount;
	}

	public Long getVisitorRealCount() {
		return this.visitorRealCount;
	}
	public void setVisitorRealCount(Long visitorRealCount) {
		this.visitorRealCount = visitorRealCount;
	}

	public Date getVisitorRealTime() {
		return this.visitorRealTime;
	}
	public void setVisitorRealTime(Date visitorRealTime) {
		this.visitorRealTime = visitorRealTime;
	}

}
