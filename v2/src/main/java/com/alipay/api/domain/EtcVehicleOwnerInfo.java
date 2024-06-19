package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ETC办理车主信息
 *
 * @author auto create
 * @since 1.0, 2023-09-21 17:53:45
 */
public class EtcVehicleOwnerInfo extends AlipayObject {

	private static final long serialVersionUID = 1459217675568647988L;

	/**
	 * 车主地址信息包含省市区(身份证地址)
	 */
	@ApiField("vi_owner_address")
	private String viOwnerAddress;

	/**
	 * 身份证有效期结束时间，注意并不全是日期格式，有”长期“的情况
	 */
	@ApiField("vi_owner_cert_end_date")
	private String viOwnerCertEndDate;

	/**
	 * 车主证件号码
	 */
	@ApiField("vi_owner_cert_no")
	private String viOwnerCertNo;

	/**
	 * 身份证有效期开始时间
	 */
	@ApiField("vi_owner_cert_start_date")
	private String viOwnerCertStartDate;

	/**
	 * 车主证件类型，当前只支持身份证
101-身份证
	 */
	@ApiField("vi_owner_cert_type")
	private String viOwnerCertType;

	/**
	 * 用户所在城市名称
	 */
	@ApiField("vi_owner_city")
	private String viOwnerCity;

	/**
	 * 车主联系电话
	 */
	@ApiField("vi_owner_contact")
	private String viOwnerContact;

	/**
	 * 用户所在地区名称
	 */
	@ApiField("vi_owner_district")
	private String viOwnerDistrict;

	/**
	 * 车主姓名
	 */
	@ApiField("vi_owner_name")
	private String viOwnerName;

	/**
	 * 用户所在地址省份名称
	 */
	@ApiField("vi_owner_province")
	private String viOwnerProvince;

	/**
	 * 车主类型
PRESONAL：个人用户;
ENTERPRISE：企业用户
	 */
	@ApiField("vi_owner_type")
	private String viOwnerType;

	public String getViOwnerAddress() {
		return this.viOwnerAddress;
	}
	public void setViOwnerAddress(String viOwnerAddress) {
		this.viOwnerAddress = viOwnerAddress;
	}

	public String getViOwnerCertEndDate() {
		return this.viOwnerCertEndDate;
	}
	public void setViOwnerCertEndDate(String viOwnerCertEndDate) {
		this.viOwnerCertEndDate = viOwnerCertEndDate;
	}

	public String getViOwnerCertNo() {
		return this.viOwnerCertNo;
	}
	public void setViOwnerCertNo(String viOwnerCertNo) {
		this.viOwnerCertNo = viOwnerCertNo;
	}

	public String getViOwnerCertStartDate() {
		return this.viOwnerCertStartDate;
	}
	public void setViOwnerCertStartDate(String viOwnerCertStartDate) {
		this.viOwnerCertStartDate = viOwnerCertStartDate;
	}

	public String getViOwnerCertType() {
		return this.viOwnerCertType;
	}
	public void setViOwnerCertType(String viOwnerCertType) {
		this.viOwnerCertType = viOwnerCertType;
	}

	public String getViOwnerCity() {
		return this.viOwnerCity;
	}
	public void setViOwnerCity(String viOwnerCity) {
		this.viOwnerCity = viOwnerCity;
	}

	public String getViOwnerContact() {
		return this.viOwnerContact;
	}
	public void setViOwnerContact(String viOwnerContact) {
		this.viOwnerContact = viOwnerContact;
	}

	public String getViOwnerDistrict() {
		return this.viOwnerDistrict;
	}
	public void setViOwnerDistrict(String viOwnerDistrict) {
		this.viOwnerDistrict = viOwnerDistrict;
	}

	public String getViOwnerName() {
		return this.viOwnerName;
	}
	public void setViOwnerName(String viOwnerName) {
		this.viOwnerName = viOwnerName;
	}

	public String getViOwnerProvince() {
		return this.viOwnerProvince;
	}
	public void setViOwnerProvince(String viOwnerProvince) {
		this.viOwnerProvince = viOwnerProvince;
	}

	public String getViOwnerType() {
		return this.viOwnerType;
	}
	public void setViOwnerType(String viOwnerType) {
		this.viOwnerType = viOwnerType;
	}

}
