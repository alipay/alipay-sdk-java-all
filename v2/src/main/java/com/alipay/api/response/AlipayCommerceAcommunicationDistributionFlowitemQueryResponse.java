package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.FlowItemInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.acommunication.distribution.flowitem.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-11 14:22:05
 */
public class AlipayCommerceAcommunicationDistributionFlowitemQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8392517536799343886L;

	/** 
	 * 商品信息
	 */
	@ApiField("item_info")
	private FlowItemInfo itemInfo;

	public void setItemInfo(FlowItemInfo itemInfo) {
		this.itemInfo = itemInfo;
	}
	public FlowItemInfo getItemInfo( ) {
		return this.itemInfo;
	}

}
