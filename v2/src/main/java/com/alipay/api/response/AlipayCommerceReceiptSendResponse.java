package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EnvironmentInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.receipt.send response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 00:18:54
 */
public class AlipayCommerceReceiptSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 4679711671873736323L;

	/** 
	 * 商品列表中有对应的环保类型时，需要返回
	 */
	@ApiListField("order_goods_list")
	@ApiField("environment_info")
	private List<EnvironmentInfo> orderGoodsList;

	public void setOrderGoodsList(List<EnvironmentInfo> orderGoodsList) {
		this.orderGoodsList = orderGoodsList;
	}
	public List<EnvironmentInfo> getOrderGoodsList( ) {
		return this.orderGoodsList;
	}

}
