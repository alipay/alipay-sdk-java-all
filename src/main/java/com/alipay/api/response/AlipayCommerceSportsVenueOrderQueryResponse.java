package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ProductGroup;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.sports.venue.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-04-06 16:45:17
 */
public class AlipayCommerceSportsVenueOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2735545345578529963L;

	/** 
	 * 订单创建时间
	 */
	@ApiField("create_time")
	private String createTime;

	/** 
	 * 订单描述
	 */
	@ApiField("desc")
	private String desc;

	/** 
	 * 支付宝业务订单唯一ID
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 预订单状态
reverse_proc - 待确认
pay_succ- 已支付
refund_succ - 已退款
verified - 已核销
closed - 已关闭
	 */
	@ApiField("order_status")
	private String orderStatus;

	/** 
	 * 订单应付金额（单位：元）
	 */
	@ApiField("payment_amount")
	private String paymentAmount;

	/** 
	 * 订单支付时间
	 */
	@ApiField("payment_time")
	private String paymentTime;

	/** 
	 * 订单商品信息列表
	 */
	@ApiListField("product_group_list")
	@ApiField("product_group")
	private List<ProductGroup> productGroupList;

	/** 
	 * 订单退款截止时间
	 */
	@ApiField("refund_end_time")
	private String refundEndTime;

	/** 
	 * 订单退款时间
	 */
	@ApiField("refund_time")
	private String refundTime;

	/** 
	 * 订单总金额（单位：元）
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getCreateTime( ) {
		return this.createTime;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getDesc( ) {
		return this.desc;
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

	public void setProductGroupList(List<ProductGroup> productGroupList) {
		this.productGroupList = productGroupList;
	}
	public List<ProductGroup> getProductGroupList( ) {
		return this.productGroupList;
	}

	public void setRefundEndTime(String refundEndTime) {
		this.refundEndTime = refundEndTime;
	}
	public String getRefundEndTime( ) {
		return this.refundEndTime;
	}

	public void setRefundTime(String refundTime) {
		this.refundTime = refundTime;
	}
	public String getRefundTime( ) {
		return this.refundTime;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getTotalAmount( ) {
		return this.totalAmount;
	}

}
