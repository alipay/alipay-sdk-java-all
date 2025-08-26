package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 地理位置信息
 *
 * @author auto create
 * @since 1.0, 2024-12-04 19:50:43
 */
public class ChatLocation extends AlipayObject {

	private static final long serialVersionUID = 1612832197717569829L;

	/**
	 * 地理位置纬度，当用户的query需要位置信息，例如附近点单、查询附近充电桩等场景时候，则该参数必填，单位为度。在其他不涉及位置信息的接口时选填。
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 地理位置经度，当用户的query需要位置信息，例如附近点单、查询附近充电桩等场景时候，则该参数必传，单位为度。在其他不涉及位置信息的接口时选填。
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * poi的展示名称，在poi_type不同的情况下具体内容也不一样，例如poi_type为HOME的时候，该值可以为“家”；在poi_type为TARGET的时候，该值可以为“市民广场步行街”。
	 */
	@ApiField("poi_name")
	private String poiName;

	/**
	 * 地理位置的类型标记，用于标注位置的特性
	 */
	@ApiField("poi_type")
	private String poiType;

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

	public String getPoiName() {
		return this.poiName;
	}
	public void setPoiName(String poiName) {
		this.poiName = poiName;
	}

	public String getPoiType() {
		return this.poiType;
	}
	public void setPoiType(String poiType) {
		this.poiType = poiType;
	}

}
