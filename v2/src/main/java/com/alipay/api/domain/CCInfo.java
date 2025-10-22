package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 清关信息复杂类型
 *
 * @author auto create
 * @since 1.0, 2023-12-08 16:43:50
 */
public class CCInfo extends AlipayObject {

	private static final long serialVersionUID = 4754142283338786331L;

	/**
	 * 收件人详细地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 清关资质等扩展信息
	 */
	@ApiField("cc_ext")
	private String ccExt;

	/**
	 * 国家及地区编码
	 */
	@ApiField("cr_code")
	private String crCode;

	/**
	 * 国家及地区描述
	 */
	@ApiField("cr_desc")
	private String crDesc;

	/**
	 * 邮箱
	 */
	@ApiField("email")
	private String email;

	/**
	 * 物料中文名
	 */
	@ApiField("item_alias_name")
	private String itemAliasName;

	/**
	 * 物料描述：含材质、用途
	 */
	@ApiField("item_desc")
	private String itemDesc;

	/**
	 * 物料id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 物料英文名
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 物料份数
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 收件公司全名
	 */
	@ApiField("recipient_entity_name")
	private String recipientEntityName;

	/**
	 * 收件人姓名: first name + last name 空格分隔
	 */
	@ApiField("recipient_name")
	private String recipientName;

	/**
	 * 收件人电话
	 */
	@ApiField("recipient_phone")
	private String recipientPhone;

	/**
	 * 申报价值单件价
	 */
	@ApiField("unit_price")
	private String unitPrice;

	/**
	 * 邮编
	 */
	@ApiField("zip_code")
	private String zipCode;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getCcExt() {
		return this.ccExt;
	}
	public void setCcExt(String ccExt) {
		this.ccExt = ccExt;
	}

	public String getCrCode() {
		return this.crCode;
	}
	public void setCrCode(String crCode) {
		this.crCode = crCode;
	}

	public String getCrDesc() {
		return this.crDesc;
	}
	public void setCrDesc(String crDesc) {
		this.crDesc = crDesc;
	}

	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getItemAliasName() {
		return this.itemAliasName;
	}
	public void setItemAliasName(String itemAliasName) {
		this.itemAliasName = itemAliasName;
	}

	public String getItemDesc() {
		return this.itemDesc;
	}
	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public String getRecipientEntityName() {
		return this.recipientEntityName;
	}
	public void setRecipientEntityName(String recipientEntityName) {
		this.recipientEntityName = recipientEntityName;
	}

	public String getRecipientName() {
		return this.recipientName;
	}
	public void setRecipientName(String recipientName) {
		this.recipientName = recipientName;
	}

	public String getRecipientPhone() {
		return this.recipientPhone;
	}
	public void setRecipientPhone(String recipientPhone) {
		this.recipientPhone = recipientPhone;
	}

	public String getUnitPrice() {
		return this.unitPrice;
	}
	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getZipCode() {
		return this.zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

}
