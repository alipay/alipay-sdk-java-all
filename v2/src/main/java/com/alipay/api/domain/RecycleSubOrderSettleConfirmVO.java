package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回收子单结算确认信息
 *
 * @author auto create
 * @since 1.0, 2025-09-02 11:22:08
 */
public class RecycleSubOrderSettleConfirmVO extends AlipayObject {

	private static final long serialVersionUID = 1838545579818579678L;

	/**
	 * 回收的子单号
	 */
	@ApiField("sub_order_id")
	private String subOrderId;

	/**
	 * 商家的子单号
	 */
	@ApiField("sub_out_order_id")
	private String subOutOrderId;

	public String getSubOrderId() {
		return this.subOrderId;
	}
	public void setSubOrderId(String subOrderId) {
		this.subOrderId = subOrderId;
	}

	public String getSubOutOrderId() {
		return this.subOutOrderId;
	}
	public void setSubOutOrderId(String subOutOrderId) {
		this.subOutOrderId = subOutOrderId;
	}

}
