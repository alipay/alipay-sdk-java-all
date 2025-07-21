package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 号卡办理选号
 *
 * @author auto create
 * @since 1.0, 2024-11-08 11:42:16
 */
public class AlipayCommerceAcommunicationDistributionPhonecardnoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4352617375236912312L;

	/**
	 * 商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 号卡归属地
	 */
	@ApiField("phone_card_address")
	private PhoneCardAddressModel phoneCardAddress;

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
