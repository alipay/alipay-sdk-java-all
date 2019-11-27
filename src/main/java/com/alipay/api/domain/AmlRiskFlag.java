package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 反洗钱风险标签
 *
 * @author auto create
 * @since 1.0, 2019-03-07 14:32:50
 */
public class AmlRiskFlag extends AlipayObject {

	private static final long serialVersionUID = 6565717142376232657L;

	/**
	 * 类罪描述
	 */
	@ApiField("crime_desc")
	private String crimeDesc;

	/**
	 * 来源
	 */
	@ApiField("crime_source")
	private String crimeSource;

	/**
	 * 类罪
	 */
	@ApiField("crime_type")
	private String crimeType;

	/**
	 * 初始时间
	 */
	@ApiField("first_gmt_create")
	private String firstGmtCreate;

	/**
	 * 最后时间
	 */
	@ApiField("last_gmt_create")
	private String lastGmtCreate;

	/**
	 * memo
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 角色
	 */
	@ApiField("role")
	private String role;

	public String getCrimeDesc() {
		return this.crimeDesc;
	}
	public void setCrimeDesc(String crimeDesc) {
		this.crimeDesc = crimeDesc;
	}

	public String getCrimeSource() {
		return this.crimeSource;
	}
	public void setCrimeSource(String crimeSource) {
		this.crimeSource = crimeSource;
	}

	public String getCrimeType() {
		return this.crimeType;
	}
	public void setCrimeType(String crimeType) {
		this.crimeType = crimeType;
	}

	public String getFirstGmtCreate() {
		return this.firstGmtCreate;
	}
	public void setFirstGmtCreate(String firstGmtCreate) {
		this.firstGmtCreate = firstGmtCreate;
	}

	public String getLastGmtCreate() {
		return this.lastGmtCreate;
	}
	public void setLastGmtCreate(String lastGmtCreate) {
		this.lastGmtCreate = lastGmtCreate;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getRole() {
		return this.role;
	}
	public void setRole(String role) {
		this.role = role;
	}

}
