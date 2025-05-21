package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 批量更新商品, 执行成功信息
 *
 * @author auto create
 * @since 1.0, 2025-02-13 23:23:32
 */
public class ItemUpdateSuccessInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 2638821247166511571L;

	/**
	 * OMS厂商商品编码
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
