package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单收货地址
 *
 * @author auto create
 * @since 1.0, 2025-04-10 15:12:29
 */
public class RentReceiverAddressInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 2568291252497823296L;

	/**
	 * 收货地址信息
	 */
	@ApiField("detailed_address")
	private String detailedAddress;

	/**
	 * 标准城市域码
	 */
	@ApiField("receiver_division_code")
	private String receiverDivisionCode;

	/**
	 * 收货人姓名
	 */
	@ApiField("receiver_name")
	private String receiverName;

	/**
	 * 收货邮编地址
	 */
	@ApiField("receiver_zip")
	private String receiverZip;

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

	public String getReceiverDivisionCode() {
		return this.receiverDivisionCode;
	}
	public void setReceiverDivisionCode(String receiverDivisionCode) {
		this.receiverDivisionCode = receiverDivisionCode;
	}

	public String getReceiverName() {
		return this.receiverName;
	}
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public String getReceiverZip() {
		return this.receiverZip;
	}
	public void setReceiverZip(String receiverZip) {
		this.receiverZip = receiverZip;
	}

	public String getTelNumber() {
		return this.telNumber;
	}
	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}

}
