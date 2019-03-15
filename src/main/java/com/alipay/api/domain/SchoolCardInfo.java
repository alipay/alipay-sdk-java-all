package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 校园卡基本信息
 *
 * @author auto create
 * @since 1.0, 2019-02-27 19:30:44
 */
public class SchoolCardInfo extends AlipayObject {

	private static final long serialVersionUID = 5438351539969981325L;

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
	 * 支付宝校园卡类型，1:学生卡；2.教工卡
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * 姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 一卡通实体卡号
	 */
	@ApiField("physical_card_number")
	private String physicalCardNumber;

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
	 * 支付宝校园卡状态，0:无效，1:有效
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

	public String getCardType() {
		return this.cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPhysicalCardNumber() {
		return this.physicalCardNumber;
	}
	public void setPhysicalCardNumber(String physicalCardNumber) {
		this.physicalCardNumber = physicalCardNumber;
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
