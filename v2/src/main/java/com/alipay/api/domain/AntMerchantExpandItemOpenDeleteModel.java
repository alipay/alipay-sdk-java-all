package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 删除商品接口
 *
 * @author auto create
 * @since 1.0, 2024-10-10 09:50:41
 */
public class AntMerchantExpandItemOpenDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 5433285753846939894L;

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
