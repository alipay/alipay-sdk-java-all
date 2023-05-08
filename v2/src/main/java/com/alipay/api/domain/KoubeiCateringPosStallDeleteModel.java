package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 删除档口
 *
 * @author auto create
 * @since 1.0, 2018-11-16 17:30:40
 */
public class KoubeiCateringPosStallDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 6854686991215315981L;

	/**
	 * 门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 档口id
	 */
	@ApiField("stall_id")
	private String stallId;

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getStallId() {
		return this.stallId;
	}
	public void setStallId(String stallId) {
		this.stallId = stallId;
	}

}
