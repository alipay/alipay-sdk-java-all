package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签约地址
 *
 * @author auto create
 * @since 1.0, 2024-05-21 10:12:51
 */
public class SignAddressInfo extends AlipayObject {

	private static final long serialVersionUID = 1567611185885863987L;

	/**
	 * 城市编码。请按照<a href="https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx">表格</a> 中内容填写。 （参考资料： <a href="http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/">参考资料</a>）
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 国家编码，中国默认：156
	 */
	@ApiField("country_code")
	private String countryCode;

	/**
	 * 详细地址
	 */
	@ApiField("detail_address")
	private String detailAddress;

	/**
	 * 区县编码。请按照<a href="https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx">表格</a> 中内容填写。 （参考资料： <a href="http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/">参考资料</a>）
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 纬度，浮点型,小数点后最多保留6位 如需要录入经纬度，请以高德坐标系为准，录入时请确保经纬度参数准确。高德经纬度查询：<a href="http://lbs.amap.com/console/show/picker">查询地址</a>
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 经度，浮点型, 小数点后最多保留6位。 如需要录入经纬度，请以高德坐标系为准，录入时请确保经纬度参数准确。高德经纬度查询：<a href="http://lbs.amap.com/console/show/picker">查询地址</a>
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 省份编码。请按照<a href="https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx">表格</a> 中内容填写。 （参考资料： <a href="http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/">参考资料</a>）
	 */
	@ApiField("province_code")
	private String provinceCode;

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCountryCode() {
		return this.countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getDetailAddress() {
		return this.detailAddress;
	}
	public void setDetailAddress(String detailAddress) {
		this.detailAddress = detailAddress;
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

}
