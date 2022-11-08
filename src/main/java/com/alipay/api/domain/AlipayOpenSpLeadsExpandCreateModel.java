package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 在线写入商机库
 *
 * @author auto create
 * @since 1.0, 2022-05-12 14:43:15
 */
public class AlipayOpenSpLeadsExpandCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8474413975591392193L;

	/**
	 * 拓展助手商机地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 拓展助手商机地址市code
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 拓展助手商机地址市名称
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 拓展助手商机地址区code
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 拓展助手商机地址区名称
	 */
	@ApiField("district_name")
	private String districtName;

	/**
	 * 拓展助手商机邮箱
	 */
	@ApiField("email")
	private String email;

	/**
	 * 拓展助手商机地址纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 拓展助手商机地址经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * mcc行业
	 */
	@ApiField("mcc")
	private String mcc;

	/**
	 * 2088账号
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/**
	 * 拓展助手商机名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 外部幂等唯一键
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 拓展助手商机联系电话
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 拓展助手商机地址省code
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 拓展助手商机地址省名称
	 */
	@ApiField("province_name")
	private String provinceName;

	/**
	 * 拓展助手场景，参数约定
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

	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
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

	public String getMcc() {
		return this.mcc;
	}
	public void setMcc(String mcc) {
		this.mcc = mcc;
	}

	public String getMerchantPid() {
		return this.merchantPid;
	}
	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
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

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
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

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

}
