package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * alipay.boss.prod.companyauth.query
 *
 * @author auto create
 * @since 1.0, 2024-06-07 15:31:11
 */
public class PersonSimpleVO extends AlipayObject {

	private static final long serialVersionUID = 4769484535623889168L;

	/**
	 * 证件id
	 */
	@ApiField("cert_id")
	private String certId;

	/**
	 * 地区
	 */
	@ApiField("id_country")
	private String idCountry;

	/**
	 * 证件号
	 */
	@ApiField("id_no")
	private String idNo;

	/**
	 * 证件类型
	 */
	@ApiField("id_type")
	private String idType;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 花名
	 */
	@ApiField("nick_name")
	private String nickName;

	/**
	 * 人员分类
	 */
	@ApiField("person_classfy_type")
	private String personClassfyType;

	/**
	 * 性别
	 */
	@ApiField("person_gender")
	private String personGender;

	/**
	 * 人员id
	 */
	@ApiField("person_id")
	private String personId;

	/**
	 * 中文名
	 */
	@ApiField("person_name")
	private String personName;

	/**
	 * 英文名
	 */
	@ApiField("person_name_en")
	private String personNameEn;

	/**
	 * 工号
	 */
	@ApiField("work_no")
	private String workNo;

	public String getCertId() {
		return this.certId;
	}
	public void setCertId(String certId) {
		this.certId = certId;
	}

	public String getIdCountry() {
		return this.idCountry;
	}
	public void setIdCountry(String idCountry) {
		this.idCountry = idCountry;
	}

	public String getIdNo() {
		return this.idNo;
	}
	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

	public String getIdType() {
		return this.idType;
	}
	public void setIdType(String idType) {
		this.idType = idType;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getNickName() {
		return this.nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getPersonClassfyType() {
		return this.personClassfyType;
	}
	public void setPersonClassfyType(String personClassfyType) {
		this.personClassfyType = personClassfyType;
	}

	public String getPersonGender() {
		return this.personGender;
	}
	public void setPersonGender(String personGender) {
		this.personGender = personGender;
	}

	public String getPersonId() {
		return this.personId;
	}
	public void setPersonId(String personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return this.personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getPersonNameEn() {
		return this.personNameEn;
	}
	public void setPersonNameEn(String personNameEn) {
		this.personNameEn = personNameEn;
	}

	public String getWorkNo() {
		return this.workNo;
	}
	public void setWorkNo(String workNo) {
		this.workNo = workNo;
	}

}
