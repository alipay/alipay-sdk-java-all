package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 店铺同步结果查询
 *
 * @author auto create
 * @since 1.0, 2021-09-02 19:32:35
 */
public class AlipayOverseasTravelShopSyncresultQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1147155987257675223L;

	/**
	 * 外部店铺ID
	 */
	@ApiField("out_shop_id")
	private String outShopId;

	/**
	 * 同步单据id，跨境电商场景必传
	 */
	@ApiField("sync_order_id")
	private String syncOrderId;

	public String getOutShopId() {
		return this.outShopId;
	}
	public void setOutShopId(String outShopId) {
		this.outShopId = outShopId;
	}

	public String getSyncOrderId() {
		return this.syncOrderId;
	}
	public void setSyncOrderId(String syncOrderId) {
		this.syncOrderId = syncOrderId;
	}

}
