package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用支付先采后付确认收货接口
 *
 * @author auto create
 * @since 1.0, 2025-09-30 17:08:06
 */
public class AlipayTradeCreditGoodsConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 5259694199659348728L;

	/**
	 * 信用服务订单号
	 */
	@ApiField("credit_biz_order_id")
	private String creditBizOrderId;

	public String getCreditBizOrderId() {
		return this.creditBizOrderId;
	}
	public void setCreditBizOrderId(String creditBizOrderId) {
		this.creditBizOrderId = creditBizOrderId;
	}

}
