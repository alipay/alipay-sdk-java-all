package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 批量创建商品, 成功执行的记录
 *
 * @author auto create
 * @since 1.0, 2025-02-13 23:23:29
 */
public class ItemCreateSuccessInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 1829872172186271256L;

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
