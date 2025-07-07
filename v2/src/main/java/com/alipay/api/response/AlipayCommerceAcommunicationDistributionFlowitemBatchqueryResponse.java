package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.FlowItemInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.acommunication.distribution.flowitem.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-11 14:22:05
 */
public class AlipayCommerceAcommunicationDistributionFlowitemBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8243565478115279334L;

	/** 
	 * 商品总数
	 */
	@ApiField("count")
	private Long count;

	/** 
	 * 商品列表
	 */
	@ApiListField("item_list")
	@ApiField("flow_item_info")
	private List<FlowItemInfo> itemList;

	public void setCount(Long count) {
		this.count = count;
	}
	public Long getCount( ) {
		return this.count;
	}

	public void setItemList(List<FlowItemInfo> itemList) {
		this.itemList = itemList;
	}
	public List<FlowItemInfo> getItemList( ) {
		return this.itemList;
	}

}
