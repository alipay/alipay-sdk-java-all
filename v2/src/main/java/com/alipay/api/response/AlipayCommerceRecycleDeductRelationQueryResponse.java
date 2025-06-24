package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RecycleDeductQueryVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.recycle.deduct.relation.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-20 18:06:17
 */
public class AlipayCommerceRecycleDeductRelationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7476966291242797117L;

	/** 
	 * 查询结果
	 */
	@ApiListField("deduct_list")
	@ApiField("recycle_deduct_query_v_o")
	private List<RecycleDeductQueryVO> deductList;

	public void setDeductList(List<RecycleDeductQueryVO> deductList) {
		this.deductList = deductList;
	}
	public List<RecycleDeductQueryVO> getDeductList( ) {
		return this.deductList;
	}

}
