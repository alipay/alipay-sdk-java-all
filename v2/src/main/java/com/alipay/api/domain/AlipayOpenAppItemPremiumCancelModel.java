package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 退出精品池
 *
 * @author auto create
 * @since 1.0, 2025-11-13 15:02:42
 */
public class AlipayOpenAppItemPremiumCancelModel extends AlipayObject {

	private static final long serialVersionUID = 1285722542345578997L;

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
