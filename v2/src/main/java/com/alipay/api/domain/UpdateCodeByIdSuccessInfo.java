package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 成功更新code对象
 *
 * @author auto create
 * @since 1.0, 2025-01-14 14:27:36
 */
public class UpdateCodeByIdSuccessInfo extends AlipayObject {

	private static final long serialVersionUID = 2535443496196477193L;

	/**
	 * 商品平台编码
	 */
	@ApiField("item_id")
	private String itemId;

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

}
