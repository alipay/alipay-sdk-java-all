package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 确认收货快递信息
 *
 * @author auto create
 * @since 1.0, 2023-12-26 18:07:25
 */
public class DeliveryReceiveDTO extends AlipayObject {

	private static final long serialVersionUID = 3896671455246542737L;

	/**
	 * 物流单id
	 */
	@ApiField("logistics_order_id")
	private String logisticsOrderId;

	/**
	 * 快递单号
	 */
	@ApiField("waybill_id")
	private String waybillId;

	public String getLogisticsOrderId() {
		return this.logisticsOrderId;
	}
	public void setLogisticsOrderId(String logisticsOrderId) {
		this.logisticsOrderId = logisticsOrderId;
	}

	public String getWaybillId() {
		return this.waybillId;
	}
	public void setWaybillId(String waybillId) {
		this.waybillId = waybillId;
	}

}
