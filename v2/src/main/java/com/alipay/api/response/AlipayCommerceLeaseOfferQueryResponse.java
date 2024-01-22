package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.LeasePlanOfferDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.lease.offer.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-07-11 11:07:41
 */
public class AlipayCommerceLeaseOfferQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6543517615535611681L;

	/** 
	 * 租赁商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/** 
	 * 计划sku维度报价详情
	 */
	@ApiListField("plan_offer_list")
	@ApiField("lease_plan_offer_d_t_o")
	private List<LeasePlanOfferDTO> planOfferList;

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemId( ) {
		return this.itemId;
	}

	public void setPlanOfferList(List<LeasePlanOfferDTO> planOfferList) {
		this.planOfferList = planOfferList;
	}
	public List<LeasePlanOfferDTO> getPlanOfferList( ) {
		return this.planOfferList;
	}

}
