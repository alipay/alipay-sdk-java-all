package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品删除
 *
 * @author auto create
 * @since 1.0, 2026-09-11 18:22:45
 */
public class AntMerchantExpandItemSecurityDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 7563339835446531917L;

	/**
	 * 商品ID
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
