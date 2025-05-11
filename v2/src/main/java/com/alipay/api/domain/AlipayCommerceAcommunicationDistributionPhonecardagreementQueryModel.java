package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 号卡办理协议查询
 *
 * @author auto create
 * @since 1.0, 2024-11-08 11:42:15
 */
public class AlipayCommerceAcommunicationDistributionPhonecardagreementQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8792214247376335851L;

	/**
	 * 办理人姓名
	 */
	@ApiField("cert_name")
	private String certName;

	/**
	 * 办理人身份证号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 办理人联系电话
	 */
	@ApiField("contact_phone_number")
	private String contactPhoneNumber;

	/**
	 * 号卡商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 号卡归属地省市编码，非选号可不填
	 */
	@ApiField("phone_card_address")
	private PhoneCardAddressModel phoneCardAddress;

	/**
	 * 用户选占的手机号，非选号商品可不传
	 */
	@ApiField("phone_num")
	private String phoneNum;

	public String getCertName() {
		return this.certName;
	}
	public void setCertName(String certName) {
		this.certName = certName;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getContactPhoneNumber() {
		return this.contactPhoneNumber;
	}
	public void setContactPhoneNumber(String contactPhoneNumber) {
		this.contactPhoneNumber = contactPhoneNumber;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public PhoneCardAddressModel getPhoneCardAddress() {
		return this.phoneCardAddress;
	}
	public void setPhoneCardAddress(PhoneCardAddressModel phoneCardAddress) {
		this.phoneCardAddress = phoneCardAddress;
	}

	public String getPhoneNum() {
		return this.phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

}
