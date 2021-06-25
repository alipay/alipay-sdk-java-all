package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 一卡通变更通知
 *
 * @author auto create
 * @since 1.0, 2020-06-25 15:12:55
 */
public class AlipayCommerceEducateAuthenticateCampuscardModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3599828937316974998L;

	/**
	 * 校区
	 */
	@ApiField("campus")
	private String campus;

	/**
	 * 学工号
	 */
	@ApiField("campus_no")
	private String campusNo;

	/**
	 * 一卡通卡号（实体卡）
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 1有效，2无效，3挂失
	 */
	@ApiField("card_status")
	private String cardStatus;

	/**
	 * 1学生卡，2教工卡，3临时卡，4其他
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * 学生证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 学生证件类型，默认为1:
1 居民身份证
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 一卡通芯片号
	 */
	@ApiField("chip_no")
	private String chipNo;

	/**
	 * 邮箱地址
	 */
	@ApiField("email")
	private String email;

	/**
	 * 有效期，格式"yyyy-MM-dd HH:mm:ss"
	 */
	@ApiField("expire_at")
	private String expireAt;

	/**
	 * 扩展信息，json格式
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 学生性别,0未知，1男，2女，9未说明的性别
	 */
	@ApiField("gender")
	private String gender;

	/**
	 * base64编码人脸照片
	 */
	@ApiField("image_base_64")
	private String imageBase64;

	/**
	 * 人脸采集时间，格式"yyyy-MM-dd HH:mm:ss"
	 */
	@ApiField("image_date")
	private String imageDate;

	/**
	 * 学生/教职工在学校唯一短号，由isv分配
	 */
	@ApiField("isv_short_code")
	private String isvShortCode;

	/**
	 * 学生手机
	 */
	@ApiField("mobile_no")
	private String mobileNo;

	/**
	 * 学生/教职工姓名
	 */
	@ApiField("name")
	private String name;

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
	 * 学校标识码
	 */
	@ApiField("school_stdcode")
	private String schoolStdcode;

	/**
	 * 学生/教职工在学校唯一短号，此字段废弃
	 */
	@ApiField("short_code")
	private Long shortCode;

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

	public String getCardNo() {
		return this.cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getCardStatus() {
		return this.cardStatus;
	}
	public void setCardStatus(String cardStatus) {
		this.cardStatus = cardStatus;
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

	public String getChipNo() {
		return this.chipNo;
	}
	public void setChipNo(String chipNo) {
		this.chipNo = chipNo;
	}

	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getExpireAt() {
		return this.expireAt;
	}
	public void setExpireAt(String expireAt) {
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

	public String getImageBase64() {
		return this.imageBase64;
	}
	public void setImageBase64(String imageBase64) {
		this.imageBase64 = imageBase64;
	}

	public String getImageDate() {
		return this.imageDate;
	}
	public void setImageDate(String imageDate) {
		this.imageDate = imageDate;
	}

	public String getIsvShortCode() {
		return this.isvShortCode;
	}
	public void setIsvShortCode(String isvShortCode) {
		this.isvShortCode = isvShortCode;
	}

	public String getMobileNo() {
		return this.mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
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

	public Long getShortCode() {
		return this.shortCode;
	}
	public void setShortCode(Long shortCode) {
		this.shortCode = shortCode;
	}

}
