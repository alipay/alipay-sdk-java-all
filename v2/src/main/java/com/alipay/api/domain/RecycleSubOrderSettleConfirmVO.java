package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回收子单结算确认信息
 *
 * @author auto create
 * @since 1.0, 2025-11-14 16:35:17
 */
public class RecycleSubOrderSettleConfirmVO extends AlipayObject {

	private static final long serialVersionUID = 1133941614966286283L;

	/**
	 * 回收的子单号
	 */
	@ApiField("sub_order_id")
	private String subOrderId;

	/**
	 * 子单质检金额，币种：人民币，单位：元
	 */
	@ApiField("sub_order_inspect_price")
	private String subOrderInspectPrice;

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

	public String getSubOrderInspectPrice() {
		return this.subOrderInspectPrice;
	}
	public void setSubOrderInspectPrice(String subOrderInspectPrice) {
		this.subOrderInspectPrice = subOrderInspectPrice;
	}

	public String getSubOutOrderId() {
		return this.subOutOrderId;
	}
	public void setSubOutOrderId(String subOutOrderId) {
		this.subOutOrderId = subOutOrderId;
	}

}
