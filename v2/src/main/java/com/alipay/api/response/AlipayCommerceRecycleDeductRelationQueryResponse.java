package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RecycleDeductQueryVO;
import com.alipay.api.domain.RecycleDeductSignVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.recycle.deduct.relation.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-12 10:57:36
 */
public class AlipayCommerceRecycleDeductRelationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6585883498628893311L;

	/** 
	 * 查询结果
	 */
	@ApiListField("deduct_list")
	@ApiField("recycle_deduct_query_v_o")
	private List<RecycleDeductQueryVO> deductList;

	/** 
	 * 二级商户代扣协议签约状态
	 */
	@ApiListField("sign_list")
	@ApiField("recycle_deduct_sign_v_o")
	private List<RecycleDeductSignVO> signList;

	public void setDeductList(List<RecycleDeductQueryVO> deductList) {
		this.deductList = deductList;
	}
	public List<RecycleDeductQueryVO> getDeductList( ) {
		return this.deductList;
	}

	public void setSignList(List<RecycleDeductSignVO> signList) {
		this.signList = signList;
	}
	public List<RecycleDeductSignVO> getSignList( ) {
		return this.signList;
	}

}
