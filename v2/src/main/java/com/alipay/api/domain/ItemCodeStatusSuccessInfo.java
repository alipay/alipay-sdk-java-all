package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 上下架操作成功信息
 *
 * @author auto create
 * @since 1.0, 2025-01-14 14:27:23
 */
public class ItemCodeStatusSuccessInfo extends AlipayObject {

	private static final long serialVersionUID = 4125419424981598482L;

	/**
	 * app方商品编码
	 */
	@ApiField("item_code")
	private String itemCode;

	public String getItemCode() {
		return this.itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

}
