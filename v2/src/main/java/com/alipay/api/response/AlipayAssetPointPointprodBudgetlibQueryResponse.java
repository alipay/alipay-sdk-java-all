package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BudgetLibResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.asset.point.pointprod.budgetlib.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 00:04:56
 */
public class AlipayAssetPointPointprodBudgetlibQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7387753981147896621L;

	/** 
	 * 集分宝预算库实体模型，包含预算库编码，余额等
	 */
	@ApiField("result")
	private BudgetLibResult result;

	public void setResult(BudgetLibResult result) {
		this.result = result;
	}
	public BudgetLibResult getResult( ) {
		return this.result;
	}

}
