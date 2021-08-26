package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 店铺同步结果查询
 *
 * @author auto create
 * @since 1.0, 2021-07-21 16:39:51
 */
public class AlipayOverseasTravelShopSyncresultQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3465162396621515483L;

	/**
	 * 外部店铺ID
	 */
	@ApiField("out_shop_id")
	private String outShopId;

	public String getOutShopId() {
		return this.outShopId;
	}
	public void setOutShopId(String outShopId) {
		this.outShopId = outShopId;
	}

}
