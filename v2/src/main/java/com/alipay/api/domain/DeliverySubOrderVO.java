package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 子单模型
 *
 * @author auto create
 * @since 1.0, 2023-12-28 14:41:57
 */
public class DeliverySubOrderVO extends AlipayObject {

	private static final long serialVersionUID = 1712894598793684852L;

	/**
	 * (预计)配送日期
	 */
	@ApiField("delivery_date")
	private String deliveryDate;

	/**
	 * 配送期数
	 */
	@ApiField("period")
	private Long period;

	/**
	 * 配送订单信息
1. 待发货：wait_delivered
2. 已发货：delivered
3. 确认收货：delivered_confirmed
4. 退款中：refunding
5. 退款完成：refund
	 */
	@ApiField("status")
	private String status;

	public String getDeliveryDate() {
		return this.deliveryDate;
	}
	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public Long getPeriod() {
		return this.period;
	}
	public void setPeriod(Long period) {
		this.period = period;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
