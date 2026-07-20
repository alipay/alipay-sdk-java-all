package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RecyclingFarmerItemResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.recyclinginvoice.farmerproduction.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-16 16:50:43
 */
public class AlipayCommerceEcRecyclinginvoiceFarmerproductionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7148449212917696632L;

	/** 
	 * 产量记录列表
	 */
	@ApiListField("farmer_item_list")
	@ApiField("recycling_farmer_item_result")
	private List<RecyclingFarmerItemResult> farmerItemList;

	/** 
	 * 总记录数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setFarmerItemList(List<RecyclingFarmerItemResult> farmerItemList) {
		this.farmerItemList = farmerItemList;
	}
	public List<RecyclingFarmerItemResult> getFarmerItemList( ) {
		return this.farmerItemList;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
