package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 店铺同步结果查询
 *
 * @author auto create
 * @since 1.0, 2022-01-17 17:48:41
 */
public class AlipayOverseasTravelShopSyncresultQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8785121239513729789L;

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
