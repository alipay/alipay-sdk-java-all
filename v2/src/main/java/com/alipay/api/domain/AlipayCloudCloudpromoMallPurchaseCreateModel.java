package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 采购单创建
 *
 * @author auto create
 * @since 1.0, 2024-06-21 16:02:15
 */
public class AlipayCloudCloudpromoMallPurchaseCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4615418395365499939L;

	/**
	 * 详细地址
	 */
	@ApiField("address_detail")
	private String addressDetail;

	/**
	 * 地址id 当前字段已废弃(填写完整address_detail即可)
	 */
	@ApiField("address_id")
	@Deprecated
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
	 * 商品列表
	 */
	@ApiListField("product_list")
	@ApiField("product_v_o")
	private List<ProductVO> productList;

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

	public List<ProductVO> getProductList() {
		return this.productList;
	}
	public void setProductList(List<ProductVO> productList) {
		this.productList = productList;
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
