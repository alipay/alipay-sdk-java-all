package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 子订单结果信息
 *
 * @author auto create
 * @since 1.0, 2023-12-04 15:59:39
 */
public class SendSubOrderResult extends AlipayObject {

	private static final long serialVersionUID = 2622142676143289716L;

	/**
	 * 订单有效期，日期类型，格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("order_expire_time")
	private Date orderExpireTime;

	/**
	 * 组合奖品里面的子订单唯一标识
	 */
	@ApiField("order_id")
	private String orderId;

	public Date getOrderExpireTime() {
		return this.orderExpireTime;
	}
	public void setOrderExpireTime(Date orderExpireTime) {
		this.orderExpireTime = orderExpireTime;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

}
