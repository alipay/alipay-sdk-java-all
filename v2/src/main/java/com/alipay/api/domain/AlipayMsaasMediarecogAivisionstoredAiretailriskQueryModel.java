package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * AI值守订单风控信息查询
 *
 * @author auto create
 * @since 1.0, 2026-07-03 21:27:55
 */
public class AlipayMsaasMediarecogAivisionstoredAiretailriskQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2832236118664381815L;

	/**
	 * isv pid值
	 */
	@ApiField("isv_pid")
	private String isvPid;

	/**
	 * 订单id
	 */
	@ApiField("order_id")
	private String orderId;

	public String getIsvPid() {
		return this.isvPid;
	}
	public void setIsvPid(String isvPid) {
		this.isvPid = isvPid;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

}
