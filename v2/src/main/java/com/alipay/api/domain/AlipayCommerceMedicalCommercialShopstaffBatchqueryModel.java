package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询医疗门店店员列表
 *
 * @author auto create
 * @since 1.0, 2025-08-05 19:56:25
 */
public class AlipayCommerceMedicalCommercialShopstaffBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 1534751766214994754L;

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
