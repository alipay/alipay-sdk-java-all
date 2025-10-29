package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 收货地址
 *
 * @author auto create
 * @since 1.0, 2025-07-02 15:11:59
 */
public class RentOrderReceiverAddressInfoVO extends AlipayObject {

	private static final long serialVersionUID = 4173862288432664921L;

	/**
	 * 收货地址信息
	 */
	@ApiField("detailed_address")
	private String detailedAddress;

	/**
	 * 收货人姓名
	 */
	@ApiField("receiver_name")
	private String receiverName;

	/**
	 * 收货人手机号
	 */
	@ApiField("tel_number")
	private String telNumber;

	public String getDetailedAddress() {
		return this.detailedAddress;
	}
	public void setDetailedAddress(String detailedAddress) {
		this.detailedAddress = detailedAddress;
	}

	public String getReceiverName() {
		return this.receiverName;
	}
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public String getTelNumber() {
		return this.telNumber;
	}
	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}

}
