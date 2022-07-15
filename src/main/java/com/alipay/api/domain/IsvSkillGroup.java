package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ISV定义热线技能组信息
 *
 * @author auto create
 * @since 1.0, 2020-09-27 17:33:51
 */
public class IsvSkillGroup extends AlipayObject {

	private static final long serialVersionUID = 4897659416984282993L;

	/**
	 * isv定义的热线技能组id
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * isv定义的热线技能组名称
	 */
	@ApiField("group_name")
	private String groupName;

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return this.groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

}
