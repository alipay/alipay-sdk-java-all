package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单详情查询接口
 *
 * @author auto create
 * @since 1.0, 2020-01-03 14:49:32
 */
public class KoubeiTradeOrderAggregateQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3832635896193332978L;

	/**
	 * 口碑订单号；
注：外部订单号和订单号必须填写一个
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 外部订单号; 
注：外部订单号和订单号必须填写一个
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 请求唯一ID
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 口碑门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
