package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * AI值守订单风控信息查询
 *
 * @author auto create
 * @since 1.0, 2026-03-31 15:07:45
 */
public class AlipayMsaasMediarecogAivisionstoredAiretailriskQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7593137722796534221L;

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
