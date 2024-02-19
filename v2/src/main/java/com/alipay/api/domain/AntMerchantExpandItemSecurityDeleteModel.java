package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品删除
 *
 * @author auto create
 * @since 1.0, 2023-07-05 11:00:28
 */
public class AntMerchantExpandItemSecurityDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 2194183746324654584L;

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
