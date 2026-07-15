package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订阅待生效的item
 *
 * @author auto create
 * @since 1.0, 2026-04-28 14:02:33
 */
public class SubscriptionQueryPendingItem extends AlipayObject {

	private static final long serialVersionUID = 1568214133738556468L;

	/**
	 * 创建时间
	 */
	@ApiField("created")
	private String created;

	/**
	 * 订阅项id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 订阅项周期截止时间
	 */
	@ApiField("period_end")
	private String periodEnd;

	/**
	 * 订阅项周期开始时间
	 */
	@ApiField("period_start")
	private String periodStart;

	/**
	 * 商品价格模型
	 */
	@ApiField("price")
	private NexusPayPrice price;

	/**
	 * 订阅价格项目数量
	 */
	@ApiField("quantity")
	private String quantity;

	/**
	 * 订阅项状态
	 */
	@ApiField("status")
	private String status;

	public String getCreated() {
		return this.created;
	}
	public void setCreated(String created) {
		this.created = created;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getPeriodEnd() {
		return this.periodEnd;
	}
	public void setPeriodEnd(String periodEnd) {
		this.periodEnd = periodEnd;
	}

	public String getPeriodStart() {
		return this.periodStart;
	}
	public void setPeriodStart(String periodStart) {
		this.periodStart = periodStart;
	}

	public NexusPayPrice getPrice() {
		return this.price;
	}
	public void setPrice(NexusPayPrice price) {
		this.price = price;
	}

	public String getQuantity() {
		return this.quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
