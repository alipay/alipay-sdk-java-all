package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单信息查询
 *
 * @author auto create
 * @since 1.0, 2021-04-06 16:45:10
 */
public class AlipayCommerceSportsVenueOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3259896479693535422L;

	/**
	 * 支付宝业务订单唯一ID
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 服务商内部唯一订单号
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

}
