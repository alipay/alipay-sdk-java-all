package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 阶梯价信息
 *
 * @author auto create
 * @since 1.0, 2023-04-26 10:18:15
 */
public class AccessLadderPriceDto extends AlipayObject {

	private static final long serialVersionUID = 3692423777777569973L;

	/**
	 * minimum_purchase_quantity，用于商品同步，由调用方传入
	 */
	@ApiField("minimum_purchase_quantity")
	private String minimumPurchaseQuantity;

	/**
	 * origin_unit_price，用于商品同步，由调用方传入
	 */
	@ApiField("origin_unit_price")
	private String originUnitPrice;

	/**
	 * unit_price，用于商品同步，由调用方传入
	 */
	@ApiField("unit_price")
	private String unitPrice;

	public String getMinimumPurchaseQuantity() {
		return this.minimumPurchaseQuantity;
	}
	public void setMinimumPurchaseQuantity(String minimumPurchaseQuantity) {
		this.minimumPurchaseQuantity = minimumPurchaseQuantity;
	}

	public String getOriginUnitPrice() {
		return this.originUnitPrice;
	}
	public void setOriginUnitPrice(String originUnitPrice) {
		this.originUnitPrice = originUnitPrice;
	}

	public String getUnitPrice() {
		return this.unitPrice;
	}
	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}

}
