package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁物流扩展信息
 *
 * @author auto create
 * @since 1.0, 2025-03-18 16:05:55
 */
public class RentDeliveryExtInfo extends AlipayObject {

	private static final long serialVersionUID = 3197478837277258897L;

	/**
	 * 物流公司的物流单号，例如：顺丰的物流单号
	 */
	@ApiField("delivery_no")
	private String deliveryNo;

	/**
	 * 收货地址
	 */
	@ApiField("receive_address")
	private RentAddress receiveAddress;

	/**
	 * 确认收货照片
	 */
	@ApiField("received_pic")
	private RentFile receivedPic;

	public String getDeliveryNo() {
		return this.deliveryNo;
	}
	public void setDeliveryNo(String deliveryNo) {
		this.deliveryNo = deliveryNo;
	}

	public RentAddress getReceiveAddress() {
		return this.receiveAddress;
	}
	public void setReceiveAddress(RentAddress receiveAddress) {
		this.receiveAddress = receiveAddress;
	}

	public RentFile getReceivedPic() {
		return this.receivedPic;
	}
	public void setReceivedPic(RentFile receivedPic) {
		this.receivedPic = receivedPic;
	}

}
