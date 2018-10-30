package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查看档口详情
 *
 * @author auto create
 * @since 1.0, 2018-10-26 01:21:24
 */
public class KoubeiCateringPosStalldetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6415213686818718216L;

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
