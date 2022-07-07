package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物流信息
 *
 * @author auto create
 * @since 1.0, 2021-11-10 17:36:10
 */
public class Shipping extends AlipayObject {

	private static final long serialVersionUID = 6338733939413462848L;

	/**
	 * 收货人地址
	 */
	@ApiField("receiver_address")
	private PaymentAddress receiverAddress;

	/**
	 * test@alipay.com
	 */
	@ApiField("receiver_email")
	private String receiverEmail;

	/**
	 * 收货人名称
	 */
	@ApiField("receiver_name")
	private String receiverName;

	/**
	 * 收货人手机号
	 */
	@ApiField("receiver_phone_no")
	private String receiverPhoneNo;

	public PaymentAddress getReceiverAddress() {
		return this.receiverAddress;
	}
	public void setReceiverAddress(PaymentAddress receiverAddress) {
		this.receiverAddress = receiverAddress;
	}

	public String getReceiverEmail() {
		return this.receiverEmail;
	}
	public void setReceiverEmail(String receiverEmail) {
		this.receiverEmail = receiverEmail;
	}

	public String getReceiverName() {
		return this.receiverName;
	}
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public String getReceiverPhoneNo() {
		return this.receiverPhoneNo;
	}
	public void setReceiverPhoneNo(String receiverPhoneNo) {
		this.receiverPhoneNo = receiverPhoneNo;
	}

}
