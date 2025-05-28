package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RecycleRoyaltyQueryVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.recycle.royalty.relation.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-28 15:02:29
 */
public class AlipayCommerceRecycleRoyaltyRelationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4793418427896811217L;

	/** 
	 * 查询结果
	 */
	@ApiListField("royalty_list")
	@ApiField("recycle_royalty_query_v_o")
	private List<RecycleRoyaltyQueryVO> royaltyList;

	public void setRoyaltyList(List<RecycleRoyaltyQueryVO> royaltyList) {
		this.royaltyList = royaltyList;
	}
	public List<RecycleRoyaltyQueryVO> getRoyaltyList( ) {
		return this.royaltyList;
	}

}
