package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签约地址
 *
 * @author auto create
 * @since 1.0, 2025-10-30 15:11:13
 */
public class SignAddressInfo extends AlipayObject {

	private static final long serialVersionUID = 8774257177731346258L;

	/**
	 * 城市编码。请按照<a href="https://mdn.alipayobjects.com/huamei_sm7gq8/afts/file/A*blT9RqSR9_gAAAAAAAAAAAAADuKQAQ/2022%E8%9A%82%E8%9A%81%E9%87%91%E6%9C%8D%E5%9C%B0%E5%8C%BA%E7%A0%81.xlsx">地区码表格</a> 中内容填写。 （参考资料： <a href="https://www.mca.gov.cn/n156/n186/index.html">参考资料</a>）
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
	 * 区县编码。请按照<a href="https://mdn.alipayobjects.com/huamei_sm7gq8/afts/file/A*blT9RqSR9_gAAAAAAAAAAAAADuKQAQ/2022%E8%9A%82%E8%9A%81%E9%87%91%E6%9C%8D%E5%9C%B0%E5%8C%BA%E7%A0%81.xlsx">地区码表格</a> 中内容填写。 （参考资料： <a href="https://www.mca.gov.cn/n156/n186/index.html">参考资料</a>）
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
	 * 省份编码。请按照<a href="https://mdn.alipayobjects.com/huamei_sm7gq8/afts/file/A*blT9RqSR9_gAAAAAAAAAAAAADuKQAQ/2022%E8%9A%82%E8%9A%81%E9%87%91%E6%9C%8D%E5%9C%B0%E5%8C%BA%E7%A0%81.xlsx">地区码表格</a> 中内容填写。 （参考资料： <a href="https://www.mca.gov.cn/n156/n186/index.html">参考资料</a>）
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
