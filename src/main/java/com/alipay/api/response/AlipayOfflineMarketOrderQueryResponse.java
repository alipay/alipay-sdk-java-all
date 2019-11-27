package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ItemOrderResponse;
import com.alipay.api.domain.LogisticsInfoResponse;
import com.alipay.api.domain.SubOrderResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.market.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOfflineMarketOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7165916861677927167L;

	/** 
	 * 订单创建时间
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/** 
	 * 订单修改时间
	 */
	@ApiField("gmt_modified")
	private String gmtModified;

	/** 
	 * 商品子订单列表
	 */
	@ApiListField("item_order_list")
	@ApiField("item_order_response")
	private List<ItemOrderResponse> itemOrderList;

	/** 
	 * 订单物流信息
	 */
	@ApiField("logistics_info")
	private LogisticsInfoResponse logisticsInfo;

	/** 
	 * 备注信息
	 */
	@ApiField("memo")
	private String memo;

	/** 
	 * 口碑订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 订单状态
	 */
	@ApiField("order_status")
	private String orderStatus;

	/** 
	 * 订单已支付金额
	 */
	@ApiField("payment_amount")
	private String paymentAmount;

	/** 
	 * 订单支付时间
	 */
	@ApiField("payment_time")
	private String paymentTime;

	/** 
	 * 订单实际金额
	 */
	@ApiField("real_amount")
	private String realAmount;

	/** 
	 * 订单退款金额
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/** 
	 * 订单退款时间
	 */
	@ApiField("refund_time")
	private String refundTime;

	/** 
	 * 子订单列表
	 */
	@ApiListField("sub_order_list")
	@ApiField("sub_order_response")
	private List<SubOrderResponse> subOrderList;

	/** 
	 * 订单总金额
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	public String getGmtCreate( ) {
		return this.gmtCreate;
	}

	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}
	public String getGmtModified( ) {
		return this.gmtModified;
	}

	public void setItemOrderList(List<ItemOrderResponse> itemOrderList) {
		this.itemOrderList = itemOrderList;
	}
	public List<ItemOrderResponse> getItemOrderList( ) {
		return this.itemOrderList;
	}

	public void setLogisticsInfo(LogisticsInfoResponse logisticsInfo) {
		this.logisticsInfo = logisticsInfo;
	}
	public LogisticsInfoResponse getLogisticsInfo( ) {
		return this.logisticsInfo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getMemo( ) {
		return this.memo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderStatus( ) {
		return this.orderStatus;
	}

	public void setPaymentAmount(String paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	public String getPaymentAmount( ) {
		return this.paymentAmount;
	}

	public void setPaymentTime(String paymentTime) {
		this.paymentTime = paymentTime;
	}
	public String getPaymentTime( ) {
		return this.paymentTime;
	}

	public void setRealAmount(String realAmount) {
		this.realAmount = realAmount;
	}
	public String getRealAmount( ) {
		return this.realAmount;
	}

	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}
	public String getRefundAmount( ) {
		return this.refundAmount;
	}

	public void setRefundTime(String refundTime) {
		this.refundTime = refundTime;
	}
	public String getRefundTime( ) {
		return this.refundTime;
	}

	public void setSubOrderList(List<SubOrderResponse> subOrderList) {
		this.subOrderList = subOrderList;
	}
	public List<SubOrderResponse> getSubOrderList( ) {
		return this.subOrderList;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getTotalAmount( ) {
		return this.totalAmount;
	}

}
