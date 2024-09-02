package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店smid关系绑定
 *
 * @author auto create
 * @since 1.0, 2024-08-12 18:52:40
 */
public class AlipayCommerceMerchantcardSmidBindModel extends AlipayObject {

	private static final long serialVersionUID = 5367163599851753687L;

	/**
	 * 门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 二级商户id
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
