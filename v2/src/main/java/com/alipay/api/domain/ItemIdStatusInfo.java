package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 要操作的商品id和上下架状态信息
 *
 * @author auto create
 * @since 1.0, 2025-01-14 14:27:45
 */
public class ItemIdStatusInfo extends AlipayObject {

	private static final long serialVersionUID = 2163566342273222761L;

	/**
	 * 商品app方编码, 用于标识门店内唯一一个商品
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 操作类型, 0上架, -1下架
	 */
	@ApiField("status")
	private String status;

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
