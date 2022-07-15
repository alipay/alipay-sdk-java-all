package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ISV回传的会员身份
 *
 * @author auto create
 * @since 1.0, 2017-12-22 16:04:33
 */
public class MemberShip extends AlipayObject {

	private static final long serialVersionUID = 2736184776855552924L;

	/**
	 * 银行卡号
	 */
	@ApiField("bank_card_no")
	private String bankCardNo;

	/**
	 * 会员二代身份证号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 邮箱号码
	 */
	@ApiField("email")
	private String email;

	/**
	 * MAC地址
	 */
	@ApiField("mac")
	private String mac;

	/**
	 * 11位手机号码
	 */
	@ApiField("mobile_phone_no")
	private String mobilePhoneNo;

	public String getBankCardNo() {
		return this.bankCardNo;
	}
	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getMac() {
		return this.mac;
	}
	public void setMac(String mac) {
		this.mac = mac;
	}

	public String getMobilePhoneNo() {
		return this.mobilePhoneNo;
	}
	public void setMobilePhoneNo(String mobilePhoneNo) {
		this.mobilePhoneNo = mobilePhoneNo;
	}

}
