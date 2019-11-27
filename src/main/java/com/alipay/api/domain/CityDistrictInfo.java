package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 城市下的地区信息
 *
 * @author auto create
 * @since 1.0, 2016-12-02 15:34:47
 */
public class CityDistrictInfo extends AlipayObject {

	private static final long serialVersionUID = 3555128456893222357L;

	/**
	 * 城市下的区编码
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 城市下的区域名称
	 */
	@ApiField("district_name")
	private String districtName;

	public String getDistrictCode() {
		return this.districtCode;
	}
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public String getDistrictName() {
		return this.districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

}
