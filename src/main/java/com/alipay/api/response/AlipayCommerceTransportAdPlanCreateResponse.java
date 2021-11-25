package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AddPlanGroupResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.ad.plan.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayCommerceTransportAdPlanCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8147887158979254287L;

	/** 
	 * 调用API新增计划后，返回的计划ID和该计划下所属的单元ID列表
	 */
	@ApiField("add_plan_group_result")
	private AddPlanGroupResult addPlanGroupResult;

	public void setAddPlanGroupResult(AddPlanGroupResult addPlanGroupResult) {
		this.addPlanGroupResult = addPlanGroupResult;
	}
	public AddPlanGroupResult getAddPlanGroupResult( ) {
		return this.addPlanGroupResult;
	}

}
