package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询POI基础信息返回数据VO
 *
 * @author auto create
 * @since 1.0, 2024-06-12 09:48:02
 */
public class OpenQueryPoimBaseResponse extends AlipayObject {

	private static final long serialVersionUID = 8613686567766277224L;

	/**
	 * 地址。商户详细经营地址或人员所在地点
	 */
	@ApiField("address")
	private String address;

	/**
	 * address_id 查询业务主键,一个address_id 对应一个商家地址,地址下面有名称,地址,经纬度,省市区,等基础信息
	 */
	@ApiField("address_id")
	private String addressId;

	/**
	 * 城市编码。
蚂蚁店铺请按照<a href="https://mdn.alipayobjects.com/huamei_sm7gq8/afts/file/A*blT9RqSR9_gAAAAAAAAAAAAADuKQAQ/2022%E8%9A%82%E8%9A%81%E9%87%91%E6%9C%8D%E5%9C%B0%E5%8C%BA%E7%A0%81.xlsx" target="_blank">蚂蚁店铺地区码</a> 表格中填写。
直付通商户请按照<a href="https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx " target="_blank">直付通商户地区码</a> 表格中内容填写。
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 城市名称
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 区县编码。
蚂蚁店铺请按照<a href="https://mdn.alipayobjects.com/huamei_sm7gq8/afts/file/A*blT9RqSR9_gAAAAAAAAAAAAADuKQAQ/2022%E8%9A%82%E8%9A%81%E9%87%91%E6%9C%8D%E5%9C%B0%E5%8C%BA%E7%A0%81.xlsx" target="_blank">蚂蚁店铺地区码</a> 表格中填写。
直付通商户请按照<a href="https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx " target="_blank">直付通商户地区码</a> 表格中内容填写。
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 区县名称
	 */
	@ApiField("district_name")
	private String districtName;

	/**
	 * 纬度，浮点型,小数点后最多保留6位
如需要录入经纬度，请以高德坐标系为准，录入时请确保经纬度参数准确。高德经纬度查询
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 经度，浮点型, 小数点后最多保留6位。
如需要录入经纬度，请以高德坐标系为准，录入时请确保经纬度参数准确。高德经纬度查询
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 商家地址库下管理对应的商家名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 省份编码。
蚂蚁店铺请按照<a href="https://mdn.alipayobjects.com/huamei_sm7gq8/afts/file/A*blT9RqSR9_gAAAAAAAAAAAAADuKQAQ/2022%E8%9A%82%E8%9A%81%E9%87%91%E6%9C%8D%E5%9C%B0%E5%8C%BA%E7%A0%81.xlsx" target="_blank">蚂蚁店铺地区码</a> 表格中填写。
直付通商户请按照<a href="https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx " target="_blank">直付通商户地区码</a> 表格中内容填写。
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 省份名称
	 */
	@ApiField("province_name")
	private String provinceName;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddressId() {
		return this.addressId;
	}
	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCityName() {
		return this.cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

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

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getProvinceName() {
		return this.provinceName;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

}
