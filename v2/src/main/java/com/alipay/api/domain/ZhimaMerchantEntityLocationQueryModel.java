package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 手机缺电充电宝位置提醒
 *
 * @author auto create
 * @since 1.0, 2022-07-05 22:11:48
 */
public class ZhimaMerchantEntityLocationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3584122669186279477L;

	/**
	 * 实体类目
	 */
	@ApiField("category_code")
	private String categoryCode;

	/**
	 * 扩展字段
	 */
	@ApiField("ext")
	private String ext;

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
	 * 半径范围
	 */
	@ApiField("radius_range")
	private String radiusRange;

	public String getCategoryCode() {
		return this.categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getExt() {
		return this.ext;
	}
	public void setExt(String ext) {
		this.ext = ext;
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

	public String getRadiusRange() {
		return this.radiusRange;
	}
	public void setRadiusRange(String radiusRange) {
		this.radiusRange = radiusRange;
	}

}
