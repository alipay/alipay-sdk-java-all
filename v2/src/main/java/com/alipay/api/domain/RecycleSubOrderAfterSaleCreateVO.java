package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回收子单发起售后信息
 *
 * @author auto create
 * @since 1.0, 2025-09-02 11:22:07
 */
public class RecycleSubOrderAfterSaleCreateVO extends AlipayObject {

	private static final long serialVersionUID = 3618853948748622934L;

	/**
	 * 售后原因
	 */
	@ApiField("after_sale_reason")
	private String afterSaleReason;

	/**
	 * 售后类型
	 */
	@ApiField("after_sale_type")
	private String afterSaleType;

	/**
	 * 回收子单号
	 */
	@ApiField("sub_order_id")
	private String subOrderId;

	/**
	 * 商家子单号
	 */
	@ApiField("sub_out_order_id")
	private String subOutOrderId;

	public String getAfterSaleReason() {
		return this.afterSaleReason;
	}
	public void setAfterSaleReason(String afterSaleReason) {
		this.afterSaleReason = afterSaleReason;
	}

	public String getAfterSaleType() {
		return this.afterSaleType;
	}
	public void setAfterSaleType(String afterSaleType) {
		this.afterSaleType = afterSaleType;
	}

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
