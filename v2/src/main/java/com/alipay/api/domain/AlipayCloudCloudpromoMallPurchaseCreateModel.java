package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 采购单创建
 *
 * @author auto create
 * @since 1.0, 2024-06-04 20:13:40
 */
public class AlipayCloudCloudpromoMallPurchaseCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3175571544326215315L;

	/**
	 * 详细地址
	 */
	@ApiField("address_detail")
	private String addressDetail;

	/**
	 * 地址id
	 */
	@ApiField("address_id")
	private String addressId;

	/**
	 * 购买者
	 */
	@ApiField("buyer")
	private String buyer;

	/**
	 * 外部orderId
	 */
	@ApiField("outer_purchase_id")
	private String outerPurchaseId;

	/**
	 * 收货人
	 */
	@ApiField("receiver")
	private String receiver;

	/**
	 * 收货人电话
	 */
	@ApiField("receiver_phone")
	private String receiverPhone;

	public String getAddressDetail() {
		return this.addressDetail;
	}
	public void setAddressDetail(String addressDetail) {
		this.addressDetail = addressDetail;
	}

	public String getAddressId() {
		return this.addressId;
	}
	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}

	public String getBuyer() {
		return this.buyer;
	}
	public void setBuyer(String buyer) {
		this.buyer = buyer;
	}

	public String getOuterPurchaseId() {
		return this.outerPurchaseId;
	}
	public void setOuterPurchaseId(String outerPurchaseId) {
		this.outerPurchaseId = outerPurchaseId;
	}

	public String getReceiver() {
		return this.receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getReceiverPhone() {
		return this.receiverPhone;
	}
	public void setReceiverPhone(String receiverPhone) {
		this.receiverPhone = receiverPhone;
	}

}
