package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ConditionItemPattern;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.crowdgroup.condition.set response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-09 19:25:00
 */
public class KoubeiCateringCrowdgroupConditionSetResponse extends AlipayResponse {

	private static final long serialVersionUID = 8531324291212913664L;

	/** 
	 * 创建成功返回isv创建的分组规则列表
	 */
	@ApiListField("condition_model_list")
	@ApiField("condition_item_pattern")
	private List<ConditionItemPattern> conditionModelList;

	/** 
	 * isv创建的用户分组id
	 */
	@ApiField("crowd_group_id")
	private String crowdGroupId;

	/** 
	 * 创建状态: success fail
	 */
	@ApiField("status")
	private String status;

	public void setConditionModelList(List<ConditionItemPattern> conditionModelList) {
		this.conditionModelList = conditionModelList;
	}
	public List<ConditionItemPattern> getConditionModelList( ) {
		return this.conditionModelList;
	}

	public void setCrowdGroupId(String crowdGroupId) {
		this.crowdGroupId = crowdGroupId;
	}
	public String getCrowdGroupId( ) {
		return this.crowdGroupId;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
