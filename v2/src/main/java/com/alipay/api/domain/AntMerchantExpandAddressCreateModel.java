package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家地址库创建
 *
 * @author auto create
 * @since 1.0, 2024-12-31 10:36:43
 */
public class AntMerchantExpandAddressCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8123594248697412376L;

	/**
	 * 地址。商户详细经营地址或人员所在地点
	 */
	@ApiField("address")
	private String address;

	/**
	 * 城市编码。 蚂蚁店铺请按照<a href="https://mdn.alipayobjects.com/huamei_sm7gq8/afts/file/A*blT9RqSR9_gAAAAAAAAAAAAADuKQAQ/2022%E8%9A%82%E8%9A%81%E9%87%91%E6%9C%8D%E5%9C%B0%E5%8C%BA%E7%A0%81.xlsx">蚂蚁店铺地区码</a> 表格中填写。 直付通商户请按照<a href="https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx">直付通商户地区码</a> 表格中内容填写。
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 区县编码。 蚂蚁店铺请按照<a href="https://mdn.alipayobjects.com/huamei_sm7gq8/afts/file/A*blT9RqSR9_gAAAAAAAAAAAAADuKQAQ/2022%E8%9A%82%E8%9A%81%E9%87%91%E6%9C%8D%E5%9C%B0%E5%8C%BA%E7%A0%81.xlsx">蚂蚁店铺地区码</a> 表格中填写。 直付通商户请按照<a href="https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx">直付通商户地区码</a> 表格中内容填写。
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 纬度，浮点型,小数点后最多保留6位 如需要录入经纬度，请以高德坐标系为准，录入时请确保经纬度参数准确。<a href="https://lbs.amap.com/tools/picker">高德经纬度查询</a>
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 经度，浮点型, 小数点后最多保留6位。 如需要录入经纬度，请以高德坐标系为准，录入时请确保经纬度参数准确。<a href="https://lbs.amap.com/tools/picker">高德经纬度查询</a>
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * POI类目标准二级类目code。类目标准及与原类目映射关系参见 <a href="https://gw.alipayobjects.com/os/bmw-prod/4b3f82df-e53e-4b84-bc41-fe025101e726.xlsx">支付宝门店类目-最新</a> 表格。
	 */
	@ApiField("mcc_l_2")
	private String mccL2;

	/**
	 * 商家地址库下管理对应的商家名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 外部单号，用于后续监听消息回传使用
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 省份编码。 蚂蚁店铺请按照<a href="https://mdn.alipayobjects.com/huamei_sm7gq8/afts/file/A*blT9RqSR9_gAAAAAAAAAAAAADuKQAQ/2022%E8%9A%82%E8%9A%81%E9%87%91%E6%9C%8D%E5%9C%B0%E5%8C%BA%E7%A0%81.xlsx">蚂蚁店铺地区码</a> 表格中填写。 直付通商户请按照<a href="https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx">直付通商户地区码</a> 表格中内容填写。
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 场景，如
LAN_HUA_HUO_OPENAPI-蓝花火
	 */
	@ApiField("scene")
	private String scene;

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

	public String getMccL2() {
		return this.mccL2;
	}
	public void setMccL2(String mccL2) {
		this.mccL2 = mccL2;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

}
