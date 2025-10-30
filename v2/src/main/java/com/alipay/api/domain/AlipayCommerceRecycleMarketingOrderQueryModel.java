package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回收推广订单查询
 *
 * @author auto create
 * @since 1.0, 2025-10-13 21:00:14
 */
public class AlipayCommerceRecycleMarketingOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3613731794226948272L;

	/**
	 * 订单推广记录id
	 */
	@ApiField("promo_id")
	private String promoId;

	public String getPromoId() {
		return this.promoId;
	}
	public void setPromoId(String promoId) {
		this.promoId = promoId;
	}

}
