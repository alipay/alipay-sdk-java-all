package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EcOrderItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.ecorder.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-08-30 18:36:51
 */
public class AlipayEbppInvoiceEcorderOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8686699838113954216L;

	/** 
	 * 企业码订单详情
	 */
	@ApiField("order_info")
	private EcOrderItem orderInfo;

	/** 
	 * 企业码子订单详情列表
	 */
	@ApiListField("sub_order_list")
	@ApiField("ec_order_item")
	private List<EcOrderItem> subOrderList;

	public void setOrderInfo(EcOrderItem orderInfo) {
		this.orderInfo = orderInfo;
	}
	public EcOrderItem getOrderInfo( ) {
		return this.orderInfo;
	}

	public void setSubOrderList(List<EcOrderItem> subOrderList) {
		this.subOrderList = subOrderList;
	}
	public List<EcOrderItem> getSubOrderList( ) {
		return this.subOrderList;
	}

}
