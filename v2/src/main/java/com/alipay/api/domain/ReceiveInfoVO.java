package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 接收信息
 *
 * @author auto create
 * @since 1.0, 2022-11-09 13:39:25
 */
public class ReceiveInfoVO extends AlipayObject {

	private static final long serialVersionUID = 2518316135319143289L;

	/**
	 * 邮寄地址。专票必传
	 */
	@ApiField("mail_address")
	private String mailAddress;

	/**
	 * 收件人姓名。专票时必传
	 */
	@ApiField("mail_name")
	private String mailName;

	/**
	 * 收件人手机号。专票时必填
	 */
	@ApiField("mail_phone")
	private String mailPhone;

	/**
	 * 邮箱地址。接收电子发票时必传
	 */
	@ApiField("receive_email")
	private String receiveEmail;

	public String getMailAddress() {
		return this.mailAddress;
	}
	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public String getMailName() {
		return this.mailName;
	}
	public void setMailName(String mailName) {
		this.mailName = mailName;
	}

	public String getMailPhone() {
		return this.mailPhone;
	}
	public void setMailPhone(String mailPhone) {
		this.mailPhone = mailPhone;
	}

	public String getReceiveEmail() {
		return this.receiveEmail;
	}
	public void setReceiveEmail(String receiveEmail) {
		this.receiveEmail = receiveEmail;
	}

}
