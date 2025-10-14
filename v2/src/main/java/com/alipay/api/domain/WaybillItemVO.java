package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * B2C订单快递运单配送同步接口的商品信息
 *
 * @author auto create
 * @since 1.0, 2025-03-20 17:21:54
 */
public class WaybillItemVO extends AlipayObject {

	private static final long serialVersionUID = 4126736788616658169L;

	/**
	 * APP方商品编码，对应商品接口的sku_code｜商品编码
	 */
	@ApiField("app_item_code")
	private String appItemCode;

	/**
	 * 商品名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 商品数量
	 */
	@ApiField("quantity_item")
	private Long quantityItem;

	public String getAppItemCode() {
		return this.appItemCode;
	}
	public void setAppItemCode(String appItemCode) {
		this.appItemCode = appItemCode;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Long getQuantityItem() {
		return this.quantityItem;
	}
	public void setQuantityItem(Long quantityItem) {
		this.quantityItem = quantityItem;
	}

}
