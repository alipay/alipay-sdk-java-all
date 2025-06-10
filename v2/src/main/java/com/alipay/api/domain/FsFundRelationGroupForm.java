package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 出资关系组
 *
 * @author auto create
 * @since 1.0, 2025-05-25 11:08:06
 */
public class FsFundRelationGroupForm extends AlipayObject {

	private static final long serialVersionUID = 3686645171159366323L;

	/**
	 * 出资明细
	 */
	@ApiListField("fund_relation_details")
	@ApiField("fs_fund_relation_detail_form")
	private List<FsFundRelationDetailForm> fundRelationDetails;

	/**
	 * 出资策略：RATIO
	 */
	@ApiField("fund_strategy")
	private String fundStrategy;

	public List<FsFundRelationDetailForm> getFundRelationDetails() {
		return this.fundRelationDetails;
	}
	public void setFundRelationDetails(List<FsFundRelationDetailForm> fundRelationDetails) {
		this.fundRelationDetails = fundRelationDetails;
	}

	public String getFundStrategy() {
		return this.fundStrategy;
	}
	public void setFundStrategy(String fundStrategy) {
		this.fundStrategy = fundStrategy;
	}

}
