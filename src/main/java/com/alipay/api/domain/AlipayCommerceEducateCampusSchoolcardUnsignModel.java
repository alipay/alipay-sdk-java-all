package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝校园卡删除
 *
 * @author auto create
 * @since 1.0, 2022-06-07 19:12:03
 */
public class AlipayCommerceEducateCampusSchoolcardUnsignModel extends AlipayObject {

	private static final long serialVersionUID = 3775772814678743956L;

	/**
	 * 学校签约的签约ID，由支付宝生成，分配给商户
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 授权签约协议号，由支付宝生成，分配给商户
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 学生支付宝账号： identity_type是ALIPAY_USER_ID填支付宝会员ID（2088开头）； 是ALIPAY_LOGON_ID 填支付宝登录号
	 */
	@ApiField("identity")
	private String identity;

	/**
	 * 账号类型，目前支持如下类型： 1、ALIPAY_USER_ID 支付宝的会员ID 2、ALIPAY_LOGON_ID：支付宝登录号，支持邮箱和手机号格式
	 */
	@ApiField("identity_type")
	private String identityType;

	/**
	 * 学生姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 学校内标，一般为2088开头的16位数字。支付宝分配，可直接咨询支付宝对接小二，也可通过开放平台接口查询
	 */
	@ApiField("school_id")
	private String schoolId;

	/**
	 * 同学校分配给某学生的唯一标识，可以是学号、一卡通卡号等
	 */
	@ApiField("student_id")
	private String studentId;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getIdentity() {
		return this.identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public String getIdentityType() {
		return this.identityType;
	}
	public void setIdentityType(String identityType) {
		this.identityType = identityType;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getSchoolId() {
		return this.schoolId;
	}
	public void setSchoolId(String schoolId) {
		this.schoolId = schoolId;
	}

	public String getStudentId() {
		return this.studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

}
