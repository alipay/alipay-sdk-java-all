package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 批量删除商品成功信息-ById
 *
 * @author auto create
 * @since 1.0, 2025-05-20 16:54:36
 */
public class ItemBatchDeleteByIdSuccessInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 4215662813991358852L;

	/**
	 * 支付宝内部商品编码ID
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
