package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业务扩展对象
 *
 * @author auto create
 * @since 1.0, 2023-03-24 20:29:09
 */
public class BusinessParamDTO extends AlipayObject {

	private static final long serialVersionUID = 2228776812821938238L;

	/**
	 * 授权协议号，可选。如果已经有有效的授权协议并提供时，会不会创建新的授权协议信息。
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 联系人
	 */
	@ApiField("contact_name")
	private String contactName;

	/**
	 * 联系电话
	 */
	@ApiField("contact_phone_number")
	private String contactPhoneNumber;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getContactName() {
		return this.contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactPhoneNumber() {
		return this.contactPhoneNumber;
	}
	public void setContactPhoneNumber(String contactPhoneNumber) {
		this.contactPhoneNumber = contactPhoneNumber;
	}

}
