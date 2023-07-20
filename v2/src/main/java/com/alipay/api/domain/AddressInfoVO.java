package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 收货地址信息模型
 *
 * @author auto create
 * @since 1.0, 2023-04-06 20:10:31
 */
public class AddressInfoVO extends AlipayObject {

	private static final long serialVersionUID = 5241862865594369559L;

	/**
	 * 详细收货地址信息
	 */
	@ApiField("detailed_address")
	private String detailedAddress;

	/**
	 * 收件人姓名
	 */
	@ApiField("receiver_name")
	private String receiverName;

	/**
	 * 收件人手机号码
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
