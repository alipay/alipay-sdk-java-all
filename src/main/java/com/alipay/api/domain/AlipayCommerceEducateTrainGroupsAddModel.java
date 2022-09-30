package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 录入机构群信息
 *
 * @author auto create
 * @since 1.0, 2020-08-06 15:50:55
 */
public class AlipayCommerceEducateTrainGroupsAddModel extends AlipayObject {

	private static final long serialVersionUID = 4363171466324473214L;

	/**
	 * 机构群id
	 */
	@ApiListField("group_ids")
	@ApiField("string")
	private List<String> groupIds;

	/**
	 * 机构id
	 */
	@ApiField("org_id")
	private String orgId;

	public List<String> getGroupIds() {
		return this.groupIds;
	}
	public void setGroupIds(List<String> groupIds) {
		this.groupIds = groupIds;
	}

	public String getOrgId() {
		return this.orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

}
