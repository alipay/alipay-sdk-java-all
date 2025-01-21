package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 地址信息封装模型
 *
 * @author auto create
 * @since 1.0, 2021-12-03 16:22:57
 */
public class EcnyAddressInfo extends AlipayObject {

	private static final long serialVersionUID = 2466524265898369316L;

	/**
	 * 详细地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 城市编码。请按照https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx 表格中内容填写。
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 参见“GB/T 2659-2000”填写两位字符代码
	 */
	@ApiField("country")
	private String country;

	/**
	 * 区县编码。请按照https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx 表格中内容填写。
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 纬度，浮点型,小数点后最多保留6位
如需要录入经纬度，请以高德坐标系为准，录入时请确保经纬度参数准确。高德经纬度查询：http://lbs.amap.com/console/show/picker
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 经度，浮点型, 小数点后最多保留6位。
如需要录入经纬度，请以高德坐标系为准，录入时请确保经纬度参数准确。高德经纬度查询：http://lbs.amap.com/console/show/picker
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 省份编码。请按照https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx 表格中内容填写。
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 地址类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * 邮件编码
	 */
	@ApiField("zip")
	private String zip;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCountry() {
		return this.country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public String getDistrictCode() {
		return this.districtCode;
	}
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
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

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getZip() {
		return this.zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}

}
