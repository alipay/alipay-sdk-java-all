package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * isv解除认证关系
 *
 * @author auto create
 * @since 1.0, 2023-08-18 22:45:14
 */
public class AlipayCommerceEducateAuthenticateCampuscardDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 1685616431652784721L;

	/**
	 * 卡号，证件号与卡号至少存在一个
	 */
	@ApiField("card_number")
	private String cardNumber;

	/**
	 * 证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 学生证件类型，默认为1: 1 居民身份证
	 */
	@ApiField("cert_type")
	private String certType;

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

	public String getCardNumber() {
		return this.cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
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
