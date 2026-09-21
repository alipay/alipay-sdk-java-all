package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 费用项明细
 *
 * @author auto create
 * @since 1.0, 2026-09-14 17:40:57
 */
public class FeeItemLineDTO extends AlipayObject {

	private static final long serialVersionUID = 2281162616883416134L;

	/**
	 * 金额总量 = price * quantity，单位：分，188898表示1888.98元
	 */
	@ApiField("amount")
	private Long amount;

	/**
	 * 费用项名称，如"血常规检查"、"一次性采血管"
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 该项费用单价，单位：分，188898表示1888.98元
	 */
	@ApiField("price")
	private Long price;

	/**
	 * 数量，单位：个
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 关联的商品编码
	 */
	@ApiField("sku_code")
	private String skuCode;

	public Long getAmount() {
		return this.amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Long getPrice() {
		return this.price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public String getSkuCode() {
		return this.skuCode;
	}
	public void setSkuCode(String skuCode) {
		this.skuCode = skuCode;
	}

}
