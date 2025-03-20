package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小区数据下载
 *
 * @author auto create
 * @since 1.0, 2025-03-04 13:52:24
 */
public class AlipayCommerceHousingCommunityDownloadModel extends AlipayObject {

	private static final long serialVersionUID = 3879843749764863818L;

	/**
	 * 城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 区县编码
	 */
	@ApiField("district_code")
	private String districtCode;

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getDistrictCode() {
		return this.districtCode;
	}
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

}
