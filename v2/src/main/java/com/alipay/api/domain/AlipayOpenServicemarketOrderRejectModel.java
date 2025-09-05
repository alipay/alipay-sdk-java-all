package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务商拒绝接单
 *
 * @author auto create
 * @since 1.0, 2024-03-06 13:45:15
 */
public class AlipayOpenServicemarketOrderRejectModel extends AlipayObject {

	private static final long serialVersionUID = 5354841255272579134L;

	/**
	 * 订购服务商品订单ID
	 */
	@ApiField("commodity_order_id")
	private String commodityOrderId;

	/**
	 * 拒绝接单原因
	 */
	@ApiField("reject_reason")
	private String rejectReason;

	public String getCommodityOrderId() {
		return this.commodityOrderId;
	}
	public void setCommodityOrderId(String commodityOrderId) {
		this.commodityOrderId = commodityOrderId;
	}

	public String getRejectReason() {
		return this.rejectReason;
	}
	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}

}
