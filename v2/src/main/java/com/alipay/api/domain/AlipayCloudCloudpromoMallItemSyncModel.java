package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 同步渠道商商品
 *
 * @author auto create
 * @since 1.0, 2024-06-12 11:50:25
 */
public class AlipayCloudCloudpromoMallItemSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5226271531154644578L;

	/**
	 * 分销店铺id
	 */
	@ApiField("purchaser_id")
	private String purchaserId;

	public String getPurchaserId() {
		return this.purchaserId;
	}
	public void setPurchaserId(String purchaserId) {
		this.purchaserId = purchaserId;
	}

}
