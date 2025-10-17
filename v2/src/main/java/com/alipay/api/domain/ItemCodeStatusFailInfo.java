package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 上下架操作失败信息
 *
 * @author auto create
 * @since 1.0, 2025-01-14 14:27:23
 */
public class ItemCodeStatusFailInfo extends AlipayObject {

	private static final long serialVersionUID = 2473187343784513773L;

	/**
	 * 提示信息
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * app方商品编码
	 */
	@ApiField("item_code")
	private String itemCode;

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getItemCode() {
		return this.itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

}
