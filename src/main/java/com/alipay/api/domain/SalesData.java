package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 销售数据详情，包含销售额，销售订单数等数据
 *
 * @author auto create
 * @since 1.0, 2021-02-26 14:08:08
 */
public class SalesData extends AlipayObject {

	private static final long serialVersionUID = 1471336521449347673L;

	/**
	 * 日期
	 */
	@ApiField("dt")
	private String dt;

	/**
	 * 当日销售订单数
	 */
	@ApiField("order_count")
	private String orderCount;

	/**
	 * 当日退款订单数
	 */
	@ApiField("refund_order_count")
	private String refundOrderCount;

	/**
	 * 当日退款金额
	 */
	@ApiField("refund_sales_amount")
	private String refundSalesAmount;

	/**
	 * 当日销售额
	 */
	@ApiField("sales_amount")
	private String salesAmount;

	public String getDt() {
		return this.dt;
	}
	public void setDt(String dt) {
		this.dt = dt;
	}

	public String getOrderCount() {
		return this.orderCount;
	}
	public void setOrderCount(String orderCount) {
		this.orderCount = orderCount;
	}

	public String getRefundOrderCount() {
		return this.refundOrderCount;
	}
	public void setRefundOrderCount(String refundOrderCount) {
		this.refundOrderCount = refundOrderCount;
	}

	public String getRefundSalesAmount() {
		return this.refundSalesAmount;
	}
	public void setRefundSalesAmount(String refundSalesAmount) {
		this.refundSalesAmount = refundSalesAmount;
	}

	public String getSalesAmount() {
		return this.salesAmount;
	}
	public void setSalesAmount(String salesAmount) {
		this.salesAmount = salesAmount;
	}

}
