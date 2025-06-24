package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询医疗门店店员列表
 *
 * @author auto create
 * @since 1.0, 2025-06-13 10:05:23
 */
public class AlipayCommerceMedicalCommercialShopstaffBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 4282218443773963922L;

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
