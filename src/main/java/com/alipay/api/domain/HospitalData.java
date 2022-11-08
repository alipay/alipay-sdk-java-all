package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医院数据
 *
 * @author auto create
 * @since 1.0, 2022-06-20 14:30:17
 */
public class HospitalData extends AlipayObject {

	private static final long serialVersionUID = 1631896663221733142L;

	/**
	 * 国家重点科室
	 */
	@ApiField("country_key_department")
	private String countryKeyDepartment;

	/**
	 * 医院地址
	 */
	@ApiField("hospital_addr")
	private String hospitalAddr;

	/**
	 * 医院别名
	 */
	@ApiField("hospital_alias")
	private String hospitalAlias;

	/**
	 * 医院所在城市
	 */
	@ApiField("hospital_city")
	private String hospitalCity;

	/**
	 * 医院所在城市区划
	 */
	@ApiField("hospital_district")
	private String hospitalDistrict;

	/**
	 * 医院等级
	 */
	@ApiField("hospital_grade")
	private String hospitalGrade;

	/**
	 * 医院id
	 */
	@ApiField("hospital_id")
	private String hospitalId;

	/**
	 * 医院纬度
	 */
	@ApiField("hospital_lat")
	private String hospitalLat;

	/**
	 * 医院经度
	 */
	@ApiField("hospital_lgt")
	private String hospitalLgt;

	/**
	 * png格式的医院logo
	 */
	@ApiField("hospital_logo")
	private String hospitalLogo;

	/**
	 * 医院名称
	 */
	@ApiField("hospital_name")
	private String hospitalName;

	/**
	 * 医院标签
	 */
	@ApiField("hospital_optag")
	private String hospitalOptag;

	/**
	 * 医院所在省份
	 */
	@ApiField("hospital_province")
	private String hospitalProvince;

	/**
	 * 医疗定点机构编号
	 */
	@ApiField("hospital_standard_code")
	private String hospitalStandardCode;

	/**
	 * 医院对公电话
	 */
	@ApiField("hospital_tel")
	private String hospitalTel;

	/**
	 * 医院类型
	 */
	@ApiField("hospital_type")
	private String hospitalType;

	/**
	 * 医院放号时间
	 */
	@ApiField("hospital_work_time")
	private String hospitalWorkTime;

	/**
	 * 特色科室
	 */
	@ApiField("key_department")
	private String keyDepartment;

	/**
	 * 省级重点科室
	 */
	@ApiField("province_key_department")
	private String provinceKeyDepartment;

	public String getCountryKeyDepartment() {
		return this.countryKeyDepartment;
	}
	public void setCountryKeyDepartment(String countryKeyDepartment) {
		this.countryKeyDepartment = countryKeyDepartment;
	}

	public String getHospitalAddr() {
		return this.hospitalAddr;
	}
	public void setHospitalAddr(String hospitalAddr) {
		this.hospitalAddr = hospitalAddr;
	}

	public String getHospitalAlias() {
		return this.hospitalAlias;
	}
	public void setHospitalAlias(String hospitalAlias) {
		this.hospitalAlias = hospitalAlias;
	}

	public String getHospitalCity() {
		return this.hospitalCity;
	}
	public void setHospitalCity(String hospitalCity) {
		this.hospitalCity = hospitalCity;
	}

	public String getHospitalDistrict() {
		return this.hospitalDistrict;
	}
	public void setHospitalDistrict(String hospitalDistrict) {
		this.hospitalDistrict = hospitalDistrict;
	}

	public String getHospitalGrade() {
		return this.hospitalGrade;
	}
	public void setHospitalGrade(String hospitalGrade) {
		this.hospitalGrade = hospitalGrade;
	}

	public String getHospitalId() {
		return this.hospitalId;
	}
	public void setHospitalId(String hospitalId) {
		this.hospitalId = hospitalId;
	}

	public String getHospitalLat() {
		return this.hospitalLat;
	}
	public void setHospitalLat(String hospitalLat) {
		this.hospitalLat = hospitalLat;
	}

	public String getHospitalLgt() {
		return this.hospitalLgt;
	}
	public void setHospitalLgt(String hospitalLgt) {
		this.hospitalLgt = hospitalLgt;
	}

	public String getHospitalLogo() {
		return this.hospitalLogo;
	}
	public void setHospitalLogo(String hospitalLogo) {
		this.hospitalLogo = hospitalLogo;
	}

	public String getHospitalName() {
		return this.hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getHospitalOptag() {
		return this.hospitalOptag;
	}
	public void setHospitalOptag(String hospitalOptag) {
		this.hospitalOptag = hospitalOptag;
	}

	public String getHospitalProvince() {
		return this.hospitalProvince;
	}
	public void setHospitalProvince(String hospitalProvince) {
		this.hospitalProvince = hospitalProvince;
	}

	public String getHospitalStandardCode() {
		return this.hospitalStandardCode;
	}
	public void setHospitalStandardCode(String hospitalStandardCode) {
		this.hospitalStandardCode = hospitalStandardCode;
	}

	public String getHospitalTel() {
		return this.hospitalTel;
	}
	public void setHospitalTel(String hospitalTel) {
		this.hospitalTel = hospitalTel;
	}

	public String getHospitalType() {
		return this.hospitalType;
	}
	public void setHospitalType(String hospitalType) {
		this.hospitalType = hospitalType;
	}

	public String getHospitalWorkTime() {
		return this.hospitalWorkTime;
	}
	public void setHospitalWorkTime(String hospitalWorkTime) {
		this.hospitalWorkTime = hospitalWorkTime;
	}

	public String getKeyDepartment() {
		return this.keyDepartment;
	}
	public void setKeyDepartment(String keyDepartment) {
		this.keyDepartment = keyDepartment;
	}

	public String getProvinceKeyDepartment() {
		return this.provinceKeyDepartment;
	}
	public void setProvinceKeyDepartment(String provinceKeyDepartment) {
		this.provinceKeyDepartment = provinceKeyDepartment;
	}

}
