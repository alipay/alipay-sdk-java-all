package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 高校ISV认证信息同步
 *
 * @author auto create
 * @since 1.0, 2020-08-10 17:17:02
 */
public class AlipayCommerceEducateAuthenticateCampuscardCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6674823781353389659L;

	/**
	 * 校区
	 */
	@ApiField("campus")
	private String campus;

	/**
	 * 自然人在学校唯一编号
	 */
	@ApiField("campus_no")
	private String campusNo;

	/**
	 * 1学生卡，2教工卡，3临时卡，4其他
不传默认是学生卡
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * 证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 毕业时间
	 */
	@ApiField("expire_at")
	private Date expireAt;

	/**
	 * 扩展字段，json格式
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 性别
	 */
	@ApiField("gender")
	private String gender;

	/**
	 * 学生/教职工在学校唯一短号，由isv分配
	 */
	@ApiField("isv_short_code")
	private String isvShortCode;

	/**
	 * 组织信息,多个分组以;隔开：AA/BB/CC;A/B/C
	 */
	@ApiField("organization")
	private String organization;

	/**
	 * 学校名称
	 */
	@ApiField("school_name")
	private String schoolName;

	/**
	 * 学校国标码
	 */
	@ApiField("school_stdcode")
	private String schoolStdcode;

	/**
	 * 用户姓名
	 */
	@ApiField("user_name")
	private String userName;

	public String getCampus() {
		return this.campus;
	}
	public void setCampus(String campus) {
		this.campus = campus;
	}

	public String getCampusNo() {
		return this.campusNo;
	}
	public void setCampusNo(String campusNo) {
		this.campusNo = campusNo;
	}

	public String getCardType() {
		return this.cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
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

	public Date getExpireAt() {
		return this.expireAt;
	}
	public void setExpireAt(Date expireAt) {
		this.expireAt = expireAt;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getGender() {
		return this.gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getIsvShortCode() {
		return this.isvShortCode;
	}
	public void setIsvShortCode(String isvShortCode) {
		this.isvShortCode = isvShortCode;
	}

	public String getOrganization() {
		return this.organization;
	}
	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public String getSchoolName() {
		return this.schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getSchoolStdcode() {
		return this.schoolStdcode;
	}
	public void setSchoolStdcode(String schoolStdcode) {
		this.schoolStdcode = schoolStdcode;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
