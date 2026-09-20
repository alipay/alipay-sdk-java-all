package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ServiceItemInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.hm.serviceitem.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-08 15:27:54
 */
public class AlipayCommerceMedicalHmServiceitemQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3118418247387998899L;

	/** 
	 * null
	 */
	@ApiListField("service_item_list")
	@ApiField("service_item_info")
	private List<ServiceItemInfo> serviceItemList;

	public void setServiceItemList(List<ServiceItemInfo> serviceItemList) {
		this.serviceItemList = serviceItemList;
	}
	public List<ServiceItemInfo> getServiceItemList( ) {
		return this.serviceItemList;
	}

}
