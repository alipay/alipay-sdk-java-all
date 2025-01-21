package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 要操作上下架商品的itemCode和操作类型信息
 *
 * @author auto create
 * @since 1.0, 2025-01-14 14:27:23
 */
public class ItemCodeStatusInfo extends AlipayObject {

	private static final long serialVersionUID = 3611877876137415769L;

	/**
	 * app方商品编码
	 */
	@ApiField("item_code")
	private String itemCode;

	/**
	 * 商品状态, 0上架, -1下架
	 */
	@ApiField("status")
	private String status;

	public String getItemCode() {
		return this.itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
