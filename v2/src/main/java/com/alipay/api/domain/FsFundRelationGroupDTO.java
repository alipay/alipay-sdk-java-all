package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 出资关系组
 *
 * @author auto create
 * @since 1.0, 2025-07-21 14:51:04
 */
public class FsFundRelationGroupDTO extends AlipayObject {

	private static final long serialVersionUID = 8691227793153598665L;

	/**
	 * 出资关系明细列表
	 */
	@ApiListField("fund_relation_details")
	@ApiField("fs_fund_relation_detail_d_t_o")
	private List<FsFundRelationDetailDTO> fundRelationDetails;

	/**
	 * 按照出资比例出资
	 */
	@ApiField("fund_strategy")
	private String fundStrategy;

	/**
	 * 出资组ID
	 */
	@ApiField("group_id")
	private String groupId;

	public List<FsFundRelationDetailDTO> getFundRelationDetails() {
		return this.fundRelationDetails;
	}
	public void setFundRelationDetails(List<FsFundRelationDetailDTO> fundRelationDetails) {
		this.fundRelationDetails = fundRelationDetails;
	}

	public String getFundStrategy() {
		return this.fundStrategy;
	}
	public void setFundStrategy(String fundStrategy) {
		this.fundStrategy = fundStrategy;
	}

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

}
