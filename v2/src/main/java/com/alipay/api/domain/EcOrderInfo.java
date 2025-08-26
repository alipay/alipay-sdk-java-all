package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企业码订单详情
 *
 * @author auto create
 * @since 1.0, 2024-08-30 15:42:55
 */
public class EcOrderInfo extends AlipayObject {

	private static final long serialVersionUID = 7485936878911374792L;

	/**
	 * 父订单详情
	 */
	@ApiField("order_info")
	private EcOrderItem orderInfo;

	/**
	 * 子订单详情列表
	 */
	@ApiListField("sub_order_list")
	@ApiField("ec_order_item")
	private List<EcOrderItem> subOrderList;

	public EcOrderItem getOrderInfo() {
		return this.orderInfo;
	}
	public void setOrderInfo(EcOrderItem orderInfo) {
		this.orderInfo = orderInfo;
	}

	public List<EcOrderItem> getSubOrderList() {
		return this.subOrderList;
	}
	public void setSubOrderList(List<EcOrderItem> subOrderList) {
		this.subOrderList = subOrderList;
	}

}
