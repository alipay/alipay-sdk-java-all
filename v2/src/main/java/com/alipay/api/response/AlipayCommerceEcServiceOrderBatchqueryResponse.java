package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ServiceOrderBaseInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.service.order.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 03:31:51
 */
public class AlipayCommerceEcServiceOrderBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5594726415957424631L;

	/** 
	 * 服务订购单列表
	 */
	@ApiListField("service_order_base_info_list")
	@ApiField("service_order_base_info")
	private List<ServiceOrderBaseInfo> serviceOrderBaseInfoList;

	public void setServiceOrderBaseInfoList(List<ServiceOrderBaseInfo> serviceOrderBaseInfoList) {
		this.serviceOrderBaseInfoList = serviceOrderBaseInfoList;
	}
	public List<ServiceOrderBaseInfo> getServiceOrderBaseInfoList( ) {
		return this.serviceOrderBaseInfoList;
	}

}
