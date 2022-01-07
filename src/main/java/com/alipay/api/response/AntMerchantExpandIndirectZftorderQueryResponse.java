package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ZftSubMerchantOrder;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.indirect.zftorder.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-08-05 21:02:37
 */
public class AntMerchantExpandIndirectZftorderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1529419883551779667L;

	/** 
	 * 直付通二级商户进件申请单信息
	 */
	@ApiListField("orders")
	@ApiField("zft_sub_merchant_order")
	private List<ZftSubMerchantOrder> orders;

	public void setOrders(List<ZftSubMerchantOrder> orders) {
		this.orders = orders;
	}
	public List<ZftSubMerchantOrder> getOrders( ) {
		return this.orders;
	}

}
