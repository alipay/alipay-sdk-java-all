package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询医疗门店店员列表
 *
 * @author auto create
 * @since 1.0, 2025-07-14 16:17:16
 */
public class AlipayCommerceMedicalCommercialShopstaffBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 5865594455814786444L;

	/**
	 * 蚂蚁门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
