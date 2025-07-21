package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用支付先采后付确认收货接口
 *
 * @author auto create
 * @since 1.0, 2025-07-07 15:59:03
 */
public class AlipayTradeCreditGoodsConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 2262627946651868364L;

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
