package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 采购单渲染咨询
 *
 * @author auto create
 * @since 1.0, 2024-07-01 14:05:18
 */
public class AlipayCloudCloudpromoMallPurchaseConsultModel extends AlipayObject {

	private static final long serialVersionUID = 6369617254526723899L;

	/**
	 * 详细地址
	 */
	@ApiField("address_detail")
	private String addressDetail;

	/**
	 * 地址id 当前字段已废弃(迭代后无需此字段，已合并进address_detail)
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
	 * 四级地址code（区/县级）
	 */
	@ApiField("division_code")
	private String divisionCode;

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

	/**
	 * 五级地址code（乡镇/街道级)
	 */
	@ApiField("town_division_code")
	private String townDivisionCode;

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

	public String getDivisionCode() {
		return this.divisionCode;
	}
	public void setDivisionCode(String divisionCode) {
		this.divisionCode = divisionCode;
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

	public String getTownDivisionCode() {
		return this.townDivisionCode;
	}
	public void setTownDivisionCode(String townDivisionCode) {
		this.townDivisionCode = townDivisionCode;
	}

}
