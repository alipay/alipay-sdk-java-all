package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 兴趣社区发布内容的位置信息
 *
 * @author auto create
 * @since 1.0, 2025-01-16 15:37:25
 */
public class IcommunityContentLocationInfo extends AlipayObject {

	private static final long serialVersionUID = 1123984915914878397L;

	/**
	 * 内容发布时的地理位置详细地址
	 */
	@ApiField("location_detail")
	private String locationDetail;

	/**
	 * 内容发布时的纬度
	 */
	@ApiField("location_latitude")
	private String locationLatitude;

	/**
	 * 内容发布时的经度
	 */
	@ApiField("location_longitude")
	private String locationLongitude;

	/**
	 * 内容发布时的地理位置名称
	 */
	@ApiField("location_name")
	private String locationName;

	public String getLocationDetail() {
		return this.locationDetail;
	}
	public void setLocationDetail(String locationDetail) {
		this.locationDetail = locationDetail;
	}

	public String getLocationLatitude() {
		return this.locationLatitude;
	}
	public void setLocationLatitude(String locationLatitude) {
		this.locationLatitude = locationLatitude;
	}

	public String getLocationLongitude() {
		return this.locationLongitude;
	}
	public void setLocationLongitude(String locationLongitude) {
		this.locationLongitude = locationLongitude;
	}

	public String getLocationName() {
		return this.locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

}
