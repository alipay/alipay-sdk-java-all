package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 退货明细信息
 *
 * @author auto create
 * @since 1.0, 2018-02-08 10:30:16
 */
public class RefundInfo extends AlipayObject {

	private static final long serialVersionUID = 3899347655655393754L;

	/**
	 * 退款金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 商品单ID
	 */
	@ApiField("item_order_no")
	private String itemOrderNo;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getItemOrderNo() {
		return this.itemOrderNo;
	}
	public void setItemOrderNo(String itemOrderNo) {
		this.itemOrderNo = itemOrderNo;
	}

}
