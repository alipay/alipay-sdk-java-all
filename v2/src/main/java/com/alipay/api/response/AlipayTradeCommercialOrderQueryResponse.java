package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.commercial.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-03 14:27:50
 */
public class AlipayTradeCommercialOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5494645831662838478L;

	/** 
	 * 订单类型
	 */
	@ApiField("order_type")
	private String orderType;

	/** 
	 * 订单支付时间
	 */
	@ApiField("pay_time")
	private Date payTime;

	/** 
	 * 该笔订单在支付机构侧的交易单号，可用于后续对账使用
	 */
	@ApiField("pay_trade_no")
	private String payTradeNo;

	/** 
	 * 本次订单关联的价格id
	 */
	@ApiField("price_id")
	private String priceId;

	/** 
	 * 本次订单关联的商品id
	 */
	@ApiField("product_id")
	private String productId;

	/** 
	 * 订单状态
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 订单金额，单位：元
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public String getOrderType( ) {
		return this.orderType;
	}

	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}
	public Date getPayTime( ) {
		return this.payTime;
	}

	public void setPayTradeNo(String payTradeNo) {
		this.payTradeNo = payTradeNo;
	}
	public String getPayTradeNo( ) {
		return this.payTradeNo;
	}

	public void setPriceId(String priceId) {
		this.priceId = priceId;
	}
	public String getPriceId( ) {
		return this.priceId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductId( ) {
		return this.productId;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getTotalAmount( ) {
		return this.totalAmount;
	}

}
