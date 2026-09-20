package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 删除店铺信息
 *
 * @author auto create
 * @since 1.0, 2026-09-16 14:35:26
 */
public class AlipayEbppIndustryCareertrainingShopinfoDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 6388731966637661791L;

	/**
	 * 门店id
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
