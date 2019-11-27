package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AlipayOrderDataOpenapiResultInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.order.securitydigest.business.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-09-15 10:51:43
 */
public class AlipayMerchantOrderSecuritydigestBusinessBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5886372544835588894L;

	/** 
	 * 订单信息列表
	 */
	@ApiListField("order_list")
	@ApiField("alipay_order_data_openapi_result_info")
	private List<AlipayOrderDataOpenapiResultInfo> orderList;

	public void setOrderList(List<AlipayOrderDataOpenapiResultInfo> orderList) {
		this.orderList = orderList;
	}
	public List<AlipayOrderDataOpenapiResultInfo> getOrderList( ) {
		return this.orderList;
	}

}
