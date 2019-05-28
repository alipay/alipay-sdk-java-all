package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品删除接口
 *
 * @author auto create
 * @since 1.0, 2019-01-18 10:39:33
 */
public class AntMerchantExpandItemDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 4715193749951141625L;

	/**
	 * 商品id
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
