package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 极兔运单轨迹详情
 *
 * @author auto create
 * @since 1.0, 2022-09-15 19:38:04
 */
public class JTQueryDetails extends AlipayObject {

	private static final long serialVersionUID = 1751739977223688194L;

	/**
	 * 运单号
	 */
	@ApiField("bill_code")
	private String billCode;

	/**
	 * 轨迹描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 下一站区/县（发件扫描类型时提供）
	 */
	@ApiField("next_network_area_name")
	private String nextNetworkAreaName;

	/**
	 * 下一站城市（发件扫描类型时提供）
	 */
	@ApiField("next_network_city_name")
	private String nextNetworkCityName;

	/**
	 * 下一站省份（发件扫描类型时提供）
	 */
	@ApiField("next_network_province_name")
	private String nextNetworkProvinceName;

	/**
	 * 上一站(到件)或下一站名称(发件)
	 */
	@ApiField("next_stop_name")
	private String nextStopName;

	/**
	 * 枚举值，问题类型
	 */
	@ApiField("problem_type")
	private String problemType;

	/**
	 * 备注
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 扫描网点区/县
	 */
	@ApiField("scan_network_area")
	private String scanNetworkArea;

	/**
	 * 扫描网点城市
	 */
	@ApiField("scan_network_city")
	private String scanNetworkCity;

	/**
	 * 扫描网点联系方式
	 */
	@ApiField("scan_network_contact")
	private String scanNetworkContact;

	/**
	 * 扫描网点ID
	 */
	@ApiField("scan_network_id")
	private String scanNetworkId;

	/**
	 * 扫描网点名称
	 */
	@ApiField("scan_network_name")
	private String scanNetworkName;

	/**
	 * 扫描网点省份
	 */
	@ApiField("scan_network_province")
	private String scanNetworkProvince;

	/**
	 * 扫描时间
	 */
	@ApiField("scan_time")
	private String scanTime;

	/**
	 * 枚举值，扫描类型
	 */
	@ApiField("scan_type")
	private String scanType;

	/**
	 * 业务员联系方式
	 */
	@ApiField("staff_contact")
	private String staffContact;

	/**
	 * 业务员姓名
	 */
	@ApiField("staff_name")
	private String staffName;

	public String getBillCode() {
		return this.billCode;
	}
	public void setBillCode(String billCode) {
		this.billCode = billCode;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getNextNetworkAreaName() {
		return this.nextNetworkAreaName;
	}
	public void setNextNetworkAreaName(String nextNetworkAreaName) {
		this.nextNetworkAreaName = nextNetworkAreaName;
	}

	public String getNextNetworkCityName() {
		return this.nextNetworkCityName;
	}
	public void setNextNetworkCityName(String nextNetworkCityName) {
		this.nextNetworkCityName = nextNetworkCityName;
	}

	public String getNextNetworkProvinceName() {
		return this.nextNetworkProvinceName;
	}
	public void setNextNetworkProvinceName(String nextNetworkProvinceName) {
		this.nextNetworkProvinceName = nextNetworkProvinceName;
	}

	public String getNextStopName() {
		return this.nextStopName;
	}
	public void setNextStopName(String nextStopName) {
		this.nextStopName = nextStopName;
	}

	public String getProblemType() {
		return this.problemType;
	}
	public void setProblemType(String problemType) {
		this.problemType = problemType;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getScanNetworkArea() {
		return this.scanNetworkArea;
	}
	public void setScanNetworkArea(String scanNetworkArea) {
		this.scanNetworkArea = scanNetworkArea;
	}

	public String getScanNetworkCity() {
		return this.scanNetworkCity;
	}
	public void setScanNetworkCity(String scanNetworkCity) {
		this.scanNetworkCity = scanNetworkCity;
	}

	public String getScanNetworkContact() {
		return this.scanNetworkContact;
	}
	public void setScanNetworkContact(String scanNetworkContact) {
		this.scanNetworkContact = scanNetworkContact;
	}

	public String getScanNetworkId() {
		return this.scanNetworkId;
	}
	public void setScanNetworkId(String scanNetworkId) {
		this.scanNetworkId = scanNetworkId;
	}

	public String getScanNetworkName() {
		return this.scanNetworkName;
	}
	public void setScanNetworkName(String scanNetworkName) {
		this.scanNetworkName = scanNetworkName;
	}

	public String getScanNetworkProvince() {
		return this.scanNetworkProvince;
	}
	public void setScanNetworkProvince(String scanNetworkProvince) {
		this.scanNetworkProvince = scanNetworkProvince;
	}

	public String getScanTime() {
		return this.scanTime;
	}
	public void setScanTime(String scanTime) {
		this.scanTime = scanTime;
	}

	public String getScanType() {
		return this.scanType;
	}
	public void setScanType(String scanType) {
		this.scanType = scanType;
	}

	public String getStaffContact() {
		return this.staffContact;
	}
	public void setStaffContact(String staffContact) {
		this.staffContact = staffContact;
	}

	public String getStaffName() {
		return this.staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

}
