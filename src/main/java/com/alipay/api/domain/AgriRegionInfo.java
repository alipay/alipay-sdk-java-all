package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 农业区域详情信息
 *
 * @author auto create
 * @since 1.0, 2022-10-14 10:02:52
 */
public class AgriRegionInfo extends AlipayObject {

	private static final long serialVersionUID = 8345227762442365176L;

	/**
	 * 坐标信息
	 */
	@ApiField("geometry")
	private String geometry;

	/**
	 * 区域编码
	 */
	@ApiField("region_code")
	private String regionCode;

	/**
	 * 区域类型
	 */
	@ApiField("region_type")
	private String regionType;

	public String getGeometry() {
		return this.geometry;
	}
	public void setGeometry(String geometry) {
		this.geometry = geometry;
	}

	public String getRegionCode() {
		return this.regionCode;
	}
	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}

	public String getRegionType() {
		return this.regionType;
	}
	public void setRegionType(String regionType) {
		this.regionType = regionType;
	}

}
