package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EnvironmentInfo;
import com.alipay.api.domain.GreenOrderReceiptSendInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.receipt.send response.
 * 
 * @author auto create
 * @since 1.0, 2025-02-12 10:10:33
 */
public class AlipayCommerceReceiptSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 6599134273239387981L;

	/** 
	 * 商品列表中有对应的环保类型时，需要返回
	 */
	@ApiListField("order_goods_list")
	@ApiField("environment_info")
	private List<EnvironmentInfo> orderGoodsList;

	/** 
	 * 订单回传存在订单维度错误信息时，需要返回
	 */
	@ApiListField("order_list")
	@ApiField("green_order_receipt_send_info")
	private List<GreenOrderReceiptSendInfo> orderList;

	public void setOrderGoodsList(List<EnvironmentInfo> orderGoodsList) {
		this.orderGoodsList = orderGoodsList;
	}
	public List<EnvironmentInfo> getOrderGoodsList( ) {
		return this.orderGoodsList;
	}

	public void setOrderList(List<GreenOrderReceiptSendInfo> orderList) {
		this.orderList = orderList;
	}
	public List<GreenOrderReceiptSendInfo> getOrderList( ) {
		return this.orderList;
	}

}
