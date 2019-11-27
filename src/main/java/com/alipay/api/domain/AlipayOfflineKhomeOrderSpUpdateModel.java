package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑到家业务，平台商更换订单接单手艺人
 *
 * @author auto create
 * @since 1.0, 2016-01-19 10:45:00
 */
public class AlipayOfflineKhomeOrderSpUpdateModel extends AlipayObject {

	private static final long serialVersionUID = 4158431721324347212L;

	/**
	 * 平台商手艺人支付宝帐号
	 */
	@ApiField("alipay_logon_id")
	private String alipayLogonId;

	/**
	 * 平台商手艺人身份证号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 平台商手艺人的描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 区域编码
	 */
	@ApiListField("district_code_list")
	@ApiField("string")
	private List<String> districtCodeList;

	/**
	 * 平台商手艺人id
	 */
	@ApiField("external_sp_id")
	private String externalSpId;

	/**
	 * 平台商手艺人位置纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 证照信息列表
	 */
	@ApiListField("license_list")
	@ApiField("khome_sp_license")
	private List<KhomeSpLicense> licenseList;

	/**
	 * 平台商手艺人位置经度
	 */
	@ApiField("longitude")
	private Long longitude;

	/**
	 * 平台商手艺人手机号码
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 平台商手艺人姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 口碑订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	public String getAlipayLogonId() {
		return this.alipayLogonId;
	}
	public void setAlipayLogonId(String alipayLogonId) {
		this.alipayLogonId = alipayLogonId;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public List<String> getDistrictCodeList() {
		return this.districtCodeList;
	}
	public void setDistrictCodeList(List<String> districtCodeList) {
		this.districtCodeList = districtCodeList;
	}

	public String getExternalSpId() {
		return this.externalSpId;
	}
	public void setExternalSpId(String externalSpId) {
		this.externalSpId = externalSpId;
	}

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public List<KhomeSpLicense> getLicenseList() {
		return this.licenseList;
	}
	public void setLicenseList(List<KhomeSpLicense> licenseList) {
		this.licenseList = licenseList;
	}

	public Long getLongitude() {
		return this.longitude;
	}
	public void setLongitude(Long longitude) {
		this.longitude = longitude;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

}
