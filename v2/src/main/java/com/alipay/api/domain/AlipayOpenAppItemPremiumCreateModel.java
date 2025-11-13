package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 提交精品池
 *
 * @author auto create
 * @since 1.0, 2025-11-13 15:02:41
 */
public class AlipayOpenAppItemPremiumCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1744467727686599343L;

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
