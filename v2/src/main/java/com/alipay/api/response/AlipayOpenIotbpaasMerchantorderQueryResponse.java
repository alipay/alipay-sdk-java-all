package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.IoTBPaaSMerchantOrderInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iotbpaas.merchantorder.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 22:09:06
 */
public class AlipayOpenIotbpaasMerchantorderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6176169438399364786L;

	/** 
	 * 订单列表
	 */
	@ApiListField("order_list")
	@ApiField("io_t_b_paa_s_merchant_order_info")
	private List<IoTBPaaSMerchantOrderInfo> orderList;

	public void setOrderList(List<IoTBPaaSMerchantOrderInfo> orderList) {
		this.orderList = orderList;
	}
	public List<IoTBPaaSMerchantOrderInfo> getOrderList( ) {
		return this.orderList;
	}

}
