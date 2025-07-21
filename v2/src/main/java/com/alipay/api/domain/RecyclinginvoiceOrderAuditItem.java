package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 反向开票订单审核订单明细
 *
 * @author auto create
 * @since 1.0, 2025-04-22 15:38:17
 */
public class RecyclinginvoiceOrderAuditItem extends AlipayObject {

	private static final long serialVersionUID = 5686415769134331337L;

	/**
	 * 数量（整数最长七位，小数最长六位）
	 */
	@ApiField("item_num")
	private String itemNum;

	/**
	 * 金额（元，整数最长七位，小数最长两位）
	 */
	@ApiField("item_total_amount")
	private String itemTotalAmount;

	/**
	 * 单价（元，整数最长七位，小数最长六位）
	 */
	@ApiField("item_unit_amount")
	private String itemUnitAmount;

	/**
	 * 订单明细ID，可通过反向订单查询接口查询
	 */
	@ApiField("order_item_id")
	private String orderItemId;

	public String getItemNum() {
		return this.itemNum;
	}
	public void setItemNum(String itemNum) {
		this.itemNum = itemNum;
	}

	public String getItemTotalAmount() {
		return this.itemTotalAmount;
	}
	public void setItemTotalAmount(String itemTotalAmount) {
		this.itemTotalAmount = itemTotalAmount;
	}

	public String getItemUnitAmount() {
		return this.itemUnitAmount;
	}
	public void setItemUnitAmount(String itemUnitAmount) {
		this.itemUnitAmount = itemUnitAmount;
	}

	public String getOrderItemId() {
		return this.orderItemId;
	}
	public void setOrderItemId(String orderItemId) {
		this.orderItemId = orderItemId;
	}

}
