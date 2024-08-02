package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TourVoucherInfoQueryopenapiResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.tour.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-09 15:27:04
 */
public class AlipayCommerceTransportTourOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5545556757497378156L;

	/** 
	 * 订单价格
	 */
	@ApiField("amount")
	private String amount;

	/** 
	 * 支付宝订单ID
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 订单状态
	 */
	@ApiField("order_status")
	private String orderStatus;

	/** 
	 * 业务发生的时间
	 */
	@ApiField("order_time")
	private Date orderTime;

	/** 
	 * 总金额， 目前总金额 = 订单金额
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/** 
	 * 凭证列表信息
	 */
	@ApiListField("voucher_list")
	@ApiField("tour_voucher_info_queryopenapi_result")
	private List<TourVoucherInfoQueryopenapiResult> voucherList;

	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getAmount( ) {
		return this.amount;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderStatus( ) {
		return this.orderStatus;
	}

	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}
	public Date getOrderTime( ) {
		return this.orderTime;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getTotalAmount( ) {
		return this.totalAmount;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

	public void setVoucherList(List<TourVoucherInfoQueryopenapiResult> voucherList) {
		this.voucherList = voucherList;
	}
	public List<TourVoucherInfoQueryopenapiResult> getVoucherList( ) {
		return this.voucherList;
	}

}
