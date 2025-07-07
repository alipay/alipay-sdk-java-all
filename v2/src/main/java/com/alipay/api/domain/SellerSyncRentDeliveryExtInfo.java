package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物流扩展信息
 *
 * @author auto create
 * @since 1.0, 2025-06-06 15:37:29
 */
public class SellerSyncRentDeliveryExtInfo extends AlipayObject {

	private static final long serialVersionUID = 6193941424525985273L;

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

}
