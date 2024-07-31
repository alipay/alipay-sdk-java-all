package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业关系信息
 *
 * @author auto create
 * @since 1.0, 2024-07-05 14:49:40
 */
public class CompanyRelationInfo extends AlipayObject {

	private static final long serialVersionUID = 3832236913789213353L;

	/**
	 * 核准日期
	 */
	@ApiField("check_date")
	private String checkDate;

	/**
	 * 统一社会信用代码
	 */
	@ApiField("credit_code")
	private String creditCode;

	/**
	 * 企信标识企业唯一ID
	 */
	@ApiField("ent_id")
	private String entId;

	/**
	 * 企业名称
	 */
	@ApiField("ent_name")
	private String entName;

	/**
	 * 企业状态：在营（开业）、迁出、注销、吊销、撤销登记、撤销、停业
	 */
	@ApiField("ent_status")
	private String entStatus;

	/**
	 * 企业类型
	 */
	@ApiField("ent_type")
	private String entType;

	/**
	 * 成立日期
	 */
	@ApiField("es_date")
	private String esDate;

	/**
	 * 法定代表人姓名
	 */
	@ApiField("fr_name")
	private String frName;

	/**
	 * 注册地址
	 */
	@ApiField("reg_addr")
	private String regAddr;

	/**
	 * 注册资本(万元）
	 */
	@ApiField("reg_cap")
	private String regCap;

	/**
	 * 注册币种
	 */
	@ApiField("reg_cap_cur")
	private String regCapCur;

	/**
	 * 注册号
	 */
	@ApiField("reg_no")
	private String regNo;

	/**
	 * 关系类型
	 */
	@ApiField("rel_type_code")
	private String relTypeCode;

	public String getCheckDate() {
		return this.checkDate;
	}
	public void setCheckDate(String checkDate) {
		this.checkDate = checkDate;
	}

	public String getCreditCode() {
		return this.creditCode;
	}
	public void setCreditCode(String creditCode) {
		this.creditCode = creditCode;
	}

	public String getEntId() {
		return this.entId;
	}
	public void setEntId(String entId) {
		this.entId = entId;
	}

	public String getEntName() {
		return this.entName;
	}
	public void setEntName(String entName) {
		this.entName = entName;
	}

	public String getEntStatus() {
		return this.entStatus;
	}
	public void setEntStatus(String entStatus) {
		this.entStatus = entStatus;
	}

	public String getEntType() {
		return this.entType;
	}
	public void setEntType(String entType) {
		this.entType = entType;
	}

	public String getEsDate() {
		return this.esDate;
	}
	public void setEsDate(String esDate) {
		this.esDate = esDate;
	}

	public String getFrName() {
		return this.frName;
	}
	public void setFrName(String frName) {
		this.frName = frName;
	}

	public String getRegAddr() {
		return this.regAddr;
	}
	public void setRegAddr(String regAddr) {
		this.regAddr = regAddr;
	}

	public String getRegCap() {
		return this.regCap;
	}
	public void setRegCap(String regCap) {
		this.regCap = regCap;
	}

	public String getRegCapCur() {
		return this.regCapCur;
	}
	public void setRegCapCur(String regCapCur) {
		this.regCapCur = regCapCur;
	}

	public String getRegNo() {
		return this.regNo;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public String getRelTypeCode() {
		return this.relTypeCode;
	}
	public void setRelTypeCode(String relTypeCode) {
		this.relTypeCode = relTypeCode;
	}

}
