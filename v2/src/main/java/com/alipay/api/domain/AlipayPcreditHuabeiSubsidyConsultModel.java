package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 通用分期贴息咨询
 *
 * @author auto create
 * @since 1.0, 2025-12-25 10:19:59
 */
public class AlipayPcreditHuabeiSubsidyConsultModel extends AlipayObject {

	private static final long serialVersionUID = 4257412717739764349L;

	/**
	 * 贴息咨询请求参数
	 */
	@ApiListField("subsidy_aggregated_req_models")
	@ApiField("subsidy_simple_request")
	private List<SubsidySimpleRequest> subsidyAggregatedReqModels;

	public List<SubsidySimpleRequest> getSubsidyAggregatedReqModels() {
		return this.subsidyAggregatedReqModels;
	}
	public void setSubsidyAggregatedReqModels(List<SubsidySimpleRequest> subsidyAggregatedReqModels) {
		this.subsidyAggregatedReqModels = subsidyAggregatedReqModels;
	}

}
