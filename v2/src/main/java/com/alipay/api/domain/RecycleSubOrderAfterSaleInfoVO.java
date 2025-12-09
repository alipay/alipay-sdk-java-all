package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回收子单售后信息
 *
 * @author auto create
 * @since 1.0, 2025-09-02 11:22:08
 */
public class RecycleSubOrderAfterSaleInfoVO extends AlipayObject {

	private static final long serialVersionUID = 2691963418448541466L;

	/**
	 * 子售后单号
	 */
	@ApiField("sub_after_sales_id")
	private String subAfterSalesId;

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

	public String getSubAfterSalesId() {
		return this.subAfterSalesId;
	}
	public void setSubAfterSalesId(String subAfterSalesId) {
		this.subAfterSalesId = subAfterSalesId;
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
