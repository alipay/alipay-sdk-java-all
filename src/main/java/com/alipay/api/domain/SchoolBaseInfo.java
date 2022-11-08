package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 学校信息列表
 *
 * @author auto create
 * @since 1.0, 2022-05-13 14:14:48
 */
public class SchoolBaseInfo extends AlipayObject {

	private static final long serialVersionUID = 2211776918138952658L;

	/**
	 * 校区信息
	 */
	@ApiListField("campus_info")
	@ApiField("campus_info")
	private List<CampusInfo> campusInfo;

	/**
	 * 城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 学校内标
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 学校名称
	 */
	@ApiField("inst_name")
	private String instName;

	/**
	 * 学校外标
	 */
	@ApiField("inst_std_code")
	private String instStdCode;

	/**
	 * 省份编码
	 */
	@ApiField("province_code")
	private String provinceCode;

	public List<CampusInfo> getCampusInfo() {
		return this.campusInfo;
	}
	public void setCampusInfo(List<CampusInfo> campusInfo) {
		this.campusInfo = campusInfo;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getInstName() {
		return this.instName;
	}
	public void setInstName(String instName) {
		this.instName = instName;
	}

	public String getInstStdCode() {
		return this.instStdCode;
	}
	public void setInstStdCode(String instStdCode) {
		this.instStdCode = instStdCode;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

}
