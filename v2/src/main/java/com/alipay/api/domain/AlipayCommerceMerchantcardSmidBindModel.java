package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店smid关系绑定
 *
 * @author auto create
 * @since 1.0, 2025-01-17 11:28:52
 */
public class AlipayCommerceMerchantcardSmidBindModel extends AlipayObject {

	private static final long serialVersionUID = 5515747394277354628L;

	/**
	 * 门店id，门店是归属于pid的，不是smid下的门店
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 二级商户id，注意smid需要是pid下的
	 */
	@ApiField("smid")
	private String smid;

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getSmid() {
		return this.smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}

}
