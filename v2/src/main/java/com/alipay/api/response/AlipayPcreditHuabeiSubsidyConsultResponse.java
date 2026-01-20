package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SubsidySimpleResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.subsidy.consult response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-19 14:17:42
 */
public class AlipayPcreditHuabeiSubsidyConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 2187665825132835229L;

	/** 
	 * 贴息咨询响应结果
	 */
	@ApiListField("subsidy_aggregated_resp_models")
	@ApiField("subsidy_simple_response")
	private List<SubsidySimpleResponse> subsidyAggregatedRespModels;

	public void setSubsidyAggregatedRespModels(List<SubsidySimpleResponse> subsidyAggregatedRespModels) {
		this.subsidyAggregatedRespModels = subsidyAggregatedRespModels;
	}
	public List<SubsidySimpleResponse> getSubsidyAggregatedRespModels( ) {
		return this.subsidyAggregatedRespModels;
	}

}
