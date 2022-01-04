package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 新增计划单元后返回信息
 *
 * @author auto create
 * @since 1.0, 2018-10-22 15:17:33
 */
public class AddPlanGroupResult extends AlipayObject {

	private static final long serialVersionUID = 3542776289623455812L;

	/**
	 * 新增计划下单元后，返回的单元ID列表
	 */
	@ApiListField("group_id_list")
	@ApiField("number")
	private List<Long> groupIdList;

	/**
	 * 新增计划后计划ID
	 */
	@ApiField("plan_id")
	private Long planId;

	public List<Long> getGroupIdList() {
		return this.groupIdList;
	}
	public void setGroupIdList(List<Long> groupIdList) {
		this.groupIdList = groupIdList;
	}

	public Long getPlanId() {
		return this.planId;
	}
	public void setPlanId(Long planId) {
		this.planId = planId;
	}

}
