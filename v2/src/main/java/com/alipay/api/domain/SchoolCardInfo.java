package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 校园卡基本信息
 *
 * @author auto create
 * @since 1.0, 2025-05-29 16:18:48
 */
public class SchoolCardInfo extends AlipayObject {

	private static final long serialVersionUID = 1289133755196132941L;

	/**
	 * 支付宝校园卡卡号
	 */
	@ApiField("alipay_card_no")
	private String alipayCardNo;

	/**
	 * 认证类型， 1:官方校园卡；2:一卡通
	 */
	@ApiField("auth_type")
	private String authType;

	/**
	 * 学号
	 */
	@ApiField("campus_no")
	private String campusNo;

	/**
	 * 支付宝校园卡类型，1:学生卡；2.教工卡
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * 创建时间，格式"yyyy-MM-dd HH:mm:ss"
	 */
	@ApiField("create_time")
	private String createTime;

	/**
	 * 展示码类型， 0:在线码；1:离线码
	 */
	@ApiField("display_code_type")
	private String displayCodeType;

	/**
	 * 姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 支付宝用户的userId
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 一卡通实体卡号
	 */
	@ApiField("physical_card_number")
	private String physicalCardNumber;

	/**
	 * 支付宝学校编码
	 */
	@ApiField("school_id")
	private String schoolId;

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
	 * isv分配的学生短码
	 */
	@ApiField("short_code")
	private String shortCode;

	/**
	 * 支付宝校园卡状态，0:有效，1:无效
	 */
	@ApiField("status")
	private String status;

	/**
	 * 支付宝用户的userId
	 */
	@ApiField("user_id")
	private String userId;

	public String getAlipayCardNo() {
		return this.alipayCardNo;
	}
	public void setAlipayCardNo(String alipayCardNo) {
		this.alipayCardNo = alipayCardNo;
	}

	public String getAuthType() {
		return this.authType;
	}
	public void setAuthType(String authType) {
		this.authType = authType;
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

	public String getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getDisplayCodeType() {
		return this.displayCodeType;
	}
	public void setDisplayCodeType(String displayCodeType) {
		this.displayCodeType = displayCodeType;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPhysicalCardNumber() {
		return this.physicalCardNumber;
	}
	public void setPhysicalCardNumber(String physicalCardNumber) {
		this.physicalCardNumber = physicalCardNumber;
	}

	public String getSchoolId() {
		return this.schoolId;
	}
	public void setSchoolId(String schoolId) {
		this.schoolId = schoolId;
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

	public String getShortCode() {
		return this.shortCode;
	}
	public void setShortCode(String shortCode) {
		this.shortCode = shortCode;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
