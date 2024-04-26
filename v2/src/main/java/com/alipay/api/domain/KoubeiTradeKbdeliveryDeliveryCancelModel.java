package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑物流单取消
 *
 * @author auto create
 * @since 1.0, 2020-11-24 15:52:18
 */
public class KoubeiTradeKbdeliveryDeliveryCancelModel extends AlipayObject {

	private static final long serialVersionUID = 2714181576273767493L;

	/**
	 * 口碑物流单，单号；
需要撤销的单据号
	 */
	@ApiField("logistics_order_no")
	private String logisticsOrderNo;

	/**
	 * 关闭物流订单原因
	 */
	@ApiField("reason")
	private String reason;

	public String getLogisticsOrderNo() {
		return this.logisticsOrderNo;
	}
	public void setLogisticsOrderNo(String logisticsOrderNo) {
		this.logisticsOrderNo = logisticsOrderNo;
	}

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

}
