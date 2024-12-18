package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商圈信息
 *
 * @author auto create
 * @since 1.0, 2018-11-20 14:58:45
 */
public class NearMallBo extends AlipayObject {

	private static final long serialVersionUID = 2589383851174978391L;

	/**
	 * json字符串表示额外信息
	 */
	@ApiField("attribute")
	private String attribute;

	/**
	 * 距离
	 */
	@ApiField("distance")
	private String distance;

	/**
	 * 经度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 纬度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 商圈id
	 */
	@ApiField("mall_id")
	private String mallId;

	/**
	 * 商圈图片
	 */
	@ApiField("mall_logo")
	private String mallLogo;

	/**
	 * 商圈名字
	 */
	@ApiField("mall_name")
	private String mallName;

	public String getAttribute() {
		return this.attribute;
	}
	public void setAttribute(String attribute) {
		this.attribute = attribute;
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

	public String getMallId() {
		return this.mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}

	public String getMallLogo() {
		return this.mallLogo;
	}
	public void setMallLogo(String mallLogo) {
		this.mallLogo = mallLogo;
	}

	public String getMallName() {
		return this.mallName;
	}
	public void setMallName(String mallName) {
		this.mallName = mallName;
	}

}
