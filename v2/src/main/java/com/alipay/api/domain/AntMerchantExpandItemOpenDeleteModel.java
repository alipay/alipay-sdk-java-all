package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 删除商品接口
 *
 * @author auto create
 * @since 1.0, 2023-07-05 10:58:52
 */
public class AntMerchantExpandItemOpenDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 1825258524252944144L;

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
