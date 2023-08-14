package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 收货人及地址信息
 *
 * @author auto create
 * @since 1.0, 2023-03-23 16:22:11
 */
public class ReceiverAddressInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 2846921913318762955L;

	/**
	 * 收获地址
	 */
	@ApiField("receiver_address")
	private String receiverAddress;

	/**
	 * 标准城市域码
	 */
	@ApiField("receiver_division_code")
	private String receiverDivisionCode;

	/**
	 * 收货人手机号
	 */
	@ApiField("receiver_mobile")
	private String receiverMobile;

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

	public String getReceiverAddress() {
		return this.receiverAddress;
	}
	public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
	}

	public String getReceiverDivisionCode() {
		return this.receiverDivisionCode;
	}
	public void setReceiverDivisionCode(String receiverDivisionCode) {
		this.receiverDivisionCode = receiverDivisionCode;
	}

	public String getReceiverMobile() {
		return this.receiverMobile;
	}
	public void setReceiverMobile(String receiverMobile) {
		this.receiverMobile = receiverMobile;
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

}
