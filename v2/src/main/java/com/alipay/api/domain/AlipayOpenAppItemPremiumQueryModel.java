package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询精选池商品状态
 *
 * @author auto create
 * @since 1.0, 2025-11-18 14:47:42
 */
public class AlipayOpenAppItemPremiumQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8736869482223833141L;

	/**
	 * 商品id，由商户提供
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
