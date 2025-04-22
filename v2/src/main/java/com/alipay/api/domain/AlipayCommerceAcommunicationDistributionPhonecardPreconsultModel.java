package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 号卡办理资料校验
 *
 * @author auto create
 * @since 1.0, 2024-11-08 11:42:17
 */
public class AlipayCommerceAcommunicationDistributionPhonecardPreconsultModel extends AlipayObject {

	private static final long serialVersionUID = 4744318375826325794L;

	/**
	 * 号卡办理人姓名
	 */
	@ApiField("cert_name")
	private String certName;

	/**
	 * 号卡办理人身份证号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 号卡商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 号卡归属地省份、城市编码
	 */
	@ApiField("phone_card_address")
	private PhoneCardAddressModel phoneCardAddress;

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

}
