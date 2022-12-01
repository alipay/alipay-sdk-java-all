package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户请求发放集分宝的对象模型
 *
 * @author auto create
 * @since 1.0, 2020-08-11 15:38:26
 */
public class RebateGood extends AlipayObject {

	private static final long serialVersionUID = 7228255687287127473L;

	/**
	 * 商户侧商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品数量
	 */
	@ApiField("quantity")
	private String quantity;

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getQuantity() {
		return this.quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

}
