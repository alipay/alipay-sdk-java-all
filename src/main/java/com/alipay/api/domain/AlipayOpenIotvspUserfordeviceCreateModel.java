package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 录入机构用户信息（机具端核身采集）
 *
 * @author auto create
 * @since 1.0, 2022-09-20 15:55:23
 */
public class AlipayOpenIotvspUserfordeviceCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5729887214938286945L;

	/**
	 * 详细地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 区域编码
	 */
	@ApiField("area_code")
	private String areaCode;

	/**
	 * 区域名称
	 */
	@ApiField("area_name")
	private String areaName;

	/**
	 * 姓名
	 */
	@ApiField("cert_name")
	private String certName;

	/**
	 * 证件号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型，枚举支持：IDENTITY_CARD身份证，PASS_PORT护照，STU_NUM学生学号，COMPANY_NUM工号，TAIWAN_CARD台胞证，HK_MC_CARD港澳证件
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 城市名称
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 组件编码，该参数与userInfoList配对使用。详见接入指南
	 */
	@ApiField("component_out_id")
	private String componentOutId;

	/**
	 * 扩展信息，ISV自定义，如无可为空
	 */
	@ApiField("ext")
	private String ext;

	/**
	 * ISV的PID
	 */
	@ApiField("isv_pid")
	private String isvPid;

	/**
	 * 民族
	 */
	@ApiField("nation")
	private String nation;

	/**
	 * 机构编码
	 */
	@ApiField("org_out_id")
	private String orgOutId;

	/**
	 * 手机号
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 省编码
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 省名称
	 */
	@ApiField("province_name")
	private String provinceName;

	/**
	 * 操作流水id
	 */
	@ApiField("unique_id")
	private String uniqueId;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getAreaCode() {
		return this.areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getAreaName() {
		return this.areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getCertName() {
		return this.certName;
	}
	public void setCertName(String certName) {
		this.certName = certName;
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

	public String getCityName() {
		return this.cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getComponentOutId() {
		return this.componentOutId;
	}
	public void setComponentOutId(String componentOutId) {
		this.componentOutId = componentOutId;
	}

	public String getExt() {
		return this.ext;
	}
	public void setExt(String ext) {
		this.ext = ext;
	}

	public String getIsvPid() {
		return this.isvPid;
	}
	public void setIsvPid(String isvPid) {
		this.isvPid = isvPid;
	}

	public String getNation() {
		return this.nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}

	public String getOrgOutId() {
		return this.orgOutId;
	}
	public void setOrgOutId(String orgOutId) {
		this.orgOutId = orgOutId;
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

	public String getUniqueId() {
		return this.uniqueId;
	}
	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

}
