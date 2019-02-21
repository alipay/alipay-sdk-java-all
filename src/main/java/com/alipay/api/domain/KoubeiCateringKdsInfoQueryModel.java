package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * kds详情查询
 *
 * @author auto create
 * @since 1.0, 2018-12-25 11:19:05
 */
public class KoubeiCateringKdsInfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6597542449666866464L;

	/**
	 * kdsID
	 */
	@ApiField("kds_id")
	private String kdsId;

	/**
	 * 门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getKdsId() {
		return this.kdsId;
	}
	public void setKdsId(String kdsId) {
		this.kdsId = kdsId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
