package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 加油商品状态修改
 *
 * @author auto create
 * @since 1.0, 2025-10-10 11:52:40
 */
public class AlipayCommerceGasItemStatusModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2713968883367317137L;

	/**
	 * 商品id(和external_item_id不能同时为空)
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品状态： EFFECT（有效）、 INVALID（无效）
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
